package ru.ifmo.se.tpl.visitors

import ru.ifmo.se.tpl.ast.*
import ru.ifmo.se.tpl.exceptions.*
import ru.ifmo.se.tpl.scopes.Scope

class TypeCheckingVisitor(programScope: Scope): ASTVisitor() {

    private var currentScope = programScope

    override fun visitFile(file: Program) {
        file.statementList.forEach { it.accept(this) }
    }

    override fun visitStatement(statement: Statement) {
        when (statement) {
            is ProcedureDeclarationStatement -> visitProcedureDeclarationStatement(statement)
            is ConditionalStatement -> visitConditionalStatement(statement)
            is BranchingStatement -> visitBranchingStatement(statement)
            is LoopStatement -> visitLoopStatement(statement)
            is VariableDeclarationStatement -> visitVariableDeclarationStatement(statement)
            is VariableAssignmentStatement -> visitVariableAssignmentStatement(statement)
            else -> visitSingleExpressionStatement(statement as SingleExpressionStatement)
        }
    }

    override fun visitProcedureDeclarationStatement(statement: ProcedureDeclarationStatement) {
        statement.declaration.accept(this)
    }

    override fun visitConditionalStatement(statement: ConditionalStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.branch.forEach { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitBranchingStatement(statement: BranchingStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.trueBranch.forEach { it.accept(this) }
        currentScope = currentScope.up()

        currentScope = currentScope.enterNext()
        statement.falseBranch.forEach { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitLoopStatement(statement: LoopStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.loopBranch.map { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitVariableDeclarationStatement(statement: VariableDeclarationStatement) {
        statement.declaration.accept(this)
    }

    override fun visitVariableAssignmentStatement(statement: VariableAssignmentStatement) {
        visitVariable(statement.variable)
        statement.variableValue.accept(this)
    }

    override fun visitSingleExpressionStatement(statement: SingleExpressionStatement) {
        statement.expression.accept(this)
    }

    override fun visitCondition(condition: Condition) {
        condition.expression.accept(this)
        if (condition.expression.type != ParameterType.BOOL) {
            throw IncompatibleTypesException("Condition must have bool type; got ${condition.expression.typeToString()}")
        }
    }

    override fun visitExpression(expression: Expression) {
        when (expression) {
            is BinaryExpression -> visitBinaryExpression(expression)
            is BranchingExpression -> visitBranchingExpression(expression)
            is ProcedureCallingExpression -> visitProcedureCallingExpression(expression)
            is SingleVariableExpression -> visitSingleVariableExpression(expression)
            is SingleLiteralExpression -> visitSingleLiteralExpression(expression)
        }
    }

    override fun visitReturnExpression(expression: Expression?) {
        if (expression != null)
            expression.accept(this)
    }

    override fun visitBinaryExpression(expression: BinaryExpression) {
        expression.left.accept(this)
        expression.right.accept(this)
        when {
            expression is LogicalExpression && expression.left.type != ParameterType.BOOL ->
                throw ExpressionException("Left part must have type bool but it has type ${expression.left.typeToString()}")
            expression is LogicalExpression && expression.right.type != ParameterType.BOOL ->
                throw ExpressionException("Right part must have type bool but it has type ${expression.right.typeToString()}")
            expression is ComparisonExpression && expression.right.type != ParameterType.NUM ->
                throw ExpressionException("Left part must have type num but it has type ${expression.left.typeToString()}")
            expression is ComparisonExpression && expression.right.type != ParameterType.NUM ->
                throw ExpressionException("Right part must have type num but it has type ${expression.right.typeToString()}")
            expression.type == ParameterType.NUM && expression.left.type != ParameterType.NUM ->
                throw ExpressionException("Expression must have type num but left part has type ${expression.left.typeToString()}")
            expression.type == ParameterType.NUM && expression.right.type != ParameterType.NUM ->
                throw ExpressionException("Expression must have type num but right part has type ${expression.right.typeToString()}")
        }
    }

    override fun visitBranchingExpression(expression: BranchingExpression) {
        expression.condition.accept(this)
        expression.trueBranch.accept(this)
        expression.falseBranch.accept(this)
        if (expression.trueBranch.type != expression.falseBranch.type)
            throw IncompatibleTypesException("Both branches of conditional expression must have the same type; got ${expression.trueBranch.typeToString()} and ${expression.falseBranch.typeToString()}")
        expression.type = expression.trueBranch.type
    }

    override fun visitProcedureCallingExpression(expression: ProcedureCallingExpression) {
        val call = expression.procedureCall
        call.accept(this)
        val appropriateDeclaration = currentScope.findDeclarationFor(expression.procedureCall) ?: throw ProcedureNotFoundException("Procedure not found: ${call.asType()}")
        expression.type = appropriateDeclaration.returnType
    }

    override fun visitSingleVariableExpression(expression: SingleVariableExpression) {
        visitVariable(expression.variable)
        expression.type = currentScope[expression.variable]!!
    }

    override fun visitSingleLiteralExpression(expression: SingleLiteralExpression) {
        visitLiteral(expression.value)
        expression.type = if (expression.value in arrayOf("true", "false")) ParameterType.BOOL else ParameterType.NUM
    }

    override fun visitProcedureDeclaration(declaration: ProcedureDeclaration) {
        currentScope = currentScope.enterNext()
        visitFunctionName(declaration.name)
        visitDeclarationArgumentsList(declaration.parameters)
        declaration.body.forEach { it.accept(this) }
        declaration.returnExpression?.accept(this)
        currentScope = currentScope.up()
        val returnExpressionType = declaration.returnExpression?.type ?: ParameterType.UNIT
        if (returnExpressionType != declaration.returnType)
            throw IncompatibleTypesException("Function declared as returning type ${returnExpressionType.programRepresentation} but returns ${declaration.returnType.programRepresentation}")
    }

    override fun visitProcedureCall(call: ProcedureCall) {
        visitFunctionName(call.name)
        visitCallArgumentsList(call.arguments)
    }

    override fun visitDeclarationArgumentsList(declarationArgumentsList: List<ProcedureParameterDeclaration>) {
        declarationArgumentsList.forEach {
            it.accept(this)
        }
    }

    override fun visitCallArgumentsList(callArgumentsList: List<ProcedureCallArgument>) {
        callArgumentsList.forEach { it.accept(this) }
    }

    override fun visitCallArgument(callArgument: ProcedureCallArgument) {
        callArgument.value.accept(this)
    }

    override fun visitFunctionName(functionName: ProcedureName) {}

    override fun visitVariableDeclaration(variableDeclaration: VariableDeclaration) {
        visitVariable(variableDeclaration.name)
        visitParameterType(variableDeclaration.type)
        variableDeclaration.value.accept(this)
        if (variableDeclaration.type != variableDeclaration.value.type)
            throw IncompatibleTypesException("Variable declared as ${variableDeclaration.type.programRepresentation}, but initializer has type ${variableDeclaration.value.type.programRepresentation}")
    }

    override fun visitParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration) {
        visitVariable(parameterDeclaration.name)
        visitParameterType(parameterDeclaration.type)
    }

    override fun visitParameterType(parameterType: ParameterType) {
    }

    override fun visitReturnParameterType(parameterType: ParameterType?) {
    }

    override fun visitVariable(variable: VariableName) {
    }

    override fun visitLiteral(literal: LiteralValue) {
    }

    private var currentScopeNumber = 0

    private fun Scope.enterNext(): Scope {
        val scopeWithNumber = nestedScopes.find { it.orderedNumber == currentScopeNumber + 1 }
        if (scopeWithNumber != null) {
            currentScopeNumber++
            return scopeWithNumber
        }
        return wrappingScope?.enterNext()!!
    }

    private fun Scope.up(): Scope = wrappingScope!!

    private fun Expression.typeToString() = type.programRepresentation
}
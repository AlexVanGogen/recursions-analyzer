package ru.ifmo.se.tpl.visitors

import ru.ifmo.se.tpl.ast.*
import ru.ifmo.se.tpl.exceptions.ProcedureAlreadyExistsException
import ru.ifmo.se.tpl.exceptions.VariableAlreadyExistsException
import ru.ifmo.se.tpl.exceptions.VariableNotFoundException
import ru.ifmo.se.tpl.scopes.Scope

class ScopingVisitor: ASTVisitor() {

    private var currentScopeNumber = 0

    val topLevelScope = Scope(orderedNumber = currentScopeNumber++)

    private val scopeStack = mutableListOf<Scope>()
    private val currentScope get() = scopeStack.last()
    private val wrappingScope get() = scopeStack.getOrNull(scopeStack.size - 2)

    override fun visitFile(file: Program) {
        scopeStack.add(topLevelScope)
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

        scopeStack.add(Scope(wrappingScope = currentScope, orderedNumber = currentScopeNumber++))
        statement.branch.forEach { it.accept(this) }
        wrappingScope?.nestedScopes?.add(currentScope)
        scopeStack.remove(currentScope)
    }

    override fun visitBranchingStatement(statement: BranchingStatement) {
        statement.condition.accept(this)

        scopeStack.add(Scope(wrappingScope = currentScope, orderedNumber = currentScopeNumber++))
        statement.trueBranch.forEach { it.accept(this) }
        wrappingScope?.nestedScopes?.add(currentScope)
        scopeStack.remove(currentScope)

        scopeStack.add(Scope(wrappingScope = currentScope, orderedNumber = currentScopeNumber++))
        statement.falseBranch.forEach { it.accept(this) }
        wrappingScope?.nestedScopes?.add(currentScope)
        scopeStack.remove(currentScope)
    }

    override fun visitLoopStatement(statement: LoopStatement) {
        statement.condition.accept(this)

        scopeStack.add(Scope(wrappingScope = currentScope, orderedNumber = currentScopeNumber++))
        statement.loopBranch.map { it.accept(this) }
        wrappingScope?.nestedScopes?.add(currentScope)
        scopeStack.remove(currentScope)
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
    }

    override fun visitBranchingExpression(expression: BranchingExpression) {
        expression.condition.accept(this)
        expression.trueBranch.accept(this)
        expression.falseBranch.accept(this)
    }

    override fun visitProcedureCallingExpression(expression: ProcedureCallingExpression) {
        expression.procedureCall.accept(this)
    }

    override fun visitSingleVariableExpression(expression: SingleVariableExpression) {
        visitVariable(expression.variable)
    }

    override fun visitSingleLiteralExpression(expression: SingleLiteralExpression) {}

    override fun visitProcedureDeclaration(declaration: ProcedureDeclaration) {
        if (declaration in currentScope)
            throw ProcedureAlreadyExistsException("Procedure already exists: ${declaration.asType()}")
        currentScope.proceduresTable.add(declaration)

        scopeStack.add(Scope(wrappingScope = currentScope, orderedNumber = currentScopeNumber++))
        currentScope.variablesTable.putAll(declaration.parameters.map { Pair(it.name, it.type) })
        declaration.body.forEach { it.accept(this) }
        declaration.returnExpression?.accept(this)
        wrappingScope?.nestedScopes?.add(currentScope)
        scopeStack.remove(currentScope)
    }

    override fun visitProcedureCall(call: ProcedureCall) {
        call.arguments.forEach { it.accept(this) }
    }

    override fun visitDeclarationArgumentsList(declarationArgumentsList: List<ProcedureParameterDeclaration>) {
    }

    override fun visitCallArgumentsList(callArgumentsList: List<ProcedureCallArgument>) {
        callArgumentsList.forEach {
            it.accept(this)
        }
    }

    override fun visitCallArgument(callArgument: ProcedureCallArgument) {
        callArgument.value.accept(this)
    }

    override fun visitFunctionName(functionName: ProcedureName) {
    }

    override fun visitParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration) {}

    override fun visitVariableDeclaration(variableDeclaration: VariableDeclaration) {
        if (variableDeclaration.name in currentScope.variablesTable)
            throw VariableAlreadyExistsException("Variable already defined: ${variableDeclaration.name}")
        currentScope.variablesTable[variableDeclaration.name] = variableDeclaration.type
        variableDeclaration.value.accept(this)
    }

    override fun visitParameterType(parameterType: ParameterType) {
    }

    override fun visitReturnParameterType(parameterType: ParameterType?) {
    }

    override fun visitVariable(variable: VariableName) {
        if (variable !in currentScope)
            throw VariableNotFoundException("Variable not found: $variable")
    }

    override fun visitLiteral(literal: LiteralValue) {
    }
}
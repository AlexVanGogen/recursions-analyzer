package ru.ifmo.se.tpl.visitors

import ru.ifmo.se.tpl.ast.*

class ASTRepresentationVisitor: ASTVisitor() {

    var indentation = 0

    override fun visitFile(file: Program) {
        printWithIndent("Program")
        indentation++
        file.statementList.forEach { visitStatement(it) }
        indentation--
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
        printWithIndent("Procedure declaration statement")
        indentation++
        statement.declaration.accept(this)
        indentation--
    }

    override fun visitConditionalStatement(statement: ConditionalStatement) {
        printWithIndent("Conditional statement")
        indentation++
        statement.condition.accept(this)
        statement.branch.forEach { it.accept(this) }
        indentation--
    }

    override fun visitBranchingStatement(statement: BranchingStatement) {
        printWithIndent("Branching statement")
        indentation++
        statement.condition.accept(this)
        statement.trueBranch.forEach { it.accept(this) }
        statement.falseBranch.forEach { it.accept(this) }
        indentation--
    }

    override fun visitLoopStatement(statement: LoopStatement) {
        printWithIndent("Loop statement")
        indentation++
        statement.condition.accept(this)
        statement.loopBranch.map { it.accept(this) }
        indentation--
    }

    override fun visitVariableDeclarationStatement(statement: VariableDeclarationStatement) {
        printWithIndent("Variable declaration statement")
        indentation++
        statement.declaration.accept(this)
        indentation--
    }

    override fun visitVariableAssignmentStatement(statement: VariableAssignmentStatement) {
        printWithIndent("Variable assignment statement")
        indentation++
        visitVariable(statement.variable)
        statement.variableValue.accept(this)
        indentation--
    }

    override fun visitSingleExpressionStatement(statement: SingleExpressionStatement) {
        printWithIndent("Single expression statement")
        indentation++
        statement.expression.accept(this)
        indentation--
    }

    override fun visitCondition(condition: Condition) {
        printWithIndent("Condition")
        indentation++
        condition.expression.accept(this)
        indentation--
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
        printWithIndent("Return expression")
        indentation++
        if (expression != null)
            expression.accept(this)
        indentation--
    }

    override fun visitBinaryExpression(expression: BinaryExpression) {
        printWithIndent("Binary expression")
        indentation++
        printWithIndent("Operation: ${expression.operation}")
        printWithIndent("Left expression")
        expression.left.accept(this)
        printWithIndent("Right expression")
        expression.right.accept(this)
        indentation--
    }

    override fun visitBranchingExpression(expression: BranchingExpression) {
        printWithIndent("Branching expression")
        indentation++
        expression.condition.accept(this)
        expression.trueBranch.accept(this)
        expression.falseBranch.accept(this)
        indentation--
    }

    override fun visitProcedureCallingExpression(expression: ProcedureCallingExpression) {
        printWithIndent("Procedure call")
        indentation++
        expression.procedureCall.accept(this)
        indentation--
    }

    override fun visitSingleVariableExpression(expression: SingleVariableExpression) {
        printWithIndent("Single variable expression")
        indentation++
        visitVariable(expression.variable)
        indentation--
    }

    override fun visitSingleLiteralExpression(expression: SingleLiteralExpression) {
        printWithIndent("Single literal expression")
        indentation++
        visitLiteral(expression.value)
        indentation--
    }

    override fun visitProcedureDeclaration(declaration: ProcedureDeclaration) {
        printWithIndent("Procedure declaration")
        indentation++
        visitFunctionName(declaration.name)
        visitDeclarationArgumentsList(declaration.parameters)
        visitReturnParameterType(declaration.returnType)
        declaration.body.forEach { it.accept(this) }
        declaration.returnExpression?.accept(this)
        indentation--
    }

    override fun visitProcedureCall(call: ProcedureCall) {
        printWithIndent("Procedure call")
        indentation++
        visitFunctionName(call.name)
        visitCallArgumentsList(call.arguments)
        indentation--
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
        printWithIndent("Call argument")
        indentation++
        callArgument.value.accept(this)
        indentation--
    }

    override fun visitFunctionName(functionName: ProcedureName) {
        printWithIndent("Name: $functionName")
    }

    override fun visitParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration) {
        printWithIndent("Parameter declaration")
        indentation++
        visitVariable(parameterDeclaration.name)
        visitParameterType(parameterDeclaration.type)
        indentation--
    }

    override fun visitVariableDeclaration(variableDeclaration: VariableDeclaration) {
        printWithIndent("Variable declaration")
        indentation++
        visitVariable(variableDeclaration.name)
        visitParameterType(variableDeclaration.type)
        variableDeclaration.value.accept(this)
        indentation--
    }

    override fun visitParameterType(parameterType: ParameterType) {
        printWithIndent("Type: ${parameterType.programRepresentation}")
    }

    override fun visitReturnParameterType(parameterType: ParameterType?) {
        printWithIndent("Type: ${parameterType?.programRepresentation}")
    }

    override fun visitVariable(variable: VariableName) {
        printWithIndent("Variable: $variable")
    }

    override fun visitLiteral(literal: LiteralValue) {
        printWithIndent("Value: $literal")
    }

    private fun printWithIndent(value: Any?) {
        println("${"\t".repeat(indentation)}$value")
    }
}
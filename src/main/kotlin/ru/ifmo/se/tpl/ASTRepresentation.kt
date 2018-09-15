package ru.ifmo.se.tpl

import ru.ifmo.se.tpl.antlr.ToylParser
import ru.ifmo.se.tpl.ast.*
import kotlin.math.exp

class ASTRepresentation {

    var indentation = 1

    fun representFile(file: Program) {
        printWithIndent("Program")
        indentation++
        file.statementList.forEach { representStatement(it) }
        indentation--
    }

    fun representStatement(statement: Statement) {
        printWithIndent("Statement")
        indentation++
        when (statement) {
            is ProcedureDeclarationStatement -> representProcedureDeclarationStatement(statement)
            is ConditionalStatement -> representConditionalStatement(statement)
            is BranchingStatement -> representBranchingStatement(statement)
            is LoopStatement -> representLoopStatement(statement)
            is VariableDeclarationStatement -> representVariableDeclarationStatement(statement)
            is VariableAssignmentStatement -> representVariableAssignmentStatement(statement)
            else -> representSingleExpressionStatement(statement as SingleExpressionStatement)
        }
        indentation--
    }

    fun representProcedureDeclarationStatement(statement: ProcedureDeclarationStatement) {
        printWithIndent("Procedure declaration statement")
        indentation++
        representProcedureDeclaration(statement.declaration)
        indentation--
    }

    fun representConditionalStatement(statement: ConditionalStatement) {
        printWithIndent("Conditional statement")
        indentation++
        representCondition(statement.condition)
        statement.branch.forEach { representStatement(it) }
        indentation--
    }

    fun representBranchingStatement(statement: BranchingStatement) {
        printWithIndent("Branching statement")
        indentation++
        representCondition(statement.condition)
        statement.trueBranch.forEach { representStatement(it) }
        statement.falseBranch.forEach { representStatement(it) }
        indentation--
    }

    fun representLoopStatement(statement: LoopStatement) {
        printWithIndent("Loop statement")
        indentation++
        representCondition(statement.condition)
        statement.loopBranch.map { representStatement(it) }
        indentation--
    }

    fun representVariableDeclarationStatement(statement: VariableDeclarationStatement) {
        printWithIndent("Variable declaration")
        indentation++
        representVariable(statement.variable)
        representExpression(statement.variableValue)
        indentation--
    }

    fun representVariableAssignmentStatement(statement: VariableAssignmentStatement) {
        printWithIndent("Variable assignment")
        indentation++
        representVariable(statement.variable)
        representExpression(statement.variableValue)
        indentation--
    }

    fun representSingleExpressionStatement(statement: SingleExpressionStatement) {
        printWithIndent("Single expression statement")
        indentation++
        representExpression(statement.expression)
        indentation--
    }

    fun representCondition(condition: Condition) {
        printWithIndent("Condition")
        indentation++
        representExpression(condition.expression)
        indentation--
    }

    fun representExpression(expression: Expression) {
        printWithIndent("Expression")
        indentation++
        when (expression) {
            is BinaryExpression -> representBinaryExpression(expression)
            is BranchingExpression -> representBranchingExpression(expression)
            is ProcedureCallingExpression -> representProcedureCallingExpression(expression)
            is SingleVariableExpression -> representSingleVariableExpression(expression)
            is SingleLiteralExpression -> representSingleLiteralExpression(expression)
        }
        indentation--
    }

    fun representReturnExpression(expression: Expression?) {
        printWithIndent("Return expression")
        indentation++
        if (expression == null) null else representExpression(expression)
        indentation--
    }

    fun representBinaryExpression(expression: BinaryExpression) {
        printWithIndent("Binary expression")
        indentation++
        printWithIndent("Operation: ${expression.operation}")
        printWithIndent("Left expression")
        representExpression(expression.left)
        printWithIndent("Right expression")
        representExpression(expression.right)
    }

    fun representBranchingExpression(expression: BranchingExpression) {
        printWithIndent("Branching expression")
        indentation++
        representCondition(expression.condition)
        representExpression(expression.trueBranch)
        representExpression(expression.falseBranch)
        indentation--
    }

    fun representProcedureCallingExpression(expression: ProcedureCallingExpression) {
        printWithIndent("Procedure call")
        indentation++
        representProcedureCall(expression.procedureCall)
        indentation--
    }

    fun representSingleVariableExpression(expression: SingleVariableExpression) {
        printWithIndent("Single variable expression")
        indentation++
        representVariable(expression.variable)
        indentation--
    }

    fun representSingleLiteralExpression(expression: SingleLiteralExpression) {
        printWithIndent("Single literal expression")
        indentation++
        representLiteral(expression.value)
        indentation--
    }

    fun representProcedureDeclaration(declaration: ProcedureDeclaration) {
        printWithIndent("Procedure declaration")
        indentation++
        representFunctionName(declaration.name)
        representDeclarationArgumentsList(declaration.parameters)
        representReturnParameterType(declaration.returnType)
        declaration.body.forEach { representStatement(it) }
        representReturnExpression(declaration.returnExpression)
        indentation--
    }

    fun representProcedureCall(call: ProcedureCall) {
        printWithIndent("Procedure call")
        indentation++
        representFunctionName(call.name)
        representCallArgumentsList(call.arguments)
        indentation--
    }

    fun representDeclarationArgumentsList(declarationArgumentsList: List<ProcedureParameterDeclaration>) {
        printWithIndent("Declaration arguments")
        indentation++
        declarationArgumentsList.forEach {
            representParameterDeclaration(it)
        }
        indentation--
    }

    fun representCallArgumentsList(callArgumentsList: List<ProcedureCallArgument>) {
        printWithIndent("Call arguments")
        indentation++
        callArgumentsList.forEach { representExpression(it.value) }
        indentation--
    }

    fun representFunctionName(functionName: ProcedureName) {
        printWithIndent(functionName)
    }

    fun representParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration) {
        printWithIndent("Parameter declaration")
        indentation++
        representVariable(parameterDeclaration.name)
        representParameterType(parameterDeclaration.type)
        indentation--
    }

    fun representParameterType(parameterType: ParameterType) {
        printWithIndent(parameterType)
    }

    fun representReturnParameterType(parameterType: ParameterType?) {
        printWithIndent(parameterType)
    }

    fun representVariable(variable: VariableName) {
        printWithIndent(variable)
    }

    fun representLiteral(literal: LiteralValue) {
        printWithIndent(literal)
    }

    private fun printWithIndent(value: Any?) {
        println("${"\t".repeat(indentation)}$value")
    }
}
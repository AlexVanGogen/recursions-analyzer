package ru.ifmo.se.tpl.visitors

import ru.ifmo.se.tpl.ast.*

abstract class ASTVisitor {
    
    abstract fun visitFile(file: Program)

    abstract fun visitStatement(statement: Statement)

    abstract fun visitProcedureDeclarationStatement(statement: ProcedureDeclarationStatement)

    abstract fun visitConditionalStatement(statement: ConditionalStatement)

    abstract fun visitBranchingStatement(statement: BranchingStatement)

    abstract fun visitLoopStatement(statement: LoopStatement)

    abstract fun visitVariableDeclarationStatement(statement: VariableDeclarationStatement)

    abstract fun visitVariableAssignmentStatement(statement: VariableAssignmentStatement)

    abstract fun visitSingleExpressionStatement(statement: SingleExpressionStatement)

    abstract fun visitCondition(condition: Condition)

    abstract fun visitExpression(expression: Expression)

    abstract fun visitReturnExpression(expression: Expression?)

    abstract fun visitBinaryExpression(expression: BinaryExpression)

    abstract fun visitBranchingExpression(expression: BranchingExpression)

    abstract fun visitProcedureCallingExpression(expression: ProcedureCallingExpression)

    abstract fun visitSingleVariableExpression(expression: SingleVariableExpression)

    abstract fun visitSingleLiteralExpression(expression: SingleLiteralExpression)

    abstract fun visitProcedureDeclaration(declaration: ProcedureDeclaration)

    abstract fun visitProcedureCall(call: ProcedureCall)

    abstract fun visitDeclarationArgumentsList(declarationArgumentsList: List<ProcedureParameterDeclaration>)

    abstract fun visitCallArgumentsList(callArgumentsList: List<ProcedureCallArgument>)

    abstract fun visitCallArgument(callArgument: ProcedureCallArgument)

    abstract fun visitFunctionName(functionName: ProcedureName)

    abstract fun visitParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration)

    abstract fun visitParameterType(parameterType: ParameterType)

    abstract fun visitReturnParameterType(parameterType: ParameterType?)

    abstract fun visitVariable(variable: VariableName)

    abstract fun visitLiteral(literal: LiteralValue)
}
package ru.ifmo.se.tpl

import ru.ifmo.se.tpl.antlr.ToylParser
import ru.ifmo.se.tpl.ast.*
import ru.ifmo.se.tpl.ast.ProcedureDeclaration
import ru.ifmo.se.tpl.ast.BinaryOperation.*
import ru.ifmo.se.tpl.exceptions.UnknownBinaryOperationException
import kotlin.math.exp

class ParserContextToAstTransformer {

    fun transformFile(file: ToylParser.FileContext) = Program(
            file.statementList().statement().map { transformStatement(it) }
    )
    
    fun transformStatement(statement: ToylParser.StatementContext): Statement =
        when {
            statement.procedureDecl() != null -> transformProcedureDeclarationStatement(statement)
            statement.condition() != null && statement.falseBranch == null && statement.loopBranch == null -> transformConditionalStatement(statement)
            statement.condition() != null && statement.falseBranch != null -> transformBranchingStatement(statement)
            statement.loopBranch != null -> transformLoopStatement(statement)
            statement.variableDecl() != null -> transformVariableDeclarationStatement(statement)
            statement.variable() != null -> transformVariableAssignmentStatement(statement)
            else -> transformSingleExpressionStatement(statement)
        }

    fun transformProcedureDeclarationStatement(statement: ToylParser.StatementContext) = ProcedureDeclarationStatement(
            transformProcedureDeclaration(statement.procedureDecl())
    )

    fun transformConditionalStatement(statement: ToylParser.StatementContext) = ConditionalStatement(
            transformCondition(statement.condition()),
            statement.trueBranch.statement().map { transformStatement(it) }
    )

    fun transformBranchingStatement(statement: ToylParser.StatementContext) = BranchingStatement(
            transformCondition(statement.condition()),
            statement.trueBranch.statement().map { transformStatement(it) },
            statement.falseBranch.statement().map { transformStatement(it) }
    )

    fun transformLoopStatement(statement: ToylParser.StatementContext) = LoopStatement(
            transformCondition(statement.condition()),
            statement.loopBranch.statement().map { transformStatement(it) }
    )

    fun transformVariableDeclarationStatement(statement: ToylParser.StatementContext) = VariableDeclarationStatement(
            transformVariableDeclaration(statement.variableDecl(), statement.expression())
    )

    fun transformVariableDeclaration(variableDeclaration: ToylParser.VariableDeclContext, expression: ToylParser.ExpressionContext) = VariableDeclaration(
            transformVariable(variableDeclaration.variable()),
            transformParameterType(variableDeclaration.variableType()),
            transformExpression(expression)
    )

    fun transformVariableAssignmentStatement(statement: ToylParser.StatementContext) = VariableAssignmentStatement(
            transformVariable(statement.variable()),
            transformExpression(statement.expression())
    )

    fun transformSingleExpressionStatement(statement: ToylParser.StatementContext) = SingleExpressionStatement(
            transformExpression(statement.expression())
    )

    fun transformCondition(condition: ToylParser.ConditionContext) = Condition(
            transformExpression(condition.expression())
    )

    fun transformExpression(expression: ToylParser.ExpressionContext): Expression =
        when {
            expression.operator != null -> transformBinaryExpression(expression)
            expression.condition() != null -> transformBranchingExpression(expression)
            expression.procedureCall() != null -> transformProcedureCallingExpression(expression)
            expression.variable() != null -> transformSingleVariableExpression(expression)
            expression.literal() != null -> transformSingleLiteralExpression(expression)
            else -> transformExpression(expression.nestedExpression)
        }

    fun transformReturnExpression(expression: ToylParser.ExpressionContext?): Expression? =
            if (expression == null) null else transformExpression(expression)

    fun transformBinaryExpression(expression: ToylParser.ExpressionContext): BinaryExpression {
        val operation = BinaryOperation.of(expression.operator.text)
        val left = transformExpression(expression.left)
        val right = transformExpression(expression.right)
        return when (operation) {
            MULT, DIV, MOD -> MultiplicationExpression(left, operation, right)
            PLUS, MINUS -> AdditionExpression(left, operation, right)
            EQ, NEQ, LT, LEQ, GT, GEQ -> ComparisonExpression(left, operation, right)
            AND, OR -> LogicalExpression(left, operation, right)
        }
    }

    fun transformBranchingExpression(expression: ToylParser.ExpressionContext) = BranchingExpression(
            transformCondition(expression.condition()),
            transformExpression(expression.trueBranch),
            transformExpression(expression.falseBranch)
    )

    fun transformProcedureCallingExpression(expression: ToylParser.ExpressionContext) = ProcedureCallingExpression(
            transformProcedureCall(expression.procedureCall())
    )

    fun transformSingleVariableExpression(expression: ToylParser.ExpressionContext) = SingleVariableExpression(
            transformVariable(expression.variable())
    )

    fun transformSingleLiteralExpression(expression: ToylParser.ExpressionContext) = SingleLiteralExpression(
            transformLiteral(expression.literal())
    )

    fun transformProcedureDeclaration(declaration: ToylParser.ProcedureDeclContext) = ProcedureDeclaration(
            transformFunctionName(declaration.functionName()),
            transformDeclarationArgumentsList(declaration.declArgumentsList()),
            transformReturnParameterType(declaration.variableType()),
            declaration.statementList().statement().map { transformStatement(it) },
            transformReturnExpression(declaration.expression())
    )

    fun transformProcedureCall(call: ToylParser.ProcedureCallContext) = ProcedureCall(
            transformFunctionName(call.functionName()),
            transformCallArgumentsList(call.callArgumentsList())
    )

    fun transformDeclarationArgumentsList(declarationArgumentsList: ToylParser.DeclArgumentsListContext): List<ProcedureParameterDeclaration> =
            declarationArgumentsList.parameterDecl().map {
        ProcedureParameterDeclaration(transformVariable(it.variable()), transformParameterType(it.variableType()))
    }

    fun transformCallArgumentsList(callArgumentsList: ToylParser.CallArgumentsListContext): List<ProcedureCallArgument> =
            callArgumentsList.expression().map { ProcedureCallArgument(transformExpression(it)) }

    fun transformFunctionName(functionName: ToylParser.FunctionNameContext): ProcedureName = functionName.text

    fun transformParameterDeclaration(parameterDeclaration: ToylParser.ParameterDeclContext) = ProcedureParameterDeclaration(
            transformVariable(parameterDeclaration.variable()),
            transformParameterType(parameterDeclaration.variableType())
    )

    fun transformParameterType(parameterType: ToylParser.VariableTypeContext?): ParameterType =
            when (parameterType?.text) {
                "num" -> ParameterType.NUM
                "bool" -> ParameterType.BOOL
                else -> ParameterType.UNIT
            }

    fun transformReturnParameterType(parameterType: ToylParser.VariableTypeContext?): ParameterType =
            if (parameterType == null) ParameterType.UNIT else transformParameterType(parameterType)

    fun transformVariable(variable: ToylParser.VariableContext): VariableName = variable.text

    fun transformLiteral(literal: ToylParser.LiteralContext): LiteralValue = literal.text
}
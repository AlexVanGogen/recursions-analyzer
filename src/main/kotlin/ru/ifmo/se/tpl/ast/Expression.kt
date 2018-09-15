package ru.ifmo.se.tpl.ast

sealed class Expression

sealed class BinaryExpression(
        open val left: Expression,
        open val operation: BinaryOperation,
        open val right: Expression
): Expression()

class MultiplicationExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right)

class AdditionExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right)

class LogicalExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right)

class ComparisonExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right)

class BranchingExpression(
        val condition: Condition,
        val trueBranch: Expression,
        val falseBranch: Expression
): Expression()

class ProcedureCallingExpression(
        val procedureCall: ProcedureCall
): Expression()

class SingleVariableExpression(
        val variable: VariableName
): Expression()

class SingleLiteralExpression(
        val value: LiteralValue
): Expression()
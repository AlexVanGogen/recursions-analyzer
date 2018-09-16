package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

sealed class Expression: AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitExpression(this)
    }
}

sealed class BinaryExpression(
        open val left: Expression,
        open val operation: BinaryOperation,
        open val right: Expression
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitBinaryExpression(this)
    }
}

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
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitBranchingExpression(this)
    }
}

class ProcedureCallingExpression(
        val procedureCall: ProcedureCall
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitProcedureCallingExpression(this)
    }
}

class SingleVariableExpression(
        val variable: VariableName
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitSingleVariableExpression(this)
    }
}

class SingleLiteralExpression(
        val value: LiteralValue
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitSingleLiteralExpression(this)
    }
}
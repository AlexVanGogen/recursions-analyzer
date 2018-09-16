package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

interface Typed {
    val type: ParameterType
}

sealed class Expression: AcceptableElement, Typed {
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
): BinaryExpression(left, operation, right) {
    override val type get() = ParameterType.NUM
}

class AdditionExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right) {
    override val type get() = ParameterType.NUM
}

class LogicalExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right) {
    override val type get() = ParameterType.BOOL
}

class ComparisonExpression(
        override val left: Expression,
        override val operation: BinaryOperation,
        override val right: Expression
): BinaryExpression(left, operation, right) {
    override val type get() = ParameterType.BOOL
}

class BranchingExpression(
        val condition: Condition,
        val trueBranch: Expression,
        val falseBranch: Expression
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitBranchingExpression(this)
    }

    override var type = trueBranch.type
}

class ProcedureCallingExpression(
        val procedureCall: ProcedureCall
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitProcedureCallingExpression(this)
    }

    override var type = ParameterType.UNIT
}

class SingleVariableExpression(
        val variable: VariableName
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitSingleVariableExpression(this)
    }

    override var type = ParameterType.UNIT
}

class SingleLiteralExpression(
        val value: LiteralValue
): Expression() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitSingleLiteralExpression(this)
    }

    override var type = ParameterType.UNIT
}
package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

typealias StatementList = List<Statement>

sealed class Statement: AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitStatement(this)
    }
}

class ProcedureDeclarationStatement(
        val declaration: ProcedureDeclaration
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitProcedureDeclarationStatement(this)
    }
}

class ConditionalStatement(
        val condition: Condition,
        val branch: StatementList
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitConditionalStatement(this)
    }
}

class BranchingStatement(
        val condition: Condition,
        val trueBranch: StatementList,
        val falseBranch: StatementList
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitBranchingStatement(this)
    }
}

class LoopStatement(
        val condition: Condition,
        val loopBranch: StatementList
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitLoopStatement(this)
    }
}

class VariableDeclarationStatement(
        val variable: VariableName,
        val variableValue: Expression
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitVariableDeclarationStatement(this)
    }
}

class VariableAssignmentStatement(
        val variable: VariableName,
        val variableValue: Expression
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitVariableAssignmentStatement(this)
    }
}

class SingleExpressionStatement(
        val expression: Expression
): Statement() {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitSingleExpressionStatement(this)
    }
}
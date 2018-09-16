package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class VariableDeclaration(
        val name: VariableName,
        val type: ParameterType,
        val value: Expression
): AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitVariableDeclaration(this)
    }
}
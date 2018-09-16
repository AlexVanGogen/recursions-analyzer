package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class ProcedureCallArgument(
        val value: Expression
): AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitCallArgument(this)
    }
}
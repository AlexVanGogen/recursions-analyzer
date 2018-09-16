package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class Condition(
        val expression: Expression
): AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitCondition(this)
    }
}
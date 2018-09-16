package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class Program(
    val statementList: List<Statement>
): AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitFile(this)
    }
}
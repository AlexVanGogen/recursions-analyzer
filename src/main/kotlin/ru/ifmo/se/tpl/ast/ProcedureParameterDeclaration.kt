package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class ProcedureParameterDeclaration(
        val name: ParameterName,
        val type: ParameterType
): AcceptableElement {
    override fun accept(visitor: ASTVisitor) {
        visitor.visitParameterDeclaration(this)
    }
}
package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class ProcedureCall(
        val name: ProcedureName,
        val arguments: List<ProcedureCallArgument>
): AcceptableElement {

    override fun accept(visitor: ASTVisitor) {
        visitor.visitProcedureCall(this)
    }

    fun asType(): String = "$name${arguments.joinToString(",", "(", ")") { it.value.type.programRepresentation }}"
}
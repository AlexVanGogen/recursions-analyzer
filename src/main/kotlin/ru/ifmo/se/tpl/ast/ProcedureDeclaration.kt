package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

class ProcedureDeclaration(
        val name: ProcedureName,
        val parameters: List<ProcedureParameterDeclaration>,
        val returnType: ParameterType,
        val body: List<Statement>,
        val returnExpression: Expression?
): AcceptableElement {

    override fun accept(visitor: ASTVisitor) {
        visitor.visitProcedureDeclaration(this)
    }

    fun asType(): String = "$name${parameters.joinToString(", ", "(", ")") { it.type.programRepresentation }}"
}
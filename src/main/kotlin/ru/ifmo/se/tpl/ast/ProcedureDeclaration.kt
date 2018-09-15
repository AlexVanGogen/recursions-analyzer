package ru.ifmo.se.tpl.ast

class ProcedureDeclaration(
        val name: ProcedureName,
        val parameters: List<ProcedureParameterDeclaration>,
        val returnType: ParameterType?,
        val body: List<Statement>,
        val returnExpression: Expression?
)
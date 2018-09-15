package ru.ifmo.se.tpl.ast

class ProcedureCall(
        val name: ProcedureName,
        val arguments: List<ProcedureCallArgument>
)
package ru.ifmo.se.tpl.graph

import ru.ifmo.se.tpl.ast.ProcedureCall
import ru.ifmo.se.tpl.ast.ProcedureDeclaration

typealias CallsInsideProcedure = Pair<ProcedureDeclaration, List<ProcedureCall>>

class ProcedureCallGraph(
        val calls: List<CallsInsideProcedure>
) {
    fun print() {
        calls.forEach { (declaration, nestedCalls) ->
            println("${declaration.name}${declaration.parameters.map { it.type }} calls ${nestedCalls.map { it.name + it.arguments.map { a -> a.value.type } }}")
        }
    }
}
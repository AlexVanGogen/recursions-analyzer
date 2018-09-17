package ru.ifmo.se.tpl.graph

import ru.ifmo.se.tpl.ast.ProcedureCall
import ru.ifmo.se.tpl.ast.ProcedureDeclaration

typealias CallsInsideProcedure = Pair<ProcedureDeclaration, List<ProcedureCall>>
typealias CallToDeclarationMap = Map<ProcedureCall, ProcedureDeclaration>

class ProcedureCallGraph(
        val calls: List<CallsInsideProcedure>,
        val callToDeclarationMapping: CallToDeclarationMap
) {

    operator fun get(procedureDeclaration: ProcedureDeclaration) = calls.find { (declaration, _) -> declaration === procedureDeclaration }?.second
    operator fun get(index: Int) = calls.getOrNull(index)

    fun print() {
        calls.forEach { (declaration, nestedCalls) ->
            println("${declaration.asType()} calls ${nestedCalls.map { it.asType() }}")
        }
    }
}
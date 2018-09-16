package ru.ifmo.se.tpl.graph

import ru.ifmo.se.tpl.ast.ProcedureDeclaration

class ProceduresRecursion(
        val proceduresStack: List<ProcedureDeclaration>,
        val repeatingProcedure: ProcedureDeclaration
) {

    fun print() {
        val callChainToCycle = proceduresStack.takeWhile { it !== repeatingProcedure }
        val cycle = proceduresStack.takeLastWhile { it !== repeatingProcedure }
        println("Recursion found: " +
                "${repeatingProcedure.asType()}${cycle.joinToString(" -> ", " -> ", if (cycle.isEmpty()) "" else " -> ") { it.asType() }}${repeatingProcedure.asType()}" +
                "\t[chain: ${if (callChainToCycle.isEmpty()) "-" else callChainToCycle.joinToString(" -> ") { it.asType() } + " -> " + repeatingProcedure.asType()}]")
    }
}
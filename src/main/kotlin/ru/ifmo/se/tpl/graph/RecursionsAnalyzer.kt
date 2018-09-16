package ru.ifmo.se.tpl.graph

import ru.ifmo.se.tpl.ast.ProcedureDeclaration

class RecursionsAnalyzer(
        val procedureCallGraph: ProcedureCallGraph
) {

    fun run() {
        for (declaration in procedureCallGraph.calls.map { it.first }) {
            if (declaration !in visitedProcedures)
                dfs(declaration)
        }
    }

    private fun dfs(declaration: ProcedureDeclaration) {
        if (declaration in currentNestedProceduresStack) {
            ProceduresRecursion(currentNestedProceduresStack, declaration).print()
            return
        }
        currentNestedProceduresStack.add(declaration)
        for (callingProcedure in procedureCallGraph[declaration]!!.map { procedureCallGraph.callToDeclarationMapping[it]!! })
            dfs(callingProcedure)
        currentNestedProceduresStack.remove(declaration)
        visitedProcedures.add(declaration)
    }

    fun representStack(): String = currentNestedProceduresStack.joinToString(" -> ") { it.asType() }

    private val visitedProcedures = mutableSetOf<ProcedureDeclaration>()

    private val currentNestedProceduresStack = mutableListOf<ProcedureDeclaration>()

}
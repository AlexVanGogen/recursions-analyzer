package ru.ifmo.se.tpl

import ru.ifmo.se.tpl.ast.Program
import ru.ifmo.se.tpl.graph.RecursionsAnalyzer
import ru.ifmo.se.tpl.visitors.ProcedureCallGraphMakingVisitor
import ru.ifmo.se.tpl.visitors.ScopingVisitor
import ru.ifmo.se.tpl.visitors.TypeCheckingVisitor

class RecursionAnalyzerFacade {

    fun run(program: Program) {
        val scopingVisitor = ScopingVisitor()
        program.accept(scopingVisitor)
        program.accept(TypeCheckingVisitor(scopingVisitor.topLevelScope))

        val procedureCallGraphMakingVisitor = ProcedureCallGraphMakingVisitor(scopingVisitor.topLevelScope)
        program.accept(procedureCallGraphMakingVisitor)
        val graph = procedureCallGraphMakingVisitor.makeProcedureCallGraph()
        RecursionsAnalyzer(graph).run()
    }
}
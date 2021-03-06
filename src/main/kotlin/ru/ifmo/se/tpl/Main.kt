package ru.ifmo.se.tpl

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.ifmo.se.tpl.antlr.ToylLexer
import ru.ifmo.se.tpl.antlr.ToylParser
import ru.ifmo.se.tpl.exceptions.LanguageException
import ru.ifmo.se.tpl.graph.RecursionsAnalyzer
import ru.ifmo.se.tpl.visitors.ASTRepresentationVisitor
import ru.ifmo.se.tpl.visitors.ProcedureCallGraphMakingVisitor
import ru.ifmo.se.tpl.visitors.ScopingVisitor
import ru.ifmo.se.tpl.visitors.TypeCheckingVisitor

class ParserFactory {
    companion object {
        fun fromFile(codeFile: String) = ToylParser(CommonTokenStream(ToylLexer(CharStreams.fromFileName(codeFile))))
    }
}

fun help() {
    println("Usage:")
    println("\t-a <file> -- show AST of program")
    println("\t-r <file> -- show (mutual)recursive procedures in program")
}

fun main(args: Array<String>) {
    try {
        val command = args[0]
        val parser = ParserFactory.fromFile(args[1])
        val program = ParserContextToAstTransformer().transformFile(parser.file())

        when (command) {
            "-a" -> program.accept(ASTRepresentationVisitor())
            "-r" -> RecursionAnalyzerFacade().run(program)
        }

    } catch (e: IndexOutOfBoundsException) {
        help()
        return
    } catch (e: java.nio.file.NoSuchFileException) {
        println("${args[1]}: file not found")
        return
    } catch (e: LanguageException) {
        println("Error: ${e.message}")
        return
    } catch (e: IllegalStateException) {
        println("Error: ${e.message}")
        return
    }
}
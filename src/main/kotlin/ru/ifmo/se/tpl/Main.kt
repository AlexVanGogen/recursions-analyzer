package ru.ifmo.se.tpl

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.ifmo.se.tpl.antlr.ToylLexer
import ru.ifmo.se.tpl.antlr.ToylParser
import ru.ifmo.se.tpl.visitors.ASTRepresentationVisitor
import ru.ifmo.se.tpl.visitors.ScopingVisitor
import ru.ifmo.se.tpl.visitors.TypeCheckingVisitor

class ParserFactory {
    companion object {
        fun fromFile(codeFile: String) = ToylParser(CommonTokenStream(ToylLexer(CharStreams.fromFileName(codeFile))))
    }
}

fun main(args: Array<String>) {
    try {
        val parser = ParserFactory.fromFile(args[0])
        val program = ParserContextToAstTransformer().transformFile(parser.file())
        program.accept(ASTRepresentationVisitor())
        val scopingVisitor = ScopingVisitor()
        program.accept(scopingVisitor)
        scopingVisitor.topLevelScope.print()
        program.accept(TypeCheckingVisitor(scopingVisitor.topLevelScope))
    } catch (e: IndexOutOfBoundsException) {
        return
    } catch (e: java.nio.file.NoSuchFileException) {
        println("${args[1]}: file not found")
        return
    }
}
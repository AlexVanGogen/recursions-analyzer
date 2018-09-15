package ru.ifmo.se.tpl

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import ru.ifmo.se.tpl.antlr.ToylLexer
import ru.ifmo.se.tpl.antlr.ToylParser

class ParserFactory {
    companion object {
        fun fromFile(codeFile: String) = ToylParser(CommonTokenStream(ToylLexer(CharStreams.fromFileName(codeFile))))
    }
}

fun main(args: Array<String>) {
    try {
        val parser = ParserFactory.fromFile(args[0])
        val program = ParserContextToAstTransformer().transformFile(parser.file())
        ASTRepresentation().representFile(program)
    } catch (e: IndexOutOfBoundsException) {
        return
    } catch (e: java.nio.file.NoSuchFileException) {
        println("${args[1]}: file not found")
        return
    }
}
package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.exceptions.UnknownBinaryOperationException

enum class BinaryOperation(private val signature: String) {
    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/"),
    MOD("%"),
    EQ("=="),
    NEQ("!="),
    LT("<"),
    LEQ("<="),
    GT(">"),
    GEQ(">="),
    AND("&&"),
    OR("||");

    companion object {
        fun of(operator: String) = values().find { it.signature == operator }
                ?: throw UnknownBinaryOperationException("Unknown operator: $operator")
    }
}
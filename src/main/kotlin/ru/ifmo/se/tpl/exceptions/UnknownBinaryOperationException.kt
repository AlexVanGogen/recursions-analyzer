package ru.ifmo.se.tpl.exceptions

class UnknownBinaryOperationException(override val message: String): IllegalStateException(message)
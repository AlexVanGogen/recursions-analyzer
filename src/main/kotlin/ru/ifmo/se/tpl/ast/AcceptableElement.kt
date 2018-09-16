package ru.ifmo.se.tpl.ast

import ru.ifmo.se.tpl.visitors.ASTVisitor

interface AcceptableElement {
    fun accept(visitor: ASTVisitor)
}
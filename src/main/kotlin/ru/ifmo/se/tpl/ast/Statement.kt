package ru.ifmo.se.tpl.ast

typealias StatementList = List<Statement>

sealed class Statement

class ProcedureDeclarationStatement(
        val declaration: ProcedureDeclaration
): Statement()

class ConditionalStatement(
        val condition: Condition,
        val branch: StatementList
): Statement()

class BranchingStatement(
        val condition: Condition,
        val trueBranch: StatementList,
        val falseBranch: StatementList
): Statement()

class LoopStatement(
        val condition: Condition,
        val loopBranch: StatementList
): Statement()

class VariableDeclarationStatement(
        val variable: VariableName,
        val variableValue: Expression
): Statement()

class VariableAssignmentStatement(
        val variable: VariableName,
        val variableValue: Expression
): Statement()

class SingleExpressionStatement(
        val expression: Expression
): Statement()
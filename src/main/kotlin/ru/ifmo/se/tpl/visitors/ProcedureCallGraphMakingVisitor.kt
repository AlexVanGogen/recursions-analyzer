package ru.ifmo.se.tpl.visitors

import ru.ifmo.se.tpl.ast.*
import ru.ifmo.se.tpl.graph.ProcedureCallGraph
import ru.ifmo.se.tpl.scopes.Scope

class ProcedureCallGraphMakingVisitor(val programScope: Scope): ASTVisitor() {

    private val calls: MutableList<Pair<ProcedureDeclaration, MutableList<ProcedureCall>>> = mutableListOf()

    init {
        programScope.addDeclarationsToGraph()
    }

    fun makeProcedureCallGraph() = ProcedureCallGraph(calls)

    private val nestedProceduresStack = mutableListOf<ProcedureDeclaration>()
    private val currentProcedureDeclaration get() = nestedProceduresStack.lastOrNull()

    private var currentScope = programScope

    override fun visitFile(file: Program) {
        file.statementList.forEach { it.accept(this) }
    }

    override fun visitStatement(statement: Statement) {
        when (statement) {
            is ProcedureDeclarationStatement -> visitProcedureDeclarationStatement(statement)
            is ConditionalStatement -> visitConditionalStatement(statement)
            is BranchingStatement -> visitBranchingStatement(statement)
            is LoopStatement -> visitLoopStatement(statement)
            is VariableDeclarationStatement -> visitVariableDeclarationStatement(statement)
            is VariableAssignmentStatement -> visitVariableAssignmentStatement(statement)
            else -> visitSingleExpressionStatement(statement as SingleExpressionStatement)
        }
    }

    override fun visitProcedureDeclarationStatement(statement: ProcedureDeclarationStatement) {
        statement.declaration.accept(this)
    }

    override fun visitConditionalStatement(statement: ConditionalStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.branch.forEach { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitBranchingStatement(statement: BranchingStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.trueBranch.forEach { it.accept(this) }
        currentScope = currentScope.up()

        currentScope = currentScope.enterNext()
        statement.falseBranch.forEach { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitLoopStatement(statement: LoopStatement) {
        statement.condition.accept(this)

        currentScope = currentScope.enterNext()
        statement.loopBranch.map { it.accept(this) }
        currentScope = currentScope.up()
    }

    override fun visitVariableDeclarationStatement(statement: VariableDeclarationStatement) {
        statement.declaration.accept(this)
    }

    override fun visitVariableAssignmentStatement(statement: VariableAssignmentStatement) {
        visitVariable(statement.variable)
        statement.variableValue.accept(this)
    }

    override fun visitSingleExpressionStatement(statement: SingleExpressionStatement) {
        statement.expression.accept(this)
    }

    override fun visitCondition(condition: Condition) {
        condition.expression.accept(this)
    }

    override fun visitExpression(expression: Expression) {
        when (expression) {
            is BinaryExpression -> visitBinaryExpression(expression)
            is BranchingExpression -> visitBranchingExpression(expression)
            is ProcedureCallingExpression -> visitProcedureCallingExpression(expression)
            is SingleVariableExpression -> visitSingleVariableExpression(expression)
            is SingleLiteralExpression -> visitSingleLiteralExpression(expression)
        }
    }

    override fun visitReturnExpression(expression: Expression?) {
        if (expression != null)
            expression.accept(this)
    }

    override fun visitBinaryExpression(expression: BinaryExpression) {
        expression.left.accept(this)
        expression.right.accept(this)
    }

    override fun visitBranchingExpression(expression: BranchingExpression) {
        expression.condition.accept(this)
        expression.trueBranch.accept(this)
        expression.falseBranch.accept(this)
    }

    override fun visitProcedureCallingExpression(expression: ProcedureCallingExpression) {
        expression.procedureCall.accept(this)
    }

    override fun visitSingleVariableExpression(expression: SingleVariableExpression) {}

    override fun visitSingleLiteralExpression(expression: SingleLiteralExpression) {}

    override fun visitProcedureDeclaration(declaration: ProcedureDeclaration) {
        nestedProceduresStack.add(declaration)
        currentScope = currentScope.enterNext()
        declaration.body.forEach { it.accept(this) }
        declaration.returnExpression?.accept(this)
        currentScope = currentScope.up()
        nestedProceduresStack.remove(declaration)
    }

    override fun visitProcedureCall(call: ProcedureCall) {
        calls.find { (declaration, _) -> currentProcedureDeclaration === declaration }?.second?.add(call)
        call.arguments.forEach { it.accept(this) }
    }

    override fun visitDeclarationArgumentsList(declarationArgumentsList: List<ProcedureParameterDeclaration>) {}

    override fun visitCallArgumentsList(callArgumentsList: List<ProcedureCallArgument>) {
        callArgumentsList.forEach { it.accept(this) }
    }

    override fun visitCallArgument(callArgument: ProcedureCallArgument) {
        callArgument.value.accept(this)
    }

    override fun visitFunctionName(functionName: ProcedureName) {}

    override fun visitVariableDeclaration(variableDeclaration: VariableDeclaration) {
        variableDeclaration.value.accept(this)
    }

    override fun visitParameterDeclaration(parameterDeclaration: ProcedureParameterDeclaration) {}

    override fun visitParameterType(parameterType: ParameterType) {}

    override fun visitReturnParameterType(parameterType: ParameterType?) {}

    override fun visitVariable(variable: VariableName) {}

    override fun visitLiteral(literal: LiteralValue) {}

    private var currentScopeNumber = 0

    private fun Scope.enterNext(): Scope {
        val scopeWithNumber = nestedScopes.find { it.orderedNumber == currentScopeNumber + 1 }
        if (scopeWithNumber != null) {
            currentScopeNumber++
            return scopeWithNumber
        }
        return wrappingScope?.enterNext()!!
    }

    private fun Scope.up(): Scope = wrappingScope!!

    private fun Scope.addDeclarationsToGraph() {
        calls.addAll(proceduresTable.map { Pair(it, mutableListOf<ProcedureCall>()) })
        nestedScopes.forEach { it.addDeclarationsToGraph() }
    }
}
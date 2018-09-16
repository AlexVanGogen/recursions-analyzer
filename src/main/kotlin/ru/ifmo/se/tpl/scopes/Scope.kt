package ru.ifmo.se.tpl.scopes

import ru.ifmo.se.tpl.ast.*

class Scope(
        val variablesTable: MutableMap<VariableName, ParameterType> = mutableMapOf(),
        val proceduresTable: MutableSet<ProcedureDeclaration> = mutableSetOf(),
        val wrappingScope: Scope? = null,
        val nestedScopes: MutableList<Scope> = mutableListOf(),
        val orderedNumber: Int
) {

    operator fun contains(variable: VariableName): Boolean = variable in variablesTable || (wrappingScope?.contains(variable) == true)

    operator fun contains(procedureDeclaration: ProcedureDeclaration): Boolean =
        proceduresTable.any {
             it.name == procedureDeclaration.name
                && it.parameters.size == procedureDeclaration.parameters.size
                && it.parameters.zip(procedureDeclaration.parameters).all { (a, b) -> a.type == b.type }
        } || (wrappingScope?.contains(procedureDeclaration) == true)

    fun print(indent: Int = 0) {
        println("${"\t".repeat(indent)}Variables: [${variablesTable.entries.joinToString { (k, v) -> "$k: ${v.programRepresentation}" }}]")
        println("${"\t".repeat(indent)}Procedures: [${proceduresTable.joinToString { it.asType() }}]")
        nestedScopes.forEach { it.print(indent + 1) }
    }

    fun findDeclarationFor(call: ProcedureCall): ProcedureDeclaration? = proceduresTable.find {
        it.name == call.name && it.parameters.size == call.arguments.size && it.parameters.zip(call.arguments).all { (p, a) -> p.type == a.value.type }
    } ?: wrappingScope?.findDeclarationFor(call)

    operator fun get(variable: VariableName): ParameterType? = variablesTable.get(variable) ?: wrappingScope?.get(variable)
}
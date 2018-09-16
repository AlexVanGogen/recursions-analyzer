package ru.ifmo.se.tpl.scopes

import ru.ifmo.se.tpl.ast.*

class Scope(
        val variablesTable: MutableMap<VariableName, ParameterType> = mutableMapOf(),
        val proceduresTable: MutableMap<ProcedureName, List<ParameterType>> = mutableMapOf(),
        val wrappingScope: Scope? = null,
        val nestedScopes: MutableList<Scope> = mutableListOf()
) {

    operator fun contains(variable: VariableName): Boolean = variable in variablesTable || (wrappingScope?.contains(variable) == true)

    operator fun contains(procedureDeclaration: ProcedureDeclaration): Boolean =
        proceduresTable.any {
            (k, v) -> k == procedureDeclaration.name
                && v.size == procedureDeclaration.parameters.size
                && v.zip(procedureDeclaration.parameters).all { (a, b) -> a == b.type }
        } || (wrappingScope?.contains(procedureDeclaration) == true)

    fun print(indent: Int = 0) {
        println("${"\t".repeat(indent)}Variables: [${variablesTable.entries.joinToString { (k, v) -> "$k: $v" }}]")
        println("${"\t".repeat(indent)}Procedures: [${proceduresTable.entries.joinToString { (k, v) -> "$k($v)" }}]")
        nestedScopes.forEach { it.print(indent + 1) }
    }
//    fun findDeclarationFor(call: ProcedureCall) = proceduresTable.find {
//        it.name == call.name && it.parameters.size == call.arguments.size && it.parameters.zip(call.arguments).all { (p, a) -> p.type == a.value.returnType }
//    } ?: findDeclaration(wrappingScope)
}
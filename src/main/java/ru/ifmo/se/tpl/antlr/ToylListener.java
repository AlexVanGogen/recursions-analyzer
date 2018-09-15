// Generated from /Users/alexvangogen/Fall/other/type-inference/recursions-analyzer/src/main/kotlin/ru/ifmo/se/tpl/antlr/Toyl.g4 by ANTLR 4.7
package ru.ifmo.se.tpl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToylParser}.
 */
public interface ToylListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToylParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ToylParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ToylParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ToylParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ToylParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ToylParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ToylParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ToylParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ToylParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ToylParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ToylParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#procedureDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDecl(ToylParser.ProcedureDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#procedureDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDecl(ToylParser.ProcedureDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(ToylParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(ToylParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#declArgumentsList}.
	 * @param ctx the parse tree
	 */
	void enterDeclArgumentsList(ToylParser.DeclArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#declArgumentsList}.
	 * @param ctx the parse tree
	 */
	void exitDeclArgumentsList(ToylParser.DeclArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#callArgumentsList}.
	 * @param ctx the parse tree
	 */
	void enterCallArgumentsList(ToylParser.CallArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#callArgumentsList}.
	 * @param ctx the parse tree
	 */
	void exitCallArgumentsList(ToylParser.CallArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(ToylParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(ToylParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(ToylParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(ToylParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(ToylParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(ToylParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ToylParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ToylParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToylParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ToylParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToylParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ToylParser.LiteralContext ctx);
}
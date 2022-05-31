// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example2Parser#start2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart2(Example2Parser.Start2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Example2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVariable}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable(Example2Parser.AssignVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Example2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(Example2Parser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Example2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlStatement}
	 * labeled alternative in {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlStatement(Example2Parser.UrlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(Example2Parser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(Example2Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(Example2Parser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVariable}
	 * labeled alternative in {@link Example2Parser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVariable(Example2Parser.PrintVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link Example2Parser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(Example2Parser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(Example2Parser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBool}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBool(Example2Parser.ValueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(Example2Parser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Example2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link Example2Parser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(Example2Parser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssignValue}
	 * labeled alternative in {@link Example2Parser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignValue(Example2Parser.IntAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssignment}
	 * labeled alternative in {@link Example2Parser#bool_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssignment(Example2Parser.BoolAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssignValue}
	 * labeled alternative in {@link Example2Parser#bool_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssignValue(Example2Parser.BoolAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link Example2Parser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(Example2Parser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignValue}
	 * labeled alternative in {@link Example2Parser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignValue(Example2Parser.StringAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(Example2Parser.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(Example2Parser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB(Example2Parser.SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariable(Example2Parser.ValueVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValueExpr}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValueExpr(Example2Parser.StringValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL(Example2Parser.MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQUALCheck}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQUALCheck(Example2Parser.EQUALCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(Example2Parser.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POW}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOW(Example2Parser.POWContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FACT}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFACT(Example2Parser.FACTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parents}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParents(Example2Parser.ParentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#numberA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberA(Example2Parser.NumberAContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#numberB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberB(Example2Parser.NumberBContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#numberC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberC(Example2Parser.NumberCContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#numberD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberD(Example2Parser.NumberDContext ctx);
}
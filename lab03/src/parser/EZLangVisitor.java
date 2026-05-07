// Generated from EZLang.g by ANTLR 4.13.2

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EZLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EZLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EZLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EZLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#vars_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars_sect(EZLangParser.Vars_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(EZLangParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(EZLangParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#stmt_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_sect(EZLangParser.Stmt_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(EZLangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(EZLangParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(EZLangParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(EZLangParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#repeat_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stmt(EZLangParser.Repeat_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZLangParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(EZLangParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRealVal}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRealVal(EZLangParser.ExprRealValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesOver}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOver(EZLangParser.TimesOverContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(EZLangParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStrVal}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStrVal(EZLangParser.ExprStrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(EZLangParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(EZLangParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(EZLangParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntVal}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntVal(EZLangParser.ExprIntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqLt}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqLt(EZLangParser.EqLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link EZLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(EZLangParser.ExprTrueContext ctx);
}
// Generated from /home/rtgomes/compilers/lab02/ex04/Exemplo04.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Exemplo04Parser}.
 */
public interface Exemplo04Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Exemplo04Parser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(Exemplo04Parser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link Exemplo04Parser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(Exemplo04Parser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link Exemplo04Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Exemplo04Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Exemplo04Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Exemplo04Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Exemplo04Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(Exemplo04Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Exemplo04Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(Exemplo04Parser.OpContext ctx);
}
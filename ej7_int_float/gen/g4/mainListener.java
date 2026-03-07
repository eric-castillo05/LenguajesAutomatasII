// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej7_int_float/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(mainParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(mainParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(mainParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(mainParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(mainParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(mainParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(mainParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(mainParser.SemicolonContext ctx);
}
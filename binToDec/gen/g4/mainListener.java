// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/binToDec/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link mainParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(mainParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(mainParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#nb}.
	 * @param ctx the parse tree
	 */
	void enterNb(mainParser.NbContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#nb}.
	 * @param ctx the parse tree
	 */
	void exitNb(mainParser.NbContext ctx);
}
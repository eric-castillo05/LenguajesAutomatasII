// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej5_atributos/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link mainParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(mainParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(mainParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(mainParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(mainParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(mainParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(mainParser.TermContext ctx);
}
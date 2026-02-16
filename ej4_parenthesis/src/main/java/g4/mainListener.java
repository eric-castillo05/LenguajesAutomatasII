// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej4_parenthesis/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void enterEXP(mainParser.EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void exitEXP(mainParser.EXPContext ctx);
}
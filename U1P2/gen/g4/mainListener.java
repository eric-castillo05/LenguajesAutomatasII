// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/U1P2/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link mainParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDEC(mainParser.DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link mainParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDEC(mainParser.DECContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COND}
	 * labeled alternative in {@link mainParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCOND(mainParser.CONDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COND}
	 * labeled alternative in {@link mainParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCOND(mainParser.CONDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CMP}
	 * labeled alternative in {@link mainParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCMP(mainParser.CMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CMP}
	 * labeled alternative in {@link mainParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCMP(mainParser.CMPContext ctx);
}
// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej2_1/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPARENTHESES(mainParser.PARENTHESESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPARENTHESES(mainParser.PARENTHESESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SIGNED_INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSIGNED_INT(mainParser.SIGNED_INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SIGNED_INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSIGNED_INT(mainParser.SIGNED_INTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDITATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterADDITATIVE_OPS(mainParser.ADDITATIVE_OPSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDITATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitADDITATIVE_OPS(mainParser.ADDITATIVE_OPSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLICATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLICATIVE_OPS(mainParser.MULTIPLICATIVE_OPSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLICATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLICATIVE_OPS(mainParser.MULTIPLICATIVE_OPSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterINT(mainParser.INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitINT(mainParser.INTContext ctx);
}
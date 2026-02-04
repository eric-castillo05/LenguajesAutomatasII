// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej2/src/main/java/org/example/calc/calc.g4 by ANTLR 4.13.2
package org.example.calc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(calcParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(calcParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pa}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPa(calcParser.PaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pa}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPa(calcParser.PaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MD}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMD(calcParser.MDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMD(calcParser.MDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(calcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(calcParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SR}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSR(calcParser.SRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SR}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSR(calcParser.SRContext ctx);
}
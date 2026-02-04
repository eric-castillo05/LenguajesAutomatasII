// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej2/src/main/java/org/example/calc/calc.g4 by ANTLR 4.13.2
package org.example.calc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(calcParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pa}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPa(calcParser.PaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMD(calcParser.MDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(calcParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SR}
	 * labeled alternative in {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSR(calcParser.SRContext ctx);
}
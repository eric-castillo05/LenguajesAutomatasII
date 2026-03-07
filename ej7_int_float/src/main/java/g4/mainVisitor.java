// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej7_int_float/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mainParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(mainParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(mainParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(mainParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(mainParser.SemicolonContext ctx);
}
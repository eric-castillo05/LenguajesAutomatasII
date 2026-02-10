// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/U1P2/src/main/java/practica2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link practica2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface practica2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link practica2Parser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(practica2Parser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link practica2Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(practica2Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link practica2Parser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(practica2Parser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link practica2Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(practica2Parser.ComparacionContext ctx);
}
// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/U1P2/src/main/java/practica2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link practica2Parser}.
 */
public interface practica2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link practica2Parser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(practica2Parser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link practica2Parser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(practica2Parser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link practica2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(practica2Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link practica2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(practica2Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link practica2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(practica2Parser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link practica2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(practica2Parser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link practica2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(practica2Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link practica2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(practica2Parser.ComparacionContext ctx);
}
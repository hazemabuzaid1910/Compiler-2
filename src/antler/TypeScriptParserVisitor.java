// Generated from C:/Users/hazem/OneDrive/Desktop/4/minmax/Compiler2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(TypeScriptParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(TypeScriptParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(TypeScriptParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(TypeScriptParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(TypeScriptParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(TypeScriptParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(TypeScriptParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#standaloneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(TypeScriptParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(TypeScriptParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(TypeScriptParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#stylesProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProperty(TypeScriptParser.StylesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(TypeScriptParser.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(TypeScriptParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(TypeScriptParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(TypeScriptParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(TypeScriptParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(TypeScriptParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeName(TypeScriptParser.HtmlAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValue(TypeScriptParser.HtmlAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(TypeScriptParser.EosContext ctx);
}
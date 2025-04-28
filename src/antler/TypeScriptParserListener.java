// Generated from C:/Users/hazem/OneDrive/Desktop/4/minmax/Compiler2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TypeScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(TypeScriptParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(TypeScriptParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(TypeScriptParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(TypeScriptParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(TypeScriptParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(TypeScriptParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(TypeScriptParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(TypeScriptParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(TypeScriptParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(TypeScriptParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(TypeScriptParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(TypeScriptParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(TypeScriptParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(TypeScriptParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(TypeScriptParser.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(TypeScriptParser.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importsProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperty(TypeScriptParser.ImportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importsProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperty(TypeScriptParser.ImportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(TypeScriptParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(TypeScriptParser.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesProperty(TypeScriptParser.StylesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesProperty(TypeScriptParser.StylesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNode(TypeScriptParser.HtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNode(TypeScriptParser.HtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(TypeScriptParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(TypeScriptParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(TypeScriptParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(TypeScriptParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(TypeScriptParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(TypeScriptParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(TypeScriptParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(TypeScriptParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(TypeScriptParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(TypeScriptParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(TypeScriptParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(TypeScriptParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(TypeScriptParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(TypeScriptParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(TypeScriptParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(TypeScriptParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(TypeScriptParser.EosContext ctx);
}
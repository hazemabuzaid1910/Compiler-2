// Generated from D:/New folder (3)/Compiler-2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportState(TypeScriptParser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportState(TypeScriptParser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentState(TypeScriptParser.ComponentStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentState(TypeScriptParser.ComponentStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNodeState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNodeState(TypeScriptParser.HtmlNodeStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNodeState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNodeState(TypeScriptParser.HtmlNodeStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassState(TypeScriptParser.ClassStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassState(TypeScriptParser.ClassStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockState(TypeScriptParser.BlockStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockState(TypeScriptParser.BlockStateContext ctx);
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
	 * Enter a parse tree produced by the {@code ImportFromBlock1}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock1(TypeScriptParser.ImportFromBlock1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromBlock1}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock1(TypeScriptParser.ImportFromBlock1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromBlock2}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock2(TypeScriptParser.ImportFromBlock2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromBlock2}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock2(TypeScriptParser.ImportFromBlock2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportAlias1}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias1(TypeScriptParser.ImportAlias1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportAlias1}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias1(TypeScriptParser.ImportAlias1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportAlias2}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias2(TypeScriptParser.ImportAlias2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportAlias2}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias2(TypeScriptParser.ImportAlias2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterComponentMod(TypeScriptParser.ComponentModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitComponentMod(TypeScriptParser.ComponentModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommonModuleMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterCommonModuleMod(TypeScriptParser.CommonModuleModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommonModuleMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitCommonModuleMod(TypeScriptParser.CommonModuleModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierMod(TypeScriptParser.IdentifierModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierMod(TypeScriptParser.IdentifierModContext ctx);
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
	 * Enter a parse tree produced by the {@code SelectProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectProperty(TypeScriptParser.SelectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectProperty(TypeScriptParser.SelectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandalonProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandalonProperty(TypeScriptParser.StandalonPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandalonProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandalonProperty(TypeScriptParser.StandalonPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportProperty(TypeScriptParser.ImportPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportProperty(TypeScriptParser.ImportPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplatProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplatProperty(TypeScriptParser.TemplatPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplatProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplatProperty(TypeScriptParser.TemplatPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleProperty(TypeScriptParser.StylePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleProperty(TypeScriptParser.StylePropertyContext ctx);
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
	 * Enter a parse tree produced by the {@code HtmlPair}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlPair(TypeScriptParser.HtmlPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlPair}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlPair(TypeScriptParser.HtmlPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSingle}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSingle(TypeScriptParser.HtmlSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSingle}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSingle(TypeScriptParser.HtmlSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlPairTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlPairTag(TypeScriptParser.HtmlPairTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlPairTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlPairTag(TypeScriptParser.HtmlPairTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#htmlSingleTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSingleTag(TypeScriptParser.HtmlSingleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#htmlSingleTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSingleTag(TypeScriptParser.HtmlSingleTagContext ctx);
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
	 * Enter a parse tree produced by the {@code WrapHtml}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterWrapHtml(TypeScriptParser.WrapHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WrapHtml}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitWrapHtml(TypeScriptParser.WrapHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MostacheExp}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterMostacheExp(TypeScriptParser.MostacheExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MostacheExp}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitMostacheExp(TypeScriptParser.MostacheExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStandardAttr(TypeScriptParser.StandardAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStandardAttr(TypeScriptParser.StandardAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoundAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBoundAttr(TypeScriptParser.BoundAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoundAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBoundAttr(TypeScriptParser.BoundAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttr(TypeScriptParser.EventAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttr(TypeScriptParser.EventAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectAttr(TypeScriptParser.DirectAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectAttr(TypeScriptParser.DirectAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayAttr(TypeScriptParser.TwoWayAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayAttr(TypeScriptParser.TwoWayAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStandardAttribute(TypeScriptParser.StandardAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStandardAttribute(TypeScriptParser.StandardAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBoundAttribute(TypeScriptParser.BoundAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#boundAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBoundAttribute(TypeScriptParser.BoundAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(TypeScriptParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(TypeScriptParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(TypeScriptParser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(TypeScriptParser.EventAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#directiveAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttribute(TypeScriptParser.DirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#directiveAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttribute(TypeScriptParser.DirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#twoWayBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBindingAttribute(TypeScriptParser.TwoWayBindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#twoWayBindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBindingAttribute(TypeScriptParser.TwoWayBindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttributeValueString}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValueString(TypeScriptParser.HtmlAttributeValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttributeValueString}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValueString(TypeScriptParser.HtmlAttributeValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttributeValueExp}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValueExp(TypeScriptParser.HtmlAttributeValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttributeValueExp}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValueExp(TypeScriptParser.HtmlAttributeValueExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionhtml}.
	 * @param ctx the parse tree
	 */
	void enterExpressionhtml(TypeScriptParser.ExpressionhtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionhtml}.
	 * @param ctx the parse tree
	 */
	void exitExpressionhtml(TypeScriptParser.ExpressionhtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#primaryExpressionhtml}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionhtml(TypeScriptParser.PrimaryExpressionhtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#primaryExpressionhtml}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionhtml(TypeScriptParser.PrimaryExpressionhtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(TypeScriptParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(TypeScriptParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TypeScriptParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TypeScriptParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(TypeScriptParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(TypeScriptParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(TypeScriptParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(TypeScriptParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterExpressionState(TypeScriptParser.ExpressionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitExpressionState(TypeScriptParser.ExpressionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterIfState(TypeScriptParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitIfState(TypeScriptParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterForState(TypeScriptParser.ForStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitForState(TypeScriptParser.ForStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterWhileState(TypeScriptParser.WhileStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitWhileState(TypeScriptParser.WhileStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterReturnState(TypeScriptParser.ReturnStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitReturnState(TypeScriptParser.ReturnStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TypeScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TypeScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TypeScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TypeScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(TypeScriptParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(TypeScriptParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Classexp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassexp(TypeScriptParser.ClassexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Classexp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassexp(TypeScriptParser.ClassexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(TypeScriptParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(TypeScriptParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(TypeScriptParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(TypeScriptParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(TypeScriptParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(TypeScriptParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(TypeScriptParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(TypeScriptParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(TypeScriptParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(TypeScriptParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(TypeScriptParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(TypeScriptParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(TypeScriptParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(TypeScriptParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(TypeScriptParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(TypeScriptParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(TypeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(TypeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(TypeScriptParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(TypeScriptParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(TypeScriptParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(TypeScriptParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(TypeScriptParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(TypeScriptParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TypeScriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TypeScriptParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterObjectLitera(TypeScriptParser.ObjectLiteraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitObjectLitera(TypeScriptParser.ObjectLiteraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterArrayLitera(TypeScriptParser.ArrayLiteraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitArrayLitera(TypeScriptParser.ArrayLiteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
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
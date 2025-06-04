// Generated from C:/Users/hazem/OneDrive/Desktop/New folder (3)/Compiler-2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code ImportState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportState(TypeScriptParser.ImportStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentState(TypeScriptParser.ComponentStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNodeState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNodeState(TypeScriptParser.HtmlNodeStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassState(TypeScriptParser.ClassStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockState}
	 * labeled alternative in {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockState(TypeScriptParser.BlockStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromBlock1}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock1(TypeScriptParser.ImportFromBlock1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromBlock2}
	 * labeled alternative in {@link TypeScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock2(TypeScriptParser.ImportFromBlock2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportAlias1}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias1(TypeScriptParser.ImportAlias1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportAlias2}
	 * labeled alternative in {@link TypeScriptParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias2(TypeScriptParser.ImportAlias2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMod(TypeScriptParser.ComponentModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommonModuleMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonModuleMod(TypeScriptParser.CommonModuleModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierMod}
	 * labeled alternative in {@link TypeScriptParser#importModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierMod(TypeScriptParser.IdentifierModContext ctx);
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
	 * Visit a parse tree produced by the {@code SelectProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectProperty(TypeScriptParser.SelectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandalonProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonProperty(TypeScriptParser.StandalonPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportProperty(TypeScriptParser.ImportPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplatProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatProperty(TypeScriptParser.TemplatPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleProperty}
	 * labeled alternative in {@link TypeScriptParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleProperty(TypeScriptParser.StylePropertyContext ctx);
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
	 * Visit a parse tree produced by the {@code HtmlPair}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlPair(TypeScriptParser.HtmlPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSingle}
	 * labeled alternative in {@link TypeScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSingle(TypeScriptParser.HtmlSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlPairTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlPairTag(TypeScriptParser.HtmlPairTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlSingleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSingleTag(TypeScriptParser.HtmlSingleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(TypeScriptParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WrapHtml}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapHtml(TypeScriptParser.WrapHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MostacheExp}
	 * labeled alternative in {@link TypeScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostacheExp(TypeScriptParser.MostacheExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttr(TypeScriptParser.StandardAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoundAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundAttr(TypeScriptParser.BoundAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttr(TypeScriptParser.EventAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectAttr}
	 * labeled alternative in {@link TypeScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAttr(TypeScriptParser.DirectAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(TypeScriptParser.StandardAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#boundAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundAttribute(TypeScriptParser.BoundAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(TypeScriptParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#eventAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(TypeScriptParser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#directiveAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveAttribute(TypeScriptParser.DirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttributeValueString}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValueString(TypeScriptParser.HtmlAttributeValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttributeValueExp}
	 * labeled alternative in {@link TypeScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValueExp(TypeScriptParser.HtmlAttributeValueExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expressionhtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionhtml(TypeScriptParser.ExpressionhtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#primaryExpressionhtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionhtml(TypeScriptParser.PrimaryExpressionhtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(TypeScriptParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(TypeScriptParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TypeScriptParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TypeScriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeScriptParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TypeScriptParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(TypeScriptParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryType(TypeScriptParser.PrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypeScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionState(TypeScriptParser.ExpressionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfState(TypeScriptParser.IfStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForState(TypeScriptParser.ForStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileState(TypeScriptParser.WhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnState(TypeScriptParser.ReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TypeScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TypeScriptParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(TypeScriptParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Classexp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassexp(TypeScriptParser.ClassexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(TypeScriptParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(TypeScriptParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(TypeScriptParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(TypeScriptParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(TypeScriptParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(TypeScriptParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(TypeScriptParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(TypeScriptParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(TypeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(TypeScriptParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(TypeScriptParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(TypeScriptParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TypeScriptParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLitera(TypeScriptParser.ObjectLiteraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLitera}
	 * labeled alternative in {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLitera(TypeScriptParser.ArrayLiteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(TypeScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(TypeScriptParser.EosContext ctx);
}
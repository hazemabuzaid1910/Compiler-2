// Generated from C:/Users/hazem/OneDrive/Desktop/4_2/compiler2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(TypeScriptParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(TypeScriptParser.StatementsContext ctx);
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
	 * Enter a parse tree produced by the {@code classexp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassexp(TypeScriptParser.ClassexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classexp}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassexp(TypeScriptParser.ClassexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(TypeScriptParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(TypeScriptParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(TypeScriptParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(TypeScriptParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(TypeScriptParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(TypeScriptParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(TypeScriptParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(TypeScriptParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(TypeScriptParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(TypeScriptParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(TypeScriptParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(TypeScriptParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(TypeScriptParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(TypeScriptParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(TypeScriptParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(TypeScriptParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TypeScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(TypeScriptParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
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
	 * Enter a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TypeScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TypeScriptParser.LiteralContext ctx);
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
// Generated from C:/Users/hazem/OneDrive/Desktop/New folder (3)/Compiler-2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Import=1, From=2, As=3, Component=4, CommonModule=5, AT_Component=6, AT=7, 
		CLASS=8, SELECTOR=9, STANDALONE=10, IMPORTS=11, TEMPLATE=12, STYLES=13, 
		EXPORT=14, THIS=15, ANY=16, BOOLEAN=17, VOID=18, UNKNOWN=19, NEVER=20, 
		OBJECT=21, STRING=22, NUMBER=23, IF=24, ELSE=25, FOR=26, WHILE=27, RETURN=28, 
		LET=29, DoubleLeftBrace=30, DoubleRightBrace=31, SemiColon=32, Comma=33, 
		OpenBrace=34, CloseBrace=35, OpenParen=36, CloseParen=37, OpenBracket=38, 
		CloseBracket=39, Colon=40, BackTick=41, LessThan=42, MoreThan=43, LTE=44, 
		GTE=45, SelfCloseTag=46, Dot=47, Question=48, DoubleQuestion=49, Not=50, 
		Equal=51, StrictEqual=52, LooseEqual=53, StrictNotEqual=54, LooseNotEqual=55, 
		And=56, Or=57, Plus=58, Multiply=59, Minus=60, Divide=61, MOD=62, HashTag=63, 
		BooleanLiteral=64, NumberLiteral=65, StringLiteral=66, Identifier=67, 
		LINE_COMMENT=68, BLOCK_COMMENT=69, WS=70;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_importAlias = 4, RULE_importModule = 5, RULE_importFrom = 6, RULE_componentDeclaration = 7, 
		RULE_componentMetadata = 8, RULE_componentProperty = 9, RULE_selectorProperty = 10, 
		RULE_standaloneProperty = 11, RULE_importsProperty = 12, RULE_templateProperty = 13, 
		RULE_stylesProperty = 14, RULE_htmlNode = 15, RULE_htmlElements = 16, 
		RULE_htmlElement = 17, RULE_htmlPairTag = 18, RULE_htmlSingleTag = 19, 
		RULE_htmlTagName = 20, RULE_htmlContent = 21, RULE_htmlAttribute = 22, 
		RULE_standardAttribute = 23, RULE_boundAttribute = 24, RULE_attributeName = 25, 
		RULE_eventAttribute = 26, RULE_directiveAttribute = 27, RULE_htmlAttributeValue = 28, 
		RULE_expressionhtml = 29, RULE_primaryExpressionhtml = 30, RULE_classDeclaration = 31, 
		RULE_classBody = 32, RULE_classMember = 33, RULE_propertyDeclaration = 34, 
		RULE_methodDeclaration = 35, RULE_parameterList = 36, RULE_parameter = 37, 
		RULE_typeAnnotation = 38, RULE_typeName = 39, RULE_unionType = 40, RULE_primaryType = 41, 
		RULE_block = 42, RULE_statements = 43, RULE_assignment = 44, RULE_expressionStatement = 45, 
		RULE_ifStatement = 46, RULE_forStatement = 47, RULE_variableDeclaration = 48, 
		RULE_whileStatement = 49, RULE_returnStatement = 50, RULE_expression = 51, 
		RULE_primary = 52, RULE_binaryOperator = 53, RULE_unaryOperator = 54, 
		RULE_memberAccess = 55, RULE_literal = 56, RULE_objectLiteral = 57, RULE_propertyAssignment = 58, 
		RULE_arrayLiteral = 59, RULE_eos = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "importFromBlock", "importAlias", 
			"importModule", "importFrom", "componentDeclaration", "componentMetadata", 
			"componentProperty", "selectorProperty", "standaloneProperty", "importsProperty", 
			"templateProperty", "stylesProperty", "htmlNode", "htmlElements", "htmlElement", 
			"htmlPairTag", "htmlSingleTag", "htmlTagName", "htmlContent", "htmlAttribute", 
			"standardAttribute", "boundAttribute", "attributeName", "eventAttribute", 
			"directiveAttribute", "htmlAttributeValue", "expressionhtml", "primaryExpressionhtml", 
			"classDeclaration", "classBody", "classMember", "propertyDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "typeAnnotation", 
			"typeName", "unionType", "primaryType", "block", "statements", "assignment", 
			"expressionStatement", "ifStatement", "forStatement", "variableDeclaration", 
			"whileStatement", "returnStatement", "expression", "primary", "binaryOperator", 
			"unaryOperator", "memberAccess", "literal", "objectLiteral", "propertyAssignment", 
			"arrayLiteral", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'as'", "'Component'", "'CommonModule'", 
			"'@Component'", "'@'", "'class'", "'selector'", "'standalone'", "'imports'", 
			"'template'", "'styles'", "'export'", "'this'", "'any'", "'boolean'", 
			"'void'", "'unknown'", "'never'", "'object'", "'string'", "'number'", 
			"'if'", "'else'", "'for'", "'while'", "'return'", "'let'", "'{{'", "'}}'", 
			"';'", "','", "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "'`'", 
			"'<'", "'>'", "'<='", "'>='", "'/>'", "'.'", "'?'", "'??'", "'!'", "'='", 
			"'==='", "'=='", "'!=='", "'!='", "'&&'", "'||'", "'+'", "'*'", "'-'", 
			"'/'", "'%'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Import", "From", "As", "Component", "CommonModule", "AT_Component", 
			"AT", "CLASS", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "STYLES", 
			"EXPORT", "THIS", "ANY", "BOOLEAN", "VOID", "UNKNOWN", "NEVER", "OBJECT", 
			"STRING", "NUMBER", "IF", "ELSE", "FOR", "WHILE", "RETURN", "LET", "DoubleLeftBrace", 
			"DoubleRightBrace", "SemiColon", "Comma", "OpenBrace", "CloseBrace", 
			"OpenParen", "CloseParen", "OpenBracket", "CloseBracket", "Colon", "BackTick", 
			"LessThan", "MoreThan", "LTE", "GTE", "SelfCloseTag", "Dot", "Question", 
			"DoubleQuestion", "Not", "Equal", "StrictEqual", "LooseEqual", "StrictNotEqual", 
			"LooseNotEqual", "And", "Or", "Plus", "Multiply", "Minus", "Divide", 
			"MOD", "HashTag", "BooleanLiteral", "NumberLiteral", "StringLiteral", 
			"Identifier", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TypeScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				statement();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4415226396994L) != 0) );
			setState(127);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassStateContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStateContext extends StatementContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStateContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBlockState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBlockState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBlockState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeStateContext extends StatementContext {
		public HtmlNodeContext htmlNode() {
			return getRuleContext(HtmlNodeContext.class,0);
		}
		public HtmlNodeStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlNodeState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlNodeState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlNodeState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStateContext extends StatementContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ComponentStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComponentState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComponentState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComponentState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				importStatement();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(130);
					match(Comma);
					setState(131);
					importStatement();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(137);
					eos();
					}
					break;
				}
				}
				break;
			case AT_Component:
				_localctx = new ComponentStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				componentDeclaration();
				}
				break;
			case LessThan:
				_localctx = new HtmlNodeStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				htmlNode();
				}
				break;
			case CLASS:
			case EXPORT:
				_localctx = new ClassStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				classDeclaration();
				}
				break;
			case OpenBrace:
				_localctx = new BlockStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(TypeScriptParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Import);
			setState(147);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
	 
		public ImportFromBlockContext() { }
		public void copyFrom(ImportFromBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlock2Context extends ImportFromBlockContext {
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public ImportFromBlock2Context(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportFromBlock2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportFromBlock2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportFromBlock2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlock1Context extends ImportFromBlockContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public List<ImportModuleContext> importModule() {
			return getRuleContexts(ImportModuleContext.class);
		}
		public ImportModuleContext importModule(int i) {
			return getRuleContext(ImportModuleContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ImportFromBlock1Context(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportFromBlock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportFromBlock1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportFromBlock1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFromBlock);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				_localctx = new ImportFromBlock1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(OpenBrace);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(150);
					importModule();
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(151);
						match(Comma);
						setState(152);
						importModule();
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 2:
					{
					setState(158);
					importAlias();
					}
					break;
				}
				setState(161);
				match(CloseBrace);
				setState(162);
				importFrom();
				}
				break;
			case StringLiteral:
				_localctx = new ImportFromBlock2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportAliasContext extends ParserRuleContext {
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
	 
		public ImportAliasContext() { }
		public void copyFrom(ImportAliasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportAlias1Context extends ImportAliasContext {
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public ImportAlias1Context(ImportAliasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportAlias1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportAlias1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportAlias1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportAlias2Context extends ImportAliasContext {
		public ImportModuleContext importModule() {
			return getRuleContext(ImportModuleContext.class,0);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public ImportAlias2Context(ImportAliasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportAlias2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportAlias2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportAlias2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importAlias);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				_localctx = new ImportAlias1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(Multiply);
				setState(168);
				match(As);
				setState(169);
				match(Identifier);
				}
				break;
			case Component:
			case CommonModule:
			case Identifier:
				_localctx = new ImportAlias2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				importModule();
				setState(171);
				match(As);
				setState(172);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportModuleContext extends ParserRuleContext {
		public ImportModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModule; }
	 
		public ImportModuleContext() { }
		public void copyFrom(ImportModuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonModuleModContext extends ImportModuleContext {
		public TerminalNode CommonModule() { return getToken(TypeScriptParser.CommonModule, 0); }
		public CommonModuleModContext(ImportModuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterCommonModuleMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitCommonModuleMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitCommonModuleMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierModContext extends ImportModuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public IdentifierModContext(ImportModuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterIdentifierMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitIdentifierMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitIdentifierMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentModContext extends ImportModuleContext {
		public TerminalNode Component() { return getToken(TypeScriptParser.Component, 0); }
		public ComponentModContext(ImportModuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComponentMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComponentMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComponentMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleContext importModule() throws RecognitionException {
		ImportModuleContext _localctx = new ImportModuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importModule);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Component:
				_localctx = new ComponentModContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Component);
				}
				break;
			case CommonModule:
				_localctx = new CommonModuleModContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(CommonModule);
				}
				break;
			case Identifier:
				_localctx = new IdentifierModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(TypeScriptParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(From);
			setState(182);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_Component() { return getToken(TypeScriptParser.AT_Component, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(AT_Component);
			setState(185);
			match(OpenParen);
			setState(186);
			componentMetadata();
			setState(187);
			match(CloseParen);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(188);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(OpenBrace);
			setState(192);
			componentProperty();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(193);
				match(Comma);
				setState(194);
				componentProperty();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
	 
		public ComponentPropertyContext() { }
		public void copyFrom(ComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylePropertyContext extends ComponentPropertyContext {
		public StylesPropertyContext stylesProperty() {
			return getRuleContext(StylesPropertyContext.class,0);
		}
		public StylePropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStyleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStyleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStyleProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportPropertyContext extends ComponentPropertyContext {
		public ImportsPropertyContext importsProperty() {
			return getRuleContext(ImportsPropertyContext.class,0);
		}
		public ImportPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectPropertyContext extends ComponentPropertyContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public SelectPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterSelectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitSelectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitSelectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonPropertyContext extends ComponentPropertyContext {
		public StandalonePropertyContext standaloneProperty() {
			return getRuleContext(StandalonePropertyContext.class,0);
		}
		public StandalonPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStandalonProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStandalonProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStandalonProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatPropertyContext extends ComponentPropertyContext {
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public TemplatPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTemplatProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTemplatProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTemplatProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperty);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				selectorProperty();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				standaloneProperty();
				}
				break;
			case IMPORTS:
				_localctx = new ImportPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				importsProperty();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				templateProperty();
				}
				break;
			case STYLES:
				_localctx = new StylePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				stylesProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(TypeScriptParser.SELECTOR, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public SelectorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPropertyContext selectorProperty() throws RecognitionException {
		SelectorPropertyContext _localctx = new SelectorPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(SELECTOR);
			setState(210);
			match(Colon);
			setState(211);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(TypeScriptParser.STANDALONE, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TypeScriptParser.BooleanLiteral, 0); }
		public StandalonePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePropertyContext standaloneProperty() throws RecognitionException {
		StandalonePropertyContext _localctx = new StandalonePropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_standaloneProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(STANDALONE);
			setState(214);
			match(Colon);
			setState(215);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertyContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(TypeScriptParser.IMPORTS, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public List<ImportModuleContext> importModule() {
			return getRuleContexts(ImportModuleContext.class);
		}
		public ImportModuleContext importModule(int i) {
			return getRuleContext(ImportModuleContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ImportsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsPropertyContext importsProperty() throws RecognitionException {
		ImportsPropertyContext _localctx = new ImportsPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importsProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IMPORTS);
			setState(218);
			match(Colon);
			setState(219);
			match(OpenBracket);
			setState(220);
			importModule();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(221);
					match(Comma);
					setState(222);
					importModule();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(230);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(TypeScriptParser.TEMPLATE, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public List<TerminalNode> BackTick() { return getTokens(TypeScriptParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(TypeScriptParser.BackTick, i);
		}
		public HtmlNodeContext htmlNode() {
			return getRuleContext(HtmlNodeContext.class,0);
		}
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_templateProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(TEMPLATE);
			setState(233);
			match(Colon);
			setState(234);
			match(BackTick);
			setState(235);
			htmlNode();
			setState(236);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(TypeScriptParser.STYLES, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TypeScriptParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TypeScriptParser.StringLiteral, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public StylesPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStylesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStylesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStylesProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesPropertyContext stylesProperty() throws RecognitionException {
		StylesPropertyContext _localctx = new StylesPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stylesProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(STYLES);
			setState(239);
			match(Colon);
			setState(240);
			match(OpenBracket);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(241);
				match(StringLiteral);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(242);
					match(Comma);
					setState(243);
					match(StringLiteral);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public HtmlNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlNodeContext htmlNode() throws RecognitionException {
		HtmlNodeContext _localctx = new HtmlNodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_htmlNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			htmlElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(255);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlPairContext extends HtmlElementContext {
		public HtmlPairTagContext htmlPairTag() {
			return getRuleContext(HtmlPairTagContext.class,0);
		}
		public HtmlPairContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlPair(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSingleContext extends HtmlElementContext {
		public HtmlSingleTagContext htmlSingleTag() {
			return getRuleContext(HtmlSingleTagContext.class,0);
		}
		public HtmlSingleContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_htmlElement);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new HtmlPairContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				htmlPairTag();
				}
				break;
			case 2:
				_localctx = new HtmlSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				htmlSingleTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlPairTagContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(TypeScriptParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(TypeScriptParser.LessThan, i);
		}
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(TypeScriptParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(TypeScriptParser.MoreThan, i);
		}
		public TerminalNode Divide() { return getToken(TypeScriptParser.Divide, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlPairTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlPairTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlPairTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlPairTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlPairTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlPairTagContext htmlPairTag() throws RecognitionException {
		HtmlPairTagContext _localctx = new HtmlPairTagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_htmlPairTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LessThan);
			setState(265);
			htmlTagName();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 578712553459286017L) != 0)) {
				{
				{
				setState(266);
				htmlAttribute();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(MoreThan);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					htmlContent();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(279);
			match(LessThan);
			setState(280);
			match(Divide);
			setState(281);
			htmlTagName();
			setState(282);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSingleTagContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public TerminalNode SelfCloseTag() { return getToken(TypeScriptParser.SelfCloseTag, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlSingleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSingleTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlSingleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlSingleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlSingleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSingleTagContext htmlSingleTag() throws RecognitionException {
		HtmlSingleTagContext _localctx = new HtmlSingleTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlSingleTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LessThan);
			setState(285);
			htmlTagName();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 578712553459286017L) != 0)) {
				{
				{
				setState(286);
				htmlAttribute();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(SelfCloseTag);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MostacheExpContext extends HtmlContentContext {
		public TerminalNode DoubleLeftBrace() { return getToken(TypeScriptParser.DoubleLeftBrace, 0); }
		public ExpressionhtmlContext expressionhtml() {
			return getRuleContext(ExpressionhtmlContext.class,0);
		}
		public TerminalNode DoubleRightBrace() { return getToken(TypeScriptParser.DoubleRightBrace, 0); }
		public MostacheExpContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterMostacheExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitMostacheExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitMostacheExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WrapHtmlContext extends HtmlContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public WrapHtmlContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterWrapHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitWrapHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitWrapHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_htmlContent);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				_localctx = new WrapHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				htmlElement();
				}
				break;
			case DoubleLeftBrace:
				_localctx = new MostacheExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(DoubleLeftBrace);
				setState(298);
				expressionhtml();
				setState(299);
				match(DoubleRightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventAttrContext extends HtmlAttributeContext {
		public EventAttributeContext eventAttribute() {
			return getRuleContext(EventAttributeContext.class,0);
		}
		public EventAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEventAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEventAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEventAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoundAttrContext extends HtmlAttributeContext {
		public BoundAttributeContext boundAttribute() {
			return getRuleContext(BoundAttributeContext.class,0);
		}
		public BoundAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBoundAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBoundAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBoundAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectAttrContext extends HtmlAttributeContext {
		public DirectiveAttributeContext directiveAttribute() {
			return getRuleContext(DirectiveAttributeContext.class,0);
		}
		public DirectAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDirectAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDirectAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDirectAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttrContext extends HtmlAttributeContext {
		public StandardAttributeContext standardAttribute() {
			return getRuleContext(StandardAttributeContext.class,0);
		}
		public StandardAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStandardAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStandardAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStandardAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlAttribute);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case Identifier:
				_localctx = new StandardAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				standardAttribute();
				}
				break;
			case OpenBracket:
				_localctx = new BoundAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				boundAttribute();
				}
				break;
			case OpenParen:
				_localctx = new EventAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				eventAttribute();
				}
				break;
			case Multiply:
				_localctx = new DirectAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				directiveAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttributeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TypeScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TypeScriptParser.Identifier, i);
		}
		public TerminalNode CLASS() { return getToken(TypeScriptParser.CLASS, 0); }
		public List<TerminalNode> Minus() { return getTokens(TypeScriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(TypeScriptParser.Minus, i);
		}
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public StandardAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStandardAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStandardAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStandardAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardAttributeContext standardAttribute() throws RecognitionException {
		StandardAttributeContext _localctx = new StandardAttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_standardAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(310);
				match(Minus);
				setState(311);
				match(Identifier);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(317);
				match(Equal);
				setState(318);
				htmlAttributeValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoundAttributeContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public BoundAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBoundAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBoundAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBoundAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundAttributeContext boundAttribute() throws RecognitionException {
		BoundAttributeContext _localctx = new BoundAttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boundAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(OpenBracket);
			setState(322);
			attributeName();
			setState(323);
			match(CloseBracket);
			setState(324);
			match(Equal);
			setState(325);
			htmlAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TypeScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TypeScriptParser.Identifier, i);
		}
		public TerminalNode CLASS() { return getToken(TypeScriptParser.CLASS, 0); }
		public List<TerminalNode> Dot() { return getTokens(TypeScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TypeScriptParser.Dot, i);
		}
		public List<TerminalNode> Minus() { return getTokens(TypeScriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(TypeScriptParser.Minus, i);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Minus) {
				{
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==Dot || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				match(Identifier);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventAttributeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public EventAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAttributeContext eventAttribute() throws RecognitionException {
		EventAttributeContext _localctx = new EventAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eventAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(OpenParen);
			setState(336);
			match(Identifier);
			setState(337);
			match(CloseParen);
			setState(338);
			match(Equal);
			setState(339);
			htmlAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveAttributeContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public DirectiveAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveAttributeContext directiveAttribute() throws RecognitionException {
		DirectiveAttributeContext _localctx = new DirectiveAttributeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_directiveAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Multiply);
			setState(342);
			match(Identifier);
			setState(343);
			match(Equal);
			setState(344);
			htmlAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
	 
		public HtmlAttributeValueContext() { }
		public void copyFrom(HtmlAttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueStringContext extends HtmlAttributeValueContext {
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public HtmlAttributeValueStringContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlAttributeValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlAttributeValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlAttributeValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueExpContext extends HtmlAttributeValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HtmlAttributeValueExpContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlAttributeValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlAttributeValueExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlAttributeValueExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_htmlAttributeValue);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new HtmlAttributeValueStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(StringLiteral);
				}
				break;
			case 2:
				_localctx = new HtmlAttributeValueExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionhtmlContext extends ParserRuleContext {
		public List<PrimaryExpressionhtmlContext> primaryExpressionhtml() {
			return getRuleContexts(PrimaryExpressionhtmlContext.class);
		}
		public PrimaryExpressionhtmlContext primaryExpressionhtml(int i) {
			return getRuleContext(PrimaryExpressionhtmlContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(TypeScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TypeScriptParser.Dot, i);
		}
		public ExpressionhtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionhtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExpressionhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExpressionhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExpressionhtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionhtmlContext expressionhtml() throws RecognitionException {
		ExpressionhtmlContext _localctx = new ExpressionhtmlContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionhtml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			primaryExpressionhtml();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(351);
				match(Dot);
				setState(352);
				primaryExpressionhtml();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionhtmlContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public PrimaryExpressionhtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpressionhtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPrimaryExpressionhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPrimaryExpressionhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPrimaryExpressionhtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionhtmlContext primaryExpressionhtml() throws RecognitionException {
		PrimaryExpressionhtmlContext _localctx = new PrimaryExpressionhtmlContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryExpressionhtml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(TypeScriptParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode EXPORT() { return getToken(TypeScriptParser.EXPORT, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(360);
				match(EXPORT);
				}
			}

			setState(363);
			match(CLASS);
			setState(364);
			match(Identifier);
			setState(365);
			match(OpenBrace);
			setState(366);
			classBody();
			setState(367);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(369);
				classMember();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classMember);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(Identifier);
			setState(380);
			match(Equal);
			setState(381);
			expression(0);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(382);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(Identifier);
			setState(386);
			match(OpenParen);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(387);
				parameterList();
				}
			}

			setState(390);
			match(CloseParen);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(391);
				typeAnnotation();
				}
			}

			setState(394);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			parameter();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(397);
				match(Comma);
				setState(398);
				parameter();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Identifier);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(405);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Colon);
			setState(409);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			unionType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionTypeContext extends ParserRuleContext {
		public List<PrimaryTypeContext> primaryType() {
			return getRuleContexts(PrimaryTypeContext.class);
		}
		public PrimaryTypeContext primaryType(int i) {
			return getRuleContext(PrimaryTypeContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(TypeScriptParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(TypeScriptParser.Or, i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			primaryType();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(414);
				match(Or);
				setState(415);
				primaryType();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryTypeContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(TypeScriptParser.ANY, 0); }
		public TerminalNode STRING() { return getToken(TypeScriptParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(TypeScriptParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeScriptParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(TypeScriptParser.VOID, 0); }
		public TerminalNode UNKNOWN() { return getToken(TypeScriptParser.UNKNOWN, 0); }
		public TerminalNode NEVER() { return getToken(TypeScriptParser.NEVER, 0); }
		public TerminalNode OBJECT() { return getToken(TypeScriptParser.OBJECT, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPrimaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPrimaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primaryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2251799813685503L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(OpenBrace);
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				statements();
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1014440215522902145L) != 0) );
			setState(429);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStateContext extends StatementsContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitWhileState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitWhileState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStateContext extends StatementsContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExpressionState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExpressionState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExpressionState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStateContext extends StatementsContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterReturnState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitReturnState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitReturnState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStateContext extends StatementsContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitIfState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitIfState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatementsContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStateContext extends StatementsContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterForState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitForState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitForState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statements);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExpressionStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				expressionStatement();
				}
				break;
			case 3:
				_localctx = new IfStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new ForStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				forStatement();
				}
				break;
			case 5:
				_localctx = new WhileStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				whileStatement();
				}
				break;
			case 6:
				_localctx = new ReturnStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			expression(0);
			setState(440);
			match(Equal);
			setState(441);
			expression(0);
			setState(442);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			expression(0);
			setState(445);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TypeScriptParser.IF, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TypeScriptParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(IF);
			setState(448);
			match(OpenParen);
			setState(449);
			expression(0);
			setState(450);
			match(CloseParen);
			setState(451);
			block();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(452);
				match(ELSE);
				setState(453);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TypeScriptParser.FOR, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TypeScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TypeScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(FOR);
			setState(457);
			match(OpenParen);
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(458);
				variableDeclaration();
				}
				break;
			case CLASS:
			case THIS:
			case OpenBrace:
			case OpenParen:
			case OpenBracket:
			case Not:
			case Plus:
			case Minus:
			case NumberLiteral:
			case StringLiteral:
			case Identifier:
				{
				setState(459);
				expressionStatement();
				}
				break;
			case SemiColon:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
			match(SemiColon);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1014440215521001601L) != 0)) {
				{
				setState(464);
				expression(0);
				}
			}

			setState(467);
			match(SemiColon);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1014440215521001601L) != 0)) {
				{
				setState(468);
				expression(0);
				}
			}

			setState(471);
			match(CloseParen);
			setState(472);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(TypeScriptParser.LET, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LET);
			setState(475);
			match(Identifier);
			setState(476);
			match(Equal);
			setState(477);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TypeScriptParser.WHILE, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(WHILE);
			setState(480);
			match(OpenParen);
			setState(481);
			expression(0);
			setState(482);
			match(CloseParen);
			setState(483);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TypeScriptParser.RETURN, 0); }
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(RETURN);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1014440215521001601L) != 0)) {
				{
				setState(486);
				expression(0);
				}
			}

			setState(489);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public MemberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassexpContext extends ExpressionContext {
		public TerminalNode CLASS() { return getToken(TypeScriptParser.CLASS, 0); }
		public ClassexpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterClassexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitClassexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitClassexp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case Plus:
			case Minus:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(492);
				unaryOperator();
				setState(493);
				expression(3);
				}
				break;
			case THIS:
			case OpenBrace:
			case OpenParen:
			case OpenBracket:
			case NumberLiteral:
			case StringLiteral:
			case Identifier:
				{
				_localctx = new MemberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				primary();
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						memberAccess();
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case CLASS:
				{
				_localctx = new ClassexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(502);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(505);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(506);
					binaryOperator();
					setState(507);
					expression(5);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends PrimaryContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends PrimaryContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public IdExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends PrimaryContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public ParenExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends PrimaryContext {
		public TerminalNode THIS() { return getToken(TypeScriptParser.THIS, 0); }
		public ThisExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_primary);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ThisExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(THIS);
				}
				break;
			case 2:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				objectLiteral();
				}
				break;
			case 4:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				arrayLiteral();
				}
				break;
			case 5:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				literal();
				}
				break;
			case 6:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				match(OpenParen);
				setState(520);
				expression(0);
				setState(521);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(TypeScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TypeScriptParser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(TypeScriptParser.Divide, 0); }
		public TerminalNode MOD() { return getToken(TypeScriptParser.MOD, 0); }
		public TerminalNode MoreThan() { return getToken(TypeScriptParser.MoreThan, 0); }
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public TerminalNode GTE() { return getToken(TypeScriptParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(TypeScriptParser.LTE, 0); }
		public TerminalNode LooseEqual() { return getToken(TypeScriptParser.LooseEqual, 0); }
		public TerminalNode LooseNotEqual() { return getToken(TypeScriptParser.LooseNotEqual, 0); }
		public TerminalNode Equal() { return getToken(TypeScriptParser.Equal, 0); }
		public TerminalNode And() { return getToken(TypeScriptParser.And, 0); }
		public TerminalNode Or() { return getToken(TypeScriptParser.Or, 0); }
		public TerminalNode Dot() { return getToken(TypeScriptParser.Dot, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9198808947090259968L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(TypeScriptParser.Not, 0); }
		public TerminalNode Plus() { return getToken(TypeScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TypeScriptParser.Minus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1442277780665401344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> Dot() { return getTokens(TypeScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TypeScriptParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TypeScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TypeScriptParser.Identifier, i);
		}
		public List<TerminalNode> OpenBracket() { return getTokens(TypeScriptParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(TypeScriptParser.OpenBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CloseBracket() { return getTokens(TypeScriptParser.CloseBracket); }
		public TerminalNode CloseBracket(int i) {
			return getToken(TypeScriptParser.CloseBracket, i);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_memberAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(535);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Dot:
						{
						setState(529);
						match(Dot);
						setState(530);
						match(Identifier);
						}
						break;
					case OpenBracket:
						{
						setState(531);
						match(OpenBracket);
						setState(532);
						expression(0);
						setState(533);
						match(CloseBracket);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(537); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteraContext extends LiteralContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteraContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterObjectLitera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitObjectLitera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitObjectLitera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteraContext extends LiteralContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteraContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayLitera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayLitera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayLitera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode NumberLiteral() { return getToken(TypeScriptParser.NumberLiteral, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumberLiteral:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(NumberLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				_localctx = new ObjectLiteraContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				objectLiteral();
				}
				break;
			case OpenBracket:
				_localctx = new ArrayLiteraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				arrayLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(OpenBrace);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(546);
				propertyAssignment();
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						match(Comma);
						setState(548);
						propertyAssignment();
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(554);
					match(Comma);
					}
				}

				}
			}

			setState(559);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Identifier);
			setState(562);
			match(Colon);
			setState(563);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(OpenBracket);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1014440215521001601L) != 0)) {
				{
				setState(566);
				expression(0);
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(Comma);
						setState(568);
						expression(0);
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(574);
					match(Comma);
					}
				}

				}
			}

			setState(579);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(TypeScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 51:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u0248\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0001\u0000\u0004\u0000|\b\u0000\u000b\u0000\f\u0000}\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0085\b\u0001"+
		"\n\u0001\f\u0001\u0088\t\u0001\u0001\u0001\u0003\u0001\u008b\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0091\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u009a\b\u0003\n\u0003\f\u0003\u009d\t\u0003\u0001\u0003"+
		"\u0003\u0003\u00a0\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00a6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00af\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00b4\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00be\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c4"+
		"\b\b\n\b\f\b\u00c7\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00d0\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00e0\b\f\n\f\f\f\u00e3\t\f\u0003\f\u00e5\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f5\b\u000e\n\u000e\f\u000e\u00f8\t\u000e\u0003\u000e\u00fa\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u0101\b\u0010\u000b\u0010\f\u0010\u0102\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0107\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010c"+
		"\b\u0012\n\u0012\f\u0012\u010f\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0113\b\u0012\n\u0012\f\u0012\u0116\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0120\b\u0013\n\u0013\f\u0013\u0123\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u012e\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0134\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0139\b\u0017\n\u0017\f\u0017\u013c\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0140\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u014b\b\u0019\n\u0019\f\u0019\u014e\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u015d\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0162\b"+
		"\u001d\n\u001d\f\u001d\u0165\t\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0003\u001f\u016a\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0005 \u0173\b \n \f \u0176\t \u0001!"+
		"\u0001!\u0003!\u017a\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0180"+
		"\b\"\u0001#\u0001#\u0001#\u0003#\u0185\b#\u0001#\u0001#\u0003#\u0189\b"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0190\b$\n$\f$\u0193\t$\u0001"+
		"%\u0001%\u0003%\u0197\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0005(\u01a1\b(\n(\f(\u01a4\t(\u0001)\u0001)\u0001*\u0001*\u0004"+
		"*\u01aa\b*\u000b*\f*\u01ab\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u01b6\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01c7"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u01ce\b/\u0001/\u0001/\u0003"+
		"/\u01d2\b/\u0001/\u0001/\u0003/\u01d6\b/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00032\u01e8\b2\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00053\u01f2\b3\n3\f3\u01f5\t3\u00013\u00033\u01f8\b3\u00013"+
		"\u00013\u00013\u00013\u00053\u01fe\b3\n3\f3\u0201\t3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u020c\b4\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00047\u0218"+
		"\b7\u000b7\f7\u0219\u00018\u00018\u00018\u00018\u00038\u0220\b8\u0001"+
		"9\u00019\u00019\u00019\u00059\u0226\b9\n9\f9\u0229\t9\u00019\u00039\u022c"+
		"\b9\u00039\u022e\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0005;\u023a\b;\n;\f;\u023d\t;\u0001;\u0003;\u0240\b;"+
		"\u0003;\u0242\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0000\u0001f=\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\u0006\u0002"+
		"\u0000\b\bCC\u0002\u0000//<<\u0002\u0000\u0010\u0017CC\u0005\u0000*-/"+
		"/33557>\u0003\u000022::<<\u0001\u0001  \u0258\u0000{\u0001\u0000\u0000"+
		"\u0000\u0002\u0090\u0001\u0000\u0000\u0000\u0004\u0092\u0001\u0000\u0000"+
		"\u0000\u0006\u00a5\u0001\u0000\u0000\u0000\b\u00ae\u0001\u0000\u0000\u0000"+
		"\n\u00b3\u0001\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000\u0000\u000e"+
		"\u00b8\u0001\u0000\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012"+
		"\u00cf\u0001\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000\u0016"+
		"\u00d5\u0001\u0000\u0000\u0000\u0018\u00d9\u0001\u0000\u0000\u0000\u001a"+
		"\u00e8\u0001\u0000\u0000\u0000\u001c\u00ee\u0001\u0000\u0000\u0000\u001e"+
		"\u00fd\u0001\u0000\u0000\u0000 \u0100\u0001\u0000\u0000\u0000\"\u0106"+
		"\u0001\u0000\u0000\u0000$\u0108\u0001\u0000\u0000\u0000&\u011c\u0001\u0000"+
		"\u0000\u0000(\u0126\u0001\u0000\u0000\u0000*\u012d\u0001\u0000\u0000\u0000"+
		",\u0133\u0001\u0000\u0000\u0000.\u0135\u0001\u0000\u0000\u00000\u0141"+
		"\u0001\u0000\u0000\u00002\u0147\u0001\u0000\u0000\u00004\u014f\u0001\u0000"+
		"\u0000\u00006\u0155\u0001\u0000\u0000\u00008\u015c\u0001\u0000\u0000\u0000"+
		":\u015e\u0001\u0000\u0000\u0000<\u0166\u0001\u0000\u0000\u0000>\u0169"+
		"\u0001\u0000\u0000\u0000@\u0174\u0001\u0000\u0000\u0000B\u0179\u0001\u0000"+
		"\u0000\u0000D\u017b\u0001\u0000\u0000\u0000F\u0181\u0001\u0000\u0000\u0000"+
		"H\u018c\u0001\u0000\u0000\u0000J\u0194\u0001\u0000\u0000\u0000L\u0198"+
		"\u0001\u0000\u0000\u0000N\u019b\u0001\u0000\u0000\u0000P\u019d\u0001\u0000"+
		"\u0000\u0000R\u01a5\u0001\u0000\u0000\u0000T\u01a7\u0001\u0000\u0000\u0000"+
		"V\u01b5\u0001\u0000\u0000\u0000X\u01b7\u0001\u0000\u0000\u0000Z\u01bc"+
		"\u0001\u0000\u0000\u0000\\\u01bf\u0001\u0000\u0000\u0000^\u01c8\u0001"+
		"\u0000\u0000\u0000`\u01da\u0001\u0000\u0000\u0000b\u01df\u0001\u0000\u0000"+
		"\u0000d\u01e5\u0001\u0000\u0000\u0000f\u01f7\u0001\u0000\u0000\u0000h"+
		"\u020b\u0001\u0000\u0000\u0000j\u020d\u0001\u0000\u0000\u0000l\u020f\u0001"+
		"\u0000\u0000\u0000n\u0217\u0001\u0000\u0000\u0000p\u021f\u0001\u0000\u0000"+
		"\u0000r\u0221\u0001\u0000\u0000\u0000t\u0231\u0001\u0000\u0000\u0000v"+
		"\u0235\u0001\u0000\u0000\u0000x\u0245\u0001\u0000\u0000\u0000z|\u0003"+
		"\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0000\u0000\u0001\u0080\u0001\u0001\u0000"+
		"\u0000\u0000\u0081\u0086\u0003\u0004\u0002\u0000\u0082\u0083\u0005!\u0000"+
		"\u0000\u0083\u0085\u0003\u0004\u0002\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0003x<\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0091\u0001\u0000\u0000\u0000\u008c\u0091\u0003\u000e\u0007\u0000\u008d"+
		"\u0091\u0003\u001e\u000f\u0000\u008e\u0091\u0003>\u001f\u0000\u008f\u0091"+
		"\u0003T*\u0000\u0090\u0081\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000"+
		"\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0003\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0001\u0000\u0000\u0093\u0094\u0003\u0006"+
		"\u0003\u0000\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u009f\u0005\"\u0000"+
		"\u0000\u0096\u009b\u0003\n\u0005\u0000\u0097\u0098\u0005!\u0000\u0000"+
		"\u0098\u009a\u0003\n\u0005\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\b\u0004\u0000\u009f\u0096"+
		"\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005#\u0000\u0000\u00a2\u00a3\u0003"+
		"\f\u0006\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005B"+
		"\u0000\u0000\u00a5\u0095\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u0007\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005;\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00af\u0005C\u0000\u0000"+
		"\u00aa\u00ab\u0003\n\u0005\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00ad\u0005C\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00af\t\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b4\u0005\u0004\u0000\u0000\u00b1\u00b4\u0005"+
		"\u0005\u0000\u0000\u00b2\u00b4\u0005C\u0000\u0000\u00b3\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u000b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0002"+
		"\u0000\u0000\u00b6\u00b7\u0005B\u0000\u0000\u00b7\r\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0005$\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00bd\u0005%\u0000\u0000\u00bc"+
		"\u00be\u0003x<\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\"\u0000\u0000\u00c0\u00c5\u0003\u0012\t\u0000\u00c1\u00c2\u0005!\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005#\u0000\u0000\u00c9"+
		"\u0011\u0001\u0000\u0000\u0000\u00ca\u00d0\u0003\u0014\n\u0000\u00cb\u00d0"+
		"\u0003\u0016\u000b\u0000\u00cc\u00d0\u0003\u0018\f\u0000\u00cd\u00d0\u0003"+
		"\u001a\r\u0000\u00ce\u00d0\u0003\u001c\u000e\u0000\u00cf\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u0013\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\t\u0000"+
		"\u0000\u00d2\u00d3\u0005(\u0000\u0000\u00d3\u00d4\u0005B\u0000\u0000\u00d4"+
		"\u0015\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\n\u0000\u0000\u00d6\u00d7"+
		"\u0005(\u0000\u0000\u00d7\u00d8\u0005@\u0000\u0000\u00d8\u0017\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u000b\u0000\u0000\u00da\u00db\u0005(\u0000"+
		"\u0000\u00db\u00dc\u0005&\u0000\u0000\u00dc\u00e4\u0003\n\u0005\u0000"+
		"\u00dd\u00de\u0005!\u0000\u0000\u00de\u00e0\u0003\n\u0005\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\'\u0000\u0000\u00e7\u0019"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\f\u0000\u0000\u00e9\u00ea\u0005"+
		"(\u0000\u0000\u00ea\u00eb\u0005)\u0000\u0000\u00eb\u00ec\u0003\u001e\u000f"+
		"\u0000\u00ec\u00ed\u0005)\u0000\u0000\u00ed\u001b\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005\r\u0000\u0000\u00ef\u00f0\u0005(\u0000\u0000\u00f0"+
		"\u00f9\u0005&\u0000\u0000\u00f1\u00f6\u0005B\u0000\u0000\u00f2\u00f3\u0005"+
		"!\u0000\u0000\u00f3\u00f5\u0005B\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\'\u0000\u0000\u00fc\u001d\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0003 \u0010\u0000\u00fe\u001f\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0003\"\u0011\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104\u0107\u0003"+
		"$\u0012\u0000\u0105\u0107\u0003&\u0013\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107#\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005*\u0000\u0000\u0109\u010d\u0003(\u0014\u0000\u010a\u010c"+
		"\u0003,\u0016\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0114\u0005+\u0000\u0000\u0111\u0113\u0003*\u0015"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005*\u0000\u0000\u0118\u0119\u0005=\u0000\u0000\u0119"+
		"\u011a\u0003(\u0014\u0000\u011a\u011b\u0005+\u0000\u0000\u011b%\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011d\u0121\u0003(\u0014"+
		"\u0000\u011e\u0120\u0003,\u0016\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0005.\u0000\u0000\u0125"+
		"\'\u0001\u0000\u0000\u0000\u0126\u0127\u0005C\u0000\u0000\u0127)\u0001"+
		"\u0000\u0000\u0000\u0128\u012e\u0003\"\u0011\u0000\u0129\u012a\u0005\u001e"+
		"\u0000\u0000\u012a\u012b\u0003:\u001d\u0000\u012b\u012c\u0005\u001f\u0000"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000"+
		"\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012e+\u0001\u0000\u0000\u0000"+
		"\u012f\u0134\u0003.\u0017\u0000\u0130\u0134\u00030\u0018\u0000\u0131\u0134"+
		"\u00034\u001a\u0000\u0132\u0134\u00036\u001b\u0000\u0133\u012f\u0001\u0000"+
		"\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134-\u0001\u0000\u0000"+
		"\u0000\u0135\u013a\u0007\u0000\u0000\u0000\u0136\u0137\u0005<\u0000\u0000"+
		"\u0137\u0139\u0005C\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013f\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u00053\u0000\u0000\u013e\u0140"+
		"\u00038\u001c\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140/\u0001\u0000\u0000\u0000\u0141\u0142\u0005&\u0000"+
		"\u0000\u0142\u0143\u00032\u0019\u0000\u0143\u0144\u0005\'\u0000\u0000"+
		"\u0144\u0145\u00053\u0000\u0000\u0145\u0146\u00038\u001c\u0000\u01461"+
		"\u0001\u0000\u0000\u0000\u0147\u014c\u0007\u0000\u0000\u0000\u0148\u0149"+
		"\u0007\u0001\u0000\u0000\u0149\u014b\u0005C\u0000\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d3\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005$\u0000"+
		"\u0000\u0150\u0151\u0005C\u0000\u0000\u0151\u0152\u0005%\u0000\u0000\u0152"+
		"\u0153\u00053\u0000\u0000\u0153\u0154\u00038\u001c\u0000\u01545\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005;\u0000\u0000\u0156\u0157\u0005C\u0000"+
		"\u0000\u0157\u0158\u00053\u0000\u0000\u0158\u0159\u00038\u001c\u0000\u0159"+
		"7\u0001\u0000\u0000\u0000\u015a\u015d\u0005B\u0000\u0000\u015b\u015d\u0003"+
		"f3\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015d9\u0001\u0000\u0000\u0000\u015e\u0163\u0003<\u001e\u0000\u015f"+
		"\u0160\u0005/\u0000\u0000\u0160\u0162\u0003<\u001e\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164;\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0005C\u0000"+
		"\u0000\u0167=\u0001\u0000\u0000\u0000\u0168\u016a\u0005\u000e\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005\b\u0000\u0000\u016c"+
		"\u016d\u0005C\u0000\u0000\u016d\u016e\u0005\"\u0000\u0000\u016e\u016f"+
		"\u0003@ \u0000\u016f\u0170\u0005#\u0000\u0000\u0170?\u0001\u0000\u0000"+
		"\u0000\u0171\u0173\u0003B!\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175A\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0003D\"\u0000\u0178\u017a\u0003"+
		"F#\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017aC\u0001\u0000\u0000\u0000\u017b\u017c\u0005C\u0000\u0000\u017c"+
		"\u017d\u00053\u0000\u0000\u017d\u017f\u0003f3\u0000\u017e\u0180\u0005"+
		" \u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180E\u0001\u0000\u0000\u0000\u0181\u0182\u0005C\u0000\u0000"+
		"\u0182\u0184\u0005$\u0000\u0000\u0183\u0185\u0003H$\u0000\u0184\u0183"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0188\u0005%\u0000\u0000\u0187\u0189\u0003"+
		"L&\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0003T*\u0000\u018b"+
		"G\u0001\u0000\u0000\u0000\u018c\u0191\u0003J%\u0000\u018d\u018e\u0005"+
		"!\u0000\u0000\u018e\u0190\u0003J%\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192I\u0001\u0000\u0000\u0000"+
		"\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0196\u0005C\u0000\u0000\u0195"+
		"\u0197\u0003L&\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197K\u0001\u0000\u0000\u0000\u0198\u0199\u0005(\u0000"+
		"\u0000\u0199\u019a\u0003N\'\u0000\u019aM\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0003P(\u0000\u019cO\u0001\u0000\u0000\u0000\u019d\u01a2\u0003"+
		"R)\u0000\u019e\u019f\u00059\u0000\u0000\u019f\u01a1\u0003R)\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"Q\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0007\u0002\u0000\u0000\u01a6S\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005"+
		"\"\u0000\u0000\u01a8\u01aa\u0003V+\u0000\u01a9\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0005#\u0000\u0000\u01aeU\u0001\u0000\u0000\u0000\u01af"+
		"\u01b6\u0003X,\u0000\u01b0\u01b6\u0003Z-\u0000\u01b1\u01b6\u0003\\.\u0000"+
		"\u01b2\u01b6\u0003^/\u0000\u01b3\u01b6\u0003b1\u0000\u01b4\u01b6\u0003"+
		"d2\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6W\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003f3\u0000\u01b8"+
		"\u01b9\u00053\u0000\u0000\u01b9\u01ba\u0003f3\u0000\u01ba\u01bb\u0005"+
		" \u0000\u0000\u01bbY\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003f3\u0000"+
		"\u01bd\u01be\u0005 \u0000\u0000\u01be[\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0005\u0018\u0000\u0000\u01c0\u01c1\u0005$\u0000\u0000\u01c1\u01c2\u0003"+
		"f3\u0000\u01c2\u01c3\u0005%\u0000\u0000\u01c3\u01c6\u0003T*\u0000\u01c4"+
		"\u01c5\u0005\u0019\u0000\u0000\u01c5\u01c7\u0003T*\u0000\u01c6\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7]\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0005\u001a\u0000\u0000\u01c9\u01cd\u0005$\u0000"+
		"\u0000\u01ca\u01ce\u0003`0\u0000\u01cb\u01ce\u0003Z-\u0000\u01cc\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005 \u0000\u0000\u01d0\u01d2\u0003"+
		"f3\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005 \u0000\u0000"+
		"\u01d4\u01d6\u0003f3\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005%\u0000\u0000\u01d8\u01d9\u0003T*\u0000\u01d9_\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0005\u001d\u0000\u0000\u01db\u01dc\u0005C\u0000\u0000"+
		"\u01dc\u01dd\u00053\u0000\u0000\u01dd\u01de\u0003f3\u0000\u01dea\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005\u001b\u0000\u0000\u01e0\u01e1\u0005"+
		"$\u0000\u0000\u01e1\u01e2\u0003f3\u0000\u01e2\u01e3\u0005%\u0000\u0000"+
		"\u01e3\u01e4\u0003T*\u0000\u01e4c\u0001\u0000\u0000\u0000\u01e5\u01e7"+
		"\u0005\u001c\u0000\u0000\u01e6\u01e8\u0003f3\u0000\u01e7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0005 \u0000\u0000\u01eae\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u00063\uffff\uffff\u0000\u01ec\u01ed\u0003l6\u0000\u01ed"+
		"\u01ee\u0003f3\u0003\u01ee\u01f8\u0001\u0000\u0000\u0000\u01ef\u01f3\u0003"+
		"h4\u0000\u01f0\u01f2\u0003n7\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005\b\u0000\u0000\u01f7"+
		"\u01eb\u0001\u0000\u0000\u0000\u01f7\u01ef\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8\u01ff\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\n\u0004\u0000\u0000\u01fa\u01fb\u0003j5\u0000\u01fb\u01fc\u0003"+
		"f3\u0005\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200g\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u020c\u0005\u000f\u0000\u0000"+
		"\u0203\u020c\u0005C\u0000\u0000\u0204\u020c\u0003r9\u0000\u0205\u020c"+
		"\u0003v;\u0000\u0206\u020c\u0003p8\u0000\u0207\u0208\u0005$\u0000\u0000"+
		"\u0208\u0209\u0003f3\u0000\u0209\u020a\u0005%\u0000\u0000\u020a\u020c"+
		"\u0001\u0000\u0000\u0000\u020b\u0202\u0001\u0000\u0000\u0000\u020b\u0203"+
		"\u0001\u0000\u0000\u0000\u020b\u0204\u0001\u0000\u0000\u0000\u020b\u0205"+
		"\u0001\u0000\u0000\u0000\u020b\u0206\u0001\u0000\u0000\u0000\u020b\u0207"+
		"\u0001\u0000\u0000\u0000\u020ci\u0001\u0000\u0000\u0000\u020d\u020e\u0007"+
		"\u0003\u0000\u0000\u020ek\u0001\u0000\u0000\u0000\u020f\u0210\u0007\u0004"+
		"\u0000\u0000\u0210m\u0001\u0000\u0000\u0000\u0211\u0212\u0005/\u0000\u0000"+
		"\u0212\u0218\u0005C\u0000\u0000\u0213\u0214\u0005&\u0000\u0000\u0214\u0215"+
		"\u0003f3\u0000\u0215\u0216\u0005\'\u0000\u0000\u0216\u0218\u0001\u0000"+
		"\u0000\u0000\u0217\u0211\u0001\u0000\u0000\u0000\u0217\u0213\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021ao\u0001\u0000\u0000"+
		"\u0000\u021b\u0220\u0005A\u0000\u0000\u021c\u0220\u0005B\u0000\u0000\u021d"+
		"\u0220\u0003r9\u0000\u021e\u0220\u0003v;\u0000\u021f\u021b\u0001\u0000"+
		"\u0000\u0000\u021f\u021c\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220q\u0001\u0000\u0000"+
		"\u0000\u0221\u022d\u0005\"\u0000\u0000\u0222\u0227\u0003t:\u0000\u0223"+
		"\u0224\u0005!\u0000\u0000\u0224\u0226\u0003t:\u0000\u0225\u0223\u0001"+
		"\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022b\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022c\u0005"+
		"!\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u0222\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u0005#\u0000\u0000\u0230s\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005C\u0000\u0000\u0232\u0233\u0005(\u0000\u0000\u0233\u0234"+
		"\u0003f3\u0000\u0234u\u0001\u0000\u0000\u0000\u0235\u0241\u0005&\u0000"+
		"\u0000\u0236\u023b\u0003f3\u0000\u0237\u0238\u0005!\u0000\u0000\u0238"+
		"\u023a\u0003f3\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001"+
		"\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001"+
		"\u0000\u0000\u0000\u023e\u0240\u0005!\u0000\u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000"+
		"\u0000\u0000\u0241\u0236\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0005\'\u0000"+
		"\u0000\u0244w\u0001\u0000\u0000\u0000\u0245\u0246\u0007\u0005\u0000\u0000"+
		"\u0246y\u0001\u0000\u0000\u00009}\u0086\u008a\u0090\u009b\u009f\u00a5"+
		"\u00ae\u00b3\u00bd\u00c5\u00cf\u00e1\u00e4\u00f6\u00f9\u0102\u0106\u010d"+
		"\u0114\u0121\u012d\u0133\u013a\u013f\u014c\u015c\u0163\u0169\u0174\u0179"+
		"\u017f\u0184\u0188\u0191\u0196\u01a2\u01ab\u01b5\u01c6\u01cd\u01d1\u01d5"+
		"\u01e7\u01f3\u01f7\u01ff\u020b\u0217\u0219\u021f\u0227\u022b\u022d\u023b"+
		"\u023f\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
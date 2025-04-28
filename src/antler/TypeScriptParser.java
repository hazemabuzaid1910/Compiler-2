// Generated from C:/Users/hazem/OneDrive/Desktop/4/minmax/Compiler2/src/antler/TypeScriptParser.g4 by ANTLR 4.13.2
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
		Import=1, From=2, Component=3, CommonModule=4, SELECTOR=5, STANDALONE=6, 
		IMPORTS=7, TEMPLATE=8, STYLES=9, TRUE=10, FALSE=11, SemiColon=12, Comma=13, 
		OpenBrace=14, CloseBrace=15, As=16, Star=17, AT_Component=18, AT=19, OpenParen=20, 
		CloseParen=21, OpenBracket=22, CloseBracket=23, Colon=24, BackTick=25, 
		Minus=26, LessThan=27, MoreThan=28, Divide=29, Identifier=30, StringLiteral=31, 
		TAG_OPEN=32, TAG_END=33, TAG_SELF_CLOSE=34, TAG_NAME=35, ATTRIBUTE_NAME=36, 
		EQUALS_SIGN=37, ATTRIBUTE_VALUE=38, ANGULAR_BINDING=39, ANGULAR_DIRECTIVE=40, 
		WS=41, TagName=42, AttributeValue=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_importAlias = 4, RULE_importModule = 5, RULE_importFrom = 6, RULE_componentDeclaration = 7, 
		RULE_componentMetadata = 8, RULE_componentProperty = 9, RULE_selectorProperty = 10, 
		RULE_standaloneProperty = 11, RULE_importsProperty = 12, RULE_templateProperty = 13, 
		RULE_stylesProperty = 14, RULE_htmlNode = 15, RULE_htmlElements = 16, 
		RULE_htmlElement = 17, RULE_htmlTagName = 18, RULE_htmlContent = 19, RULE_singleExpression = 20, 
		RULE_htmlAttribute = 21, RULE_htmlAttributeName = 22, RULE_htmlAttributeValue = 23, 
		RULE_eos = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "importFromBlock", "importAlias", 
			"importModule", "importFrom", "componentDeclaration", "componentMetadata", 
			"componentProperty", "selectorProperty", "standaloneProperty", "importsProperty", 
			"templateProperty", "stylesProperty", "htmlNode", "htmlElements", "htmlElement", 
			"htmlTagName", "htmlContent", "singleExpression", "htmlAttribute", "htmlAttributeName", 
			"htmlAttributeValue", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'Component'", "'CommonModule'", "'selector'", 
			"'standalone'", "'imports'", "'template'", "'styles'", "'true'", "'false'", 
			"';'", "','", "'{'", "'}'", "'as'", "'*'", "'@Component'", "'@'", "'('", 
			"')'", "'['", "']'", "':'", "'`'", "'-'", "'<'", "'>'", "'/'", null, 
			null, null, null, "'/>'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Import", "From", "Component", "CommonModule", "SELECTOR", "STANDALONE", 
			"IMPORTS", "TEMPLATE", "STYLES", "TRUE", "FALSE", "SemiColon", "Comma", 
			"OpenBrace", "CloseBrace", "As", "Star", "AT_Component", "AT", "OpenParen", 
			"CloseParen", "OpenBracket", "CloseBracket", "Colon", "BackTick", "Minus", 
			"LessThan", "MoreThan", "Divide", "Identifier", "StringLiteral", "TAG_OPEN", 
			"TAG_END", "TAG_SELF_CLOSE", "TAG_NAME", "ATTRIBUTE_NAME", "EQUALS_SIGN", 
			"ATTRIBUTE_VALUE", "ANGULAR_BINDING", "ANGULAR_DIRECTIVE", "WS", "TagName", 
			"AttributeValue"
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Import || _la==AT_Component );
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
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				importStatement();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(56);
					match(Comma);
					setState(57);
					importStatement();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case AT_Component:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				componentDeclaration();
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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
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
			setState(66);
			match(Import);
			setState(67);
			importFromBlock();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(68);
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
	public static class ImportFromBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public List<ImportModuleContext> importModule() {
			return getRuleContexts(ImportModuleContext.class);
		}
		public ImportModuleContext importModule(int i) {
			return getRuleContext(ImportModuleContext.class,i);
		}
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFromBlock);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(OpenBrace);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					importModule();
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(73);
						match(Comma);
						setState(74);
						importModule();
						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(80);
					importAlias();
					}
					break;
				}
				setState(83);
				match(CloseBrace);
				setState(84);
				importFrom();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(StringLiteral);
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(87);
					eos();
					}
					break;
				}
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
		public ImportModuleContext importModule() {
			return getRuleContext(ImportModuleContext.class,0);
		}
		public TerminalNode Star() { return getToken(TypeScriptParser.Star, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Component:
			case CommonModule:
			case Identifier:
				{
				setState(92);
				importModule();
				}
				break;
			case Star:
				{
				setState(93);
				match(Star);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(96);
				match(As);
				setState(97);
				match(Identifier);
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
	public static class ImportModuleContext extends ParserRuleContext {
		public TerminalNode Component() { return getToken(TypeScriptParser.Component, 0); }
		public TerminalNode CommonModule() { return getToken(TypeScriptParser.CommonModule, 0); }
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public ImportModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterImportModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitImportModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitImportModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleContext importModule() throws RecognitionException {
		ImportModuleContext _localctx = new ImportModuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073741848L) != 0)) ) {
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
			setState(102);
			match(From);
			setState(103);
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
			setState(105);
			match(AT_Component);
			setState(106);
			match(OpenParen);
			setState(107);
			componentMetadata();
			setState(108);
			match(CloseParen);
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
			setState(110);
			match(OpenBrace);
			setState(111);
			componentProperty();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(112);
				match(Comma);
				setState(113);
				componentProperty();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public StandalonePropertyContext standaloneProperty() {
			return getRuleContext(StandalonePropertyContext.class,0);
		}
		public ImportsPropertyContext importsProperty() {
			return getRuleContext(ImportsPropertyContext.class,0);
		}
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public StylesPropertyContext stylesProperty() {
			return getRuleContext(StylesPropertyContext.class,0);
		}
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperty);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				selectorProperty();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				standaloneProperty();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				importsProperty();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				templateProperty();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
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
			setState(128);
			match(SELECTOR);
			setState(129);
			match(Colon);
			setState(130);
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
		public TerminalNode TRUE() { return getToken(TypeScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TypeScriptParser.FALSE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STANDALONE);
			setState(133);
			match(Colon);
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
			setState(136);
			match(IMPORTS);
			setState(137);
			match(Colon);
			setState(138);
			match(OpenBracket);
			setState(139);
			importModule();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(140);
					match(Comma);
					setState(141);
					importModule();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(149);
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
			setState(151);
			match(TEMPLATE);
			setState(152);
			match(Colon);
			setState(153);
			match(BackTick);
			setState(154);
			htmlNode();
			setState(155);
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
			setState(157);
			match(STYLES);
			setState(158);
			match(Colon);
			setState(159);
			match(OpenBracket);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(160);
				match(StringLiteral);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(161);
					match(Comma);
					setState(162);
					match(StringLiteral);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
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
			setState(172);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				htmlElement();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LessThan );
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
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(TypeScriptParser.Divide, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(LessThan);
				setState(180);
				htmlTagName();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(181);
					htmlAttribute();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(MoreThan);
				setState(188);
				htmlContent();
				setState(189);
				match(LessThan);
				setState(190);
				match(Divide);
				setState(191);
				htmlTagName();
				setState(192);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LessThan);
				setState(195);
				htmlTagName();
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						htmlAttribute();
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(202);
				htmlContent();
				setState(203);
				match(Divide);
				setState(204);
				match(MoreThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(LessThan);
				setState(207);
				htmlTagName();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(208);
					htmlAttribute();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(Divide);
				setState(215);
				match(MoreThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(LessThan);
				setState(218);
				htmlTagName();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(219);
					htmlAttribute();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(MoreThan);
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
		enterRule(_localctx, 36, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			singleExpression();
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_singleExpression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				htmlElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode EQUALS_SIGN() { return getToken(TypeScriptParser.EQUALS_SIGN, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			htmlAttributeName();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS_SIGN) {
				{
				setState(238);
				match(EQUALS_SIGN);
				setState(239);
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
	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TagName() { return getToken(TypeScriptParser.TagName, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TypeScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TypeScriptParser.Identifier, i);
		}
		public List<TerminalNode> Minus() { return getTokens(TypeScriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(TypeScriptParser.Minus, i);
		}
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlAttributeName);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(TagName);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(Identifier);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Minus) {
					{
					{
					setState(244);
					match(Minus);
					setState(245);
					match(Identifier);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode AttributeValue() { return getToken(TypeScriptParser.AttributeValue, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScriptParserListener ) ((TypeScriptParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScriptParserVisitor ) return ((TypeScriptParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlAttributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==AttributeValue) ) {
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
		enterRule(_localctx, 48, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001"+
		"\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0003\u0003R\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Y\b\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004_\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"s\b\b\n\b\f\bv\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u007f\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u008f\b\f\n\f\f\f\u0092\t\f\u0003\f\u0094\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a4"+
		"\b\u000e\n\u000e\f\u000e\u00a7\t\u000e\u0003\u000e\u00a9\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00b0"+
		"\b\u0010\u000b\u0010\f\u0010\u00b1\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00b7\b\u0011\n\u0011\f\u0011\u00ba\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c6\b\u0011\n\u0011\f\u0011"+
		"\u00c9\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00d2\b\u0011\n\u0011\f\u0011\u00d5"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00dd\b\u0011\n\u0011\f\u0011\u00e0\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00e4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00ec\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00f1\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00f7\b\u0016\n\u0016\f\u0016\u00fa"+
		"\t\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0004\u0002\u0000\u0003\u0004\u001e\u001e\u0001\u0000\n\u000b\u0002\u0000"+
		"\u001f\u001f++\u0001\u0001\f\f\u0107\u00003\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006Z\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000"+
		"\ff\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010n\u0001"+
		"\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000"+
		"\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u0088\u0001\u0000"+
		"\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000"+
		"\u0000\u0000\u001e\u00ac\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000"+
		"\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000"+
		"&\u00e7\u0001\u0000\u0000\u0000(\u00eb\u0001\u0000\u0000\u0000*\u00ed"+
		"\u0001\u0000\u0000\u0000,\u00fb\u0001\u0000\u0000\u0000.\u00fd\u0001\u0000"+
		"\u0000\u00000\u00ff\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u00007<\u0003"+
		"\u0004\u0002\u000089\u0005\r\u0000\u00009;\u0003\u0004\u0002\u0000:8\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=A\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?A\u0003\u000e\u0007\u0000@7\u0001\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0005\u0001\u0000\u0000"+
		"CE\u0003\u0006\u0003\u0000DF\u00030\u0018\u0000ED\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GQ\u0005\u000e"+
		"\u0000\u0000HM\u0003\n\u0005\u0000IJ\u0005\r\u0000\u0000JL\u0003\n\u0005"+
		"\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NR\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PR\u0003\b\u0004\u0000QH\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u000f\u0000\u0000"+
		"TU\u0003\f\u0006\u0000U[\u0001\u0000\u0000\u0000VX\u0005\u001f\u0000\u0000"+
		"WY\u00030\u0018\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZG\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000"+
		"\u0000[\u0007\u0001\u0000\u0000\u0000\\_\u0003\n\u0005\u0000]_\u0005\u0011"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0010\u0000\u0000ac\u0005\u001e\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000"+
		"\u0000de\u0007\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0002\u0000\u0000gh\u0005\u001f\u0000\u0000h\r\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0012\u0000\u0000jk\u0005\u0014\u0000\u0000kl\u0003\u0010\b\u0000"+
		"lm\u0005\u0015\u0000\u0000m\u000f\u0001\u0000\u0000\u0000no\u0005\u000e"+
		"\u0000\u0000ot\u0003\u0012\t\u0000pq\u0005\r\u0000\u0000qs\u0003\u0012"+
		"\t\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wx\u0005\u000f\u0000\u0000x\u0011\u0001\u0000\u0000"+
		"\u0000y\u007f\u0003\u0014\n\u0000z\u007f\u0003\u0016\u000b\u0000{\u007f"+
		"\u0003\u0018\f\u0000|\u007f\u0003\u001a\r\u0000}\u007f\u0003\u001c\u000e"+
		"\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0013\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081"+
		"\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0005\u001f\u0000\u0000\u0083"+
		"\u0015\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085"+
		"\u0086\u0005\u0018\u0000\u0000\u0086\u0087\u0007\u0001\u0000\u0000\u0087"+
		"\u0017\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0007\u0000\u0000\u0089"+
		"\u008a\u0005\u0018\u0000\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b"+
		"\u0093\u0003\n\u0005\u0000\u008c\u008d\u0005\r\u0000\u0000\u008d\u008f"+
		"\u0003\n\u0005\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0017\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\b\u0000\u0000\u0098\u0099\u0005\u0018\u0000\u0000\u0099\u009a\u0005\u0019"+
		"\u0000\u0000\u009a\u009b\u0003\u001e\u000f\u0000\u009b\u009c\u0005\u0019"+
		"\u0000\u0000\u009c\u001b\u0001\u0000\u0000\u0000\u009d\u009e\u0005\t\u0000"+
		"\u0000\u009e\u009f\u0005\u0018\u0000\u0000\u009f\u00a8\u0005\u0016\u0000"+
		"\u0000\u00a0\u00a5\u0005\u001f\u0000\u0000\u00a1\u00a2\u0005\r\u0000\u0000"+
		"\u00a2\u00a4\u0005\u001f\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u001d\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0003 \u0010\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0003\"\u0011\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2!\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u001b\u0000\u0000\u00b4\u00b8\u0003$\u0012\u0000\u00b5\u00b7\u0003*\u0015"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000\u00bc\u00bd\u0003&\u0013\u0000"+
		"\u00bd\u00be\u0005\u001b\u0000\u0000\u00be\u00bf\u0005\u001d\u0000\u0000"+
		"\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0005\u001c\u0000\u0000\u00c1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001b\u0000\u0000\u00c3"+
		"\u00c7\u0003$\u0012\u0000\u00c4\u00c6\u0003*\u0015\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003"+
		"&\u0013\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc\u00cd\u0005\u001c"+
		"\u0000\u0000\u00cd\u00e4\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001b"+
		"\u0000\u0000\u00cf\u00d3\u0003$\u0012\u0000\u00d0\u00d2\u0003*\u0015\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u001d\u0000\u0000\u00d7\u00d8\u0005\u001c\u0000\u0000"+
		"\u00d8\u00e4\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001b\u0000\u0000"+
		"\u00da\u00de\u0003$\u0012\u0000\u00db\u00dd\u0003*\u0015\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u001c\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00b3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00c2\u0001\u0000\u0000\u0000\u00e3\u00ce"+
		"\u0001\u0000\u0000\u0000\u00e3\u00d9\u0001\u0000\u0000\u0000\u00e4#\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u001e\u0000\u0000\u00e6%\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0003(\u0014\u0000\u00e8\'\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0003\"\u0011\u0000\u00ea\u00ec\u0005\u001e\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00f0\u0003,\u0016\u0000\u00ee\u00ef"+
		"\u0005%\u0000\u0000\u00ef\u00f1\u0003.\u0017\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1+\u0001\u0000\u0000"+
		"\u0000\u00f2\u00fc\u0005*\u0000\u0000\u00f3\u00f8\u0005\u001e\u0000\u0000"+
		"\u00f4\u00f5\u0005\u001a\u0000\u0000\u00f5\u00f7\u0005\u001e\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fc-\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0002\u0000\u0000\u00fe"+
		"/\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0003\u0000\u0000\u01001\u0001"+
		"\u0000\u0000\u0000\u001a5<@EMQXZ^bt~\u0090\u0093\u00a5\u00a8\u00b1\u00b8"+
		"\u00c7\u00d3\u00de\u00e3\u00eb\u00f0\u00f8\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
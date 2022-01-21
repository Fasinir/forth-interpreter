// Generated from C:/Users/filip/Desktop/Java/miak_interpreter/src/main/antlr4/pl.edu.agh.interpreter\Forth.g4 by ANTLR 4.9.2
package pl.edu.agh.interpreter.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ForthParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, INTEGER=42, IDENTIFIER=43, CHARACTER=44, 
		LETTER=45, WHITESPACE=46, STRING=47;
	public static final int
		RULE_forth = 0, RULE_zeroOrMoreStatement = 1, RULE_statement = 2, RULE_regularStatement = 3, 
		RULE_push = 4, RULE_printString = 5, RULE_constant = 6, RULE_variable = 7, 
		RULE_ifElse = 8, RULE_ifRegular = 9, RULE_defineFun = 10, RULE_doLoop = 11, 
		RULE_untilLoop = 12, RULE_callI = 13, RULE_arithmetic = 14, RULE_comparison = 15, 
		RULE_modifyVar = 16, RULE_stackManipulation = 17, RULE_printSimple = 18, 
		RULE_set = 19, RULE_deref = 20, RULE_printVar = 21, RULE_zeroOrMoreRegularStatement = 22, 
		RULE_callEnv = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"forth", "zeroOrMoreStatement", "statement", "regularStatement", "push", 
			"printString", "constant", "variable", "ifElse", "ifRegular", "defineFun", 
			"doLoop", "untilLoop", "callI", "arithmetic", "comparison", "modifyVar", 
			"stackManipulation", "printSimple", "set", "deref", "printVar", "zeroOrMoreRegularStatement", 
			"callEnv"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'constant'", "'variable'", "'if'", "'else'", "'then'", 
			"':'", "';'", "'do'", "'loop'", "'begin'", "'until'", "'i'", "'+'", "'-'", 
			"'*'", "'/'", "'mod'", "'>'", "'<'", "'='", "'>='", "'<='", "'+!'", "'-!'", 
			"'*!'", "'/!'", "'mod!'", "'and'", "'or'", "'invert'", "'dup'", "'drop'", 
			"'swap'", "'over'", "'rot'", "'emit'", "'cr'", "'!'", "'@'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INTEGER", "IDENTIFIER", "CHARACTER", 
			"LETTER", "WHITESPACE", "STRING"
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
	public String getGrammarFileName() { return "Forth.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ForthParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ForthContext extends ParserRuleContext {
		public ZeroOrMoreStatementContext zeroOrMoreStatement() {
			return getRuleContext(ZeroOrMoreStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ForthParser.EOF, 0); }
		public ForthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterForth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitForth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitForth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForthContext forth() throws RecognitionException {
		ForthContext _localctx = new ForthContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			zeroOrMoreStatement();
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(49);
				match(EOF);
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

	public static class ZeroOrMoreStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ZeroOrMoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroOrMoreStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterZeroOrMoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitZeroOrMoreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitZeroOrMoreStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroOrMoreStatementContext zeroOrMoreStatement() throws RecognitionException {
		ZeroOrMoreStatementContext _localctx = new ZeroOrMoreStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_zeroOrMoreStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(WHITESPACE);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					statement();
					setState(60); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(59);
							match(WHITESPACE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(62); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(69);
				statement();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(72);
				match(WHITESPACE);
				}
				}
				setState(77);
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

	public static class StatementContext extends ParserRuleContext {
		public RegularStatementContext regularStatement() {
			return getRuleContext(RegularStatementContext.class,0);
		}
		public DefineFunContext defineFun() {
			return getRuleContext(DefineFunContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case INTEGER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				regularStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				defineFun();
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

	public static class RegularStatementContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CallEnvContext callEnv() {
			return getRuleContext(CallEnvContext.class,0);
		}
		public PrintStringContext printString() {
			return getRuleContext(PrintStringContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public IfRegularContext ifRegular() {
			return getRuleContext(IfRegularContext.class,0);
		}
		public DoLoopContext doLoop() {
			return getRuleContext(DoLoopContext.class,0);
		}
		public UntilLoopContext untilLoop() {
			return getRuleContext(UntilLoopContext.class,0);
		}
		public PrintSimpleContext printSimple() {
			return getRuleContext(PrintSimpleContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public PrintVarContext printVar() {
			return getRuleContext(PrintVarContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ModifyVarContext modifyVar() {
			return getRuleContext(ModifyVarContext.class,0);
		}
		public StackManipulationContext stackManipulation() {
			return getRuleContext(StackManipulationContext.class,0);
		}
		public CallIContext callI() {
			return getRuleContext(CallIContext.class,0);
		}
		public RegularStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterRegularStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitRegularStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitRegularStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularStatementContext regularStatement() throws RecognitionException {
		RegularStatementContext _localctx = new RegularStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regularStatement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				push();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				callEnv();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				printString();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				ifElse();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				ifRegular();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				doLoop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				untilLoop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				printSimple();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				set();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(93);
				deref();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(94);
				printVar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(95);
				arithmetic();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(96);
				comparison();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(97);
				modifyVar();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(98);
				stackManipulation();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(99);
				callI();
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

	public static class PushContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ForthParser.INTEGER, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(INTEGER);
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

	public static class PrintStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ForthParser.STRING, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public PrintStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitPrintString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStringContext printString() throws RecognitionException {
		PrintStringContext _localctx = new PrintStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(105);
				match(WHITESPACE);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(STRING);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ForthParser.IDENTIFIER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__1);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				match(WHITESPACE);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(119);
			match(IDENTIFIER);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ForthParser.IDENTIFIER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__2);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(WHITESPACE);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(127);
			match(IDENTIFIER);
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

	public static class IfElseContext extends ParserRuleContext {
		public List<ZeroOrMoreRegularStatementContext> zeroOrMoreRegularStatement() {
			return getRuleContexts(ZeroOrMoreRegularStatementContext.class);
		}
		public ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement(int i) {
			return getRuleContext(ZeroOrMoreRegularStatementContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifElse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__3);
			setState(131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(133); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(135);
			zeroOrMoreRegularStatement();
			setState(136);
			match(T__4);
			setState(138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(137);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(142);
			zeroOrMoreRegularStatement();
			setState(143);
			match(T__5);
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

	public static class IfRegularContext extends ParserRuleContext {
		public ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement() {
			return getRuleContext(ZeroOrMoreRegularStatementContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public IfRegularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRegular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterIfRegular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitIfRegular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitIfRegular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRegularContext ifRegular() throws RecognitionException {
		IfRegularContext _localctx = new IfRegularContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifRegular);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__3);
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(151);
			zeroOrMoreRegularStatement();
			setState(152);
			match(T__5);
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

	public static class DefineFunContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ForthParser.IDENTIFIER, 0); }
		public ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement() {
			return getRuleContext(ZeroOrMoreRegularStatementContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public DefineFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterDefineFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitDefineFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitDefineFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineFunContext defineFun() throws RecognitionException {
		DefineFunContext _localctx = new DefineFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineFun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(WHITESPACE);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(160);
			match(IDENTIFIER);
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(166);
			zeroOrMoreRegularStatement();
			setState(167);
			match(T__7);
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

	public static class DoLoopContext extends ParserRuleContext {
		public ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement() {
			return getRuleContext(ZeroOrMoreRegularStatementContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public DoLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterDoLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitDoLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitDoLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoLoopContext doLoop() throws RecognitionException {
		DoLoopContext _localctx = new DoLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			setState(171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(170);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(175);
			zeroOrMoreRegularStatement();
			setState(176);
			match(T__9);
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

	public static class UntilLoopContext extends ParserRuleContext {
		public ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement() {
			return getRuleContext(ZeroOrMoreRegularStatementContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public UntilLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterUntilLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitUntilLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitUntilLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilLoopContext untilLoop() throws RecognitionException {
		UntilLoopContext _localctx = new UntilLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_untilLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__10);
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(179);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(184);
			zeroOrMoreRegularStatement();
			setState(185);
			match(T__11);
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

	public static class CallIContext extends ParserRuleContext {
		public CallIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterCallI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitCallI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitCallI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIContext callI() throws RecognitionException {
		CallIContext _localctx = new CallIContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class ModifyVarContext extends ParserRuleContext {
		public ModifyVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterModifyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitModifyVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitModifyVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyVarContext modifyVar() throws RecognitionException {
		ModifyVarContext _localctx = new ModifyVarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifyVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class StackManipulationContext extends ParserRuleContext {
		public StackManipulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackManipulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterStackManipulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitStackManipulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitStackManipulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackManipulationContext stackManipulation() throws RecognitionException {
		StackManipulationContext _localctx = new StackManipulationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stackManipulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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

	public static class PrintSimpleContext extends ParserRuleContext {
		public PrintSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterPrintSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitPrintSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitPrintSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSimpleContext printSimple() throws RecognitionException {
		PrintSimpleContext _localctx = new PrintSimpleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__0);
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

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__38);
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

	public static class DerefContext extends ParserRuleContext {
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__39);
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

	public static class PrintVarContext extends ParserRuleContext {
		public PrintVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterPrintVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitPrintVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintVarContext printVar() throws RecognitionException {
		PrintVarContext _localctx = new PrintVarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__40);
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

	public static class ZeroOrMoreRegularStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(ForthParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ForthParser.WHITESPACE, i);
		}
		public List<RegularStatementContext> regularStatement() {
			return getRuleContexts(RegularStatementContext.class);
		}
		public RegularStatementContext regularStatement(int i) {
			return getRuleContext(RegularStatementContext.class,i);
		}
		public ZeroOrMoreRegularStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroOrMoreRegularStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterZeroOrMoreRegularStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitZeroOrMoreRegularStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitZeroOrMoreRegularStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroOrMoreRegularStatementContext zeroOrMoreRegularStatement() throws RecognitionException {
		ZeroOrMoreRegularStatementContext _localctx = new ZeroOrMoreRegularStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_zeroOrMoreRegularStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					match(WHITESPACE);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					regularStatement();
					setState(213); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(212);
							match(WHITESPACE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(215); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(222);
				regularStatement();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(225);
				match(WHITESPACE);
				}
				}
				setState(230);
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

	public static class CallEnvContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ForthParser.IDENTIFIER, 0); }
		public CallEnvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callEnv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).enterCallEnv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForthListener ) ((ForthListener)listener).exitCallEnv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForthVisitor ) return ((ForthVisitor<? extends T>)visitor).visitCallEnv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallEnvContext callEnv() throws RecognitionException {
		CallEnvContext _localctx = new CallEnvContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_callEnv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00ec\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\6\3?\n\3\r\3\16"+
		"\3@\7\3C\n\3\f\3\16\3F\13\3\3\3\5\3I\n\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\4\3\4\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3"+
		"\7\3\7\3\b\3\b\6\bv\n\b\r\b\16\bw\3\b\3\b\3\t\3\t\6\t~\n\t\r\t\16\t\177"+
		"\3\t\3\t\3\n\3\n\6\n\u0086\n\n\r\n\16\n\u0087\3\n\3\n\3\n\6\n\u008d\n"+
		"\n\r\n\16\n\u008e\3\n\3\n\3\n\3\13\3\13\6\13\u0096\n\13\r\13\16\13\u0097"+
		"\3\13\3\13\3\13\3\f\3\f\6\f\u009f\n\f\r\f\16\f\u00a0\3\f\3\f\6\f\u00a5"+
		"\n\f\r\f\16\f\u00a6\3\f\3\f\3\f\3\r\3\r\6\r\u00ae\n\r\r\r\16\r\u00af\3"+
		"\r\3\r\3\r\3\16\3\16\6\16\u00b7\n\16\r\16\16\16\u00b8\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4\13\30\3\30\3"+
		"\30\6\30\u00d8\n\30\r\30\16\30\u00d9\7\30\u00dc\n\30\f\30\16\30\u00df"+
		"\13\30\3\30\5\30\u00e2\n\30\3\30\7\30\u00e5\n\30\f\30\16\30\u00e8\13\30"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\6\3\2\20\24\3\2\25\31\3\2\32\36\3\2\37(\2\u00fa\2\62\3\2\2\2\4"+
		"9\3\2\2\2\6R\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16s\3\2\2\2\20{"+
		"\3\2\2\2\22\u0083\3\2\2\2\24\u0093\3\2\2\2\26\u009c\3\2\2\2\30\u00ab\3"+
		"\2\2\2\32\u00b4\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2\2"+
		"\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00c7\3\2\2\2(\u00c9\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00cd\3\2\2\2.\u00d2\3\2\2\2\60\u00e9\3\2\2\2\62\64\5\4\3\2"+
		"\63\65\7\2\2\3\64\63\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\668\7\60\2\2\67"+
		"\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:D\3\2\2\2;9\3\2\2\2<>\5\6"+
		"\4\2=?\7\60\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B<\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5\6\4\2HG\3"+
		"\2\2\2HI\3\2\2\2IM\3\2\2\2JL\7\60\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN"+
		"\3\2\2\2N\5\3\2\2\2OM\3\2\2\2PS\5\b\5\2QS\5\26\f\2RP\3\2\2\2RQ\3\2\2\2"+
		"S\7\3\2\2\2Tg\5\n\6\2Ug\5\16\b\2Vg\5\20\t\2Wg\5\60\31\2Xg\5\f\7\2Yg\5"+
		"\22\n\2Zg\5\24\13\2[g\5\30\r\2\\g\5\32\16\2]g\5&\24\2^g\5(\25\2_g\5*\26"+
		"\2`g\5,\27\2ag\5\36\20\2bg\5 \21\2cg\5\"\22\2dg\5$\23\2eg\5\34\17\2fT"+
		"\3\2\2\2fU\3\2\2\2fV\3\2\2\2fW\3\2\2\2fX\3\2\2\2fY\3\2\2\2fZ\3\2\2\2f"+
		"[\3\2\2\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2"+
		"fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hi\7,\2\2i\13\3\2\2"+
		"\2jn\7\3\2\2km\7\60\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2"+
		"\2\2pn\3\2\2\2qr\7\61\2\2r\r\3\2\2\2su\7\4\2\2tv\7\60\2\2ut\3\2\2\2vw"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7-\2\2z\17\3\2\2\2{}\7\5\2\2"+
		"|~\7\60\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7-\2\2\u0082\21\3\2\2\2\u0083\u0085\7\6\2\2"+
		"\u0084\u0086\7\60\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5.\30\2\u008a"+
		"\u008c\7\7\2\2\u008b\u008d\7\60\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\5.\30\2\u0091\u0092\7\b\2\2\u0092\23\3\2\2\2\u0093\u0095\7\6\2"+
		"\2\u0094\u0096\7\60\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5."+
		"\30\2\u009a\u009b\7\b\2\2\u009b\25\3\2\2\2\u009c\u009e\7\t\2\2\u009d\u009f"+
		"\7\60\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\7-\2\2\u00a3\u00a5"+
		"\7\60\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5.\30\2\u00a9\u00aa"+
		"\7\n\2\2\u00aa\27\3\2\2\2\u00ab\u00ad\7\13\2\2\u00ac\u00ae\7\60\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\f\2\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b6\7\r\2\2\u00b5\u00b7\7\60\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc\7\16\2\2\u00bc\33\3\2\2\2\u00bd"+
		"\u00be\7\17\2\2\u00be\35\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0\37\3\2\2\2"+
		"\u00c1\u00c2\t\3\2\2\u00c2!\3\2\2\2\u00c3\u00c4\t\4\2\2\u00c4#\3\2\2\2"+
		"\u00c5\u00c6\t\5\2\2\u00c6%\3\2\2\2\u00c7\u00c8\7\3\2\2\u00c8\'\3\2\2"+
		"\2\u00c9\u00ca\7)\2\2\u00ca)\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc+\3\2\2\2"+
		"\u00cd\u00ce\7+\2\2\u00ce-\3\2\2\2\u00cf\u00d1\7\60\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00dd\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d8\7\60"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5\7\60\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7/\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\61\3\2\2\2\31\649@DHMRf"+
		"nw\177\u0087\u008e\u0097\u00a0\u00a6\u00af\u00b8\u00d2\u00d9\u00dd\u00e1"+
		"\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
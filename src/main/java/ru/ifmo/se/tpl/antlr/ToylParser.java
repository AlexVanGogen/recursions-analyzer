// Generated from /Users/alexvangogen/Fall/other/type-inference/recursions-analyzer/src/main/kotlin/ru/ifmo/se/tpl/antlr/Toyl.g4 by ANTLR 4.7
package ru.ifmo.se.tpl.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToylParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ONE_LINE_COMMENT=2, MULTILINE_COMMENT=3, IF=4, THEN=5, ELSE=6, WHILE=7, 
		RETURN=8, FUN=9, VARDECL=10, NUMTYPE=11, BOOLTYPE=12, TRUE=13, FALSE=14, 
		SEP=15, COLON=16, COMMA=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		PLUS=22, MINUS=23, MUL=24, DIV=25, MOD=26, EQ=27, NEQ=28, LT=29, LEQ=30, 
		GT=31, GEQ=32, AND=33, OR=34, ASSIGN=35, NUM=36, VAR=37;
	public static final int
		RULE_file = 0, RULE_statementList = 1, RULE_statement = 2, RULE_condition = 3, 
		RULE_expression = 4, RULE_procedureDecl = 5, RULE_procedureCall = 6, RULE_declArgumentsList = 7, 
		RULE_callArgumentsList = 8, RULE_functionName = 9, RULE_parameterDecl = 10, 
		RULE_variableDecl = 11, RULE_variableType = 12, RULE_variable = 13, RULE_literal = 14;
	public static final String[] ruleNames = {
		"file", "statementList", "statement", "condition", "expression", "procedureDecl", 
		"procedureCall", "declArgumentsList", "callArgumentsList", "functionName", 
		"parameterDecl", "variableDecl", "variableType", "variable", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'if'", "'then'", "'else'", "'while'", "'return'", 
		"'fun'", "'var'", "'num'", "'bool'", "'true'", "'false'", "';'", "':'", 
		"','", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ONE_LINE_COMMENT", "MULTILINE_COMMENT", "IF", "THEN", "ELSE", 
		"WHILE", "RETURN", "FUN", "VARDECL", "NUMTYPE", "BOOLTYPE", "TRUE", "FALSE", 
		"SEP", "COLON", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS", 
		"MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "LEQ", "GT", "GEQ", "AND", 
		"OR", "ASSIGN", "NUM", "VAR"
	};
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
	public String getGrammarFileName() { return "Toyl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToylParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			statementList();
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FUN) | (1L << VARDECL) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << NUM) | (1L << VAR))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
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
		public StatementListContext trueBranch;
		public StatementListContext falseBranch;
		public StatementListContext loopBranch;
		public ProcedureDeclContext procedureDecl() {
			return getRuleContext(ProcedureDeclContext.class,0);
		}
		public TerminalNode IF() { return getToken(ToylParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ToylParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ToylParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(ToylParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ToylParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ToylParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ToylParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ToylParser.RBRACE, i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ToylParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ToylParser.WHILE, 0); }
		public TerminalNode VARDECL() { return getToken(ToylParser.VARDECL, 0); }
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ToylParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ToylParser.SEP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				procedureDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(IF);
				setState(40);
				match(LPAREN);
				setState(41);
				condition();
				setState(42);
				match(RPAREN);
				setState(43);
				match(THEN);
				setState(44);
				match(LBRACE);
				setState(45);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(46);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(IF);
				setState(49);
				match(LPAREN);
				setState(50);
				condition();
				setState(51);
				match(RPAREN);
				setState(52);
				match(THEN);
				setState(53);
				match(LBRACE);
				setState(54);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(55);
				match(RBRACE);
				setState(56);
				match(ELSE);
				setState(57);
				match(LBRACE);
				setState(58);
				((StatementContext)_localctx).falseBranch = statementList();
				setState(59);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(WHILE);
				setState(62);
				match(LPAREN);
				setState(63);
				condition();
				setState(64);
				match(RPAREN);
				setState(65);
				match(LBRACE);
				setState(66);
				((StatementContext)_localctx).loopBranch = statementList();
				setState(67);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(VARDECL);
				setState(70);
				variableDecl();
				setState(71);
				match(ASSIGN);
				setState(72);
				expression(0);
				setState(73);
				match(SEP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				variable();
				setState(76);
				match(ASSIGN);
				setState(77);
				expression(0);
				setState(78);
				match(SEP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				expression(0);
				setState(81);
				match(SEP);
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

	public static class ConditionContext extends ParserRuleContext {
		public boolean value;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public ExpressionContext nestedExpression;
		public ExpressionContext trueBranch;
		public ExpressionContext falseBranch;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode LPAREN() { return getToken(ToylParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ToylParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public TerminalNode IF() { return getToken(ToylParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ToylParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ToylParser.ELSE, 0); }
		public TerminalNode MUL() { return getToken(ToylParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ToylParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ToylParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ToylParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ToylParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(ToylParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(ToylParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(ToylParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ToylParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(ToylParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ToylParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(ToylParser.AND, 0); }
		public TerminalNode OR() { return getToken(ToylParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitExpression(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88);
				match(LPAREN);
				setState(89);
				((ExpressionContext)_localctx).nestedExpression = expression(0);
				setState(90);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(92);
				variable();
				}
				break;
			case 3:
				{
				setState(93);
				literal();
				}
				break;
			case 4:
				{
				setState(94);
				procedureCall();
				}
				break;
			case 5:
				{
				setState(95);
				match(IF);
				setState(96);
				match(LPAREN);
				setState(97);
				condition();
				setState(98);
				match(RPAREN);
				setState(99);
				match(THEN);
				setState(100);
				((ExpressionContext)_localctx).trueBranch = expression(0);
				setState(101);
				match(ELSE);
				setState(102);
				((ExpressionContext)_localctx).falseBranch = expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						((ExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(119);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ProcedureDeclContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(ToylParser.FUN, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ToylParser.LPAREN, 0); }
		public DeclArgumentsListContext declArgumentsList() {
			return getRuleContext(DeclArgumentsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ToylParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ToylParser.LBRACE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ToylParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(ToylParser.COLON, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ToylParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ToylParser.SEP, 0); }
		public ProcedureDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterProcedureDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitProcedureDecl(this);
		}
	}

	public final ProcedureDeclContext procedureDecl() throws RecognitionException {
		ProcedureDeclContext _localctx = new ProcedureDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FUN);
			setState(127);
			functionName();
			setState(128);
			match(LPAREN);
			setState(129);
			declArgumentsList();
			setState(130);
			match(RPAREN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(131);
				match(COLON);
				setState(132);
				variableType();
				}
			}

			setState(135);
			match(LBRACE);
			setState(136);
			statementList();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(137);
				match(RETURN);
				setState(138);
				expression(0);
				setState(139);
				match(SEP);
				}
			}

			setState(143);
			match(RBRACE);
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ToylParser.LPAREN, 0); }
		public CallArgumentsListContext callArgumentsList() {
			return getRuleContext(CallArgumentsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ToylParser.RPAREN, 0); }
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitProcedureCall(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			functionName();
			setState(146);
			match(LPAREN);
			setState(147);
			callArgumentsList();
			setState(148);
			match(RPAREN);
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

	public static class DeclArgumentsListContext extends ParserRuleContext {
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToylParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToylParser.COMMA, i);
		}
		public DeclArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declArgumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterDeclArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitDeclArgumentsList(this);
		}
	}

	public final DeclArgumentsListContext declArgumentsList() throws RecognitionException {
		DeclArgumentsListContext _localctx = new DeclArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declArgumentsList);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				parameterDecl();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					parameterDecl();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CallArgumentsListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToylParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ToylParser.COMMA, i);
		}
		public CallArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterCallArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitCallArgumentsList(this);
		}
	}

	public final CallArgumentsListContext callArgumentsList() throws RecognitionException {
		CallArgumentsListContext _localctx = new CallArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callArgumentsList);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case TRUE:
			case FALSE:
			case LPAREN:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				expression(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					expression(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ToylParser.VAR, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(VAR);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ToylParser.COLON, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			variable();
			setState(175);
			match(COLON);
			setState(176);
			variableType();
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

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ToylParser.COLON, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			variable();
			setState(179);
			match(COLON);
			setState(180);
			variableType();
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

	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode NUMTYPE() { return getToken(ToylParser.NUMTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(ToylParser.BOOLTYPE, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitVariableType(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==NUMTYPE || _la==BOOLTYPE) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ToylParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(VAR);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ToylParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(ToylParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ToylParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToylListener ) ((ToylListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM))) != 0)) ) {
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6k\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6|\n\6\f\6\16\6\177\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\3\t\5\t\u00a2\n\t\3\n\3\n"+
		"\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\3\n"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\t\3\2\32\34\3\2\30\31\3\2"+
		"\37\"\3\2\35\36\3\2#$\3\2\r\16\4\2\17\20&&\2\u00c5\2 \3\2\2\2\4%\3\2\2"+
		"\2\6U\3\2\2\2\bW\3\2\2\2\nj\3\2\2\2\f\u0080\3\2\2\2\16\u0093\3\2\2\2\20"+
		"\u00a1\3\2\2\2\22\u00ac\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0\3\2\2\2\30\u00b4"+
		"\3\2\2\2\32\u00b8\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2 !\5\4\3\2"+
		"!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3"+
		"\2\2\2\'%\3\2\2\2(V\5\f\7\2)*\7\6\2\2*+\7\24\2\2+,\5\b\5\2,-\7\25\2\2"+
		"-.\7\7\2\2./\7\26\2\2/\60\5\4\3\2\60\61\7\27\2\2\61V\3\2\2\2\62\63\7\6"+
		"\2\2\63\64\7\24\2\2\64\65\5\b\5\2\65\66\7\25\2\2\66\67\7\7\2\2\678\7\26"+
		"\2\289\5\4\3\29:\7\27\2\2:;\7\b\2\2;<\7\26\2\2<=\5\4\3\2=>\7\27\2\2>V"+
		"\3\2\2\2?@\7\t\2\2@A\7\24\2\2AB\5\b\5\2BC\7\25\2\2CD\7\26\2\2DE\5\4\3"+
		"\2EF\7\27\2\2FV\3\2\2\2GH\7\f\2\2HI\5\30\r\2IJ\7%\2\2JK\5\n\6\2KL\7\21"+
		"\2\2LV\3\2\2\2MN\5\34\17\2NO\7%\2\2OP\5\n\6\2PQ\7\21\2\2QV\3\2\2\2RS\5"+
		"\n\6\2ST\7\21\2\2TV\3\2\2\2U(\3\2\2\2U)\3\2\2\2U\62\3\2\2\2U?\3\2\2\2"+
		"UG\3\2\2\2UM\3\2\2\2UR\3\2\2\2V\7\3\2\2\2WX\5\n\6\2X\t\3\2\2\2YZ\b\6\1"+
		"\2Z[\7\24\2\2[\\\5\n\6\2\\]\7\25\2\2]k\3\2\2\2^k\5\34\17\2_k\5\36\20\2"+
		"`k\5\16\b\2ab\7\6\2\2bc\7\24\2\2cd\5\b\5\2de\7\25\2\2ef\7\7\2\2fg\5\n"+
		"\6\2gh\7\b\2\2hi\5\n\6\bik\3\2\2\2jY\3\2\2\2j^\3\2\2\2j_\3\2\2\2j`\3\2"+
		"\2\2ja\3\2\2\2k}\3\2\2\2lm\f\7\2\2mn\t\2\2\2n|\5\n\6\bop\f\6\2\2pq\t\3"+
		"\2\2q|\5\n\6\7rs\f\5\2\2st\t\4\2\2t|\5\n\6\6uv\f\4\2\2vw\t\5\2\2w|\5\n"+
		"\6\5xy\f\3\2\2yz\t\6\2\2z|\5\n\6\4{l\3\2\2\2{o\3\2\2\2{r\3\2\2\2{u\3\2"+
		"\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\7\13\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\24\2\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0087\7\25\2\2\u0085\u0086\7\22\2\2\u0086\u0088"+
		"\5\32\16\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\7\26\2\2\u008a\u008f\5\4\3\2\u008b\u008c\7\n\2\2\u008c\u008d"+
		"\5\n\6\2\u008d\u008e\7\21\2\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\27\2\2\u0092\r"+
		"\3\2\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\24\2\2\u0095\u0096\5\22\n"+
		"\2\u0096\u0097\7\25\2\2\u0097\17\3\2\2\2\u0098\u009d\5\26\f\2\u0099\u009a"+
		"\7\23\2\2\u009a\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\21\3\2\2\2\u00a3\u00a8\5\n\6\2\u00a4\u00a5\7\23\2\2\u00a5\u00a7\5\n\6"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a3\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\'\2"+
		"\2\u00af\25\3\2\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3"+
		"\5\32\16\2\u00b3\27\3\2\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\7\22\2\2"+
		"\u00b6\u00b7\5\32\16\2\u00b7\31\3\2\2\2\u00b8\u00b9\t\7\2\2\u00b9\33\3"+
		"\2\2\2\u00ba\u00bb\7\'\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\t\b\2\2\u00bd"+
		"\37\3\2\2\2\r%Uj{}\u0087\u008f\u009d\u00a1\u00a8\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
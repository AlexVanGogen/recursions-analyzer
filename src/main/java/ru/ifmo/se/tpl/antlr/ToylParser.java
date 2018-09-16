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
		RETURN=8, FUN=9, VARDECL=10, NUMTYPE=11, BOOLTYPE=12, UNITTYPE=13, TRUE=14, 
		FALSE=15, SEP=16, COLON=17, COMMA=18, LPAREN=19, RPAREN=20, LBRACE=21, 
		RBRACE=22, PLUS=23, MINUS=24, MUL=25, DIV=26, MOD=27, EQ=28, NEQ=29, LT=30, 
		LEQ=31, GT=32, GEQ=33, AND=34, OR=35, ASSIGN=36, NUM=37, VAR=38;
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
		"'fun'", "'var'", "'num'", "'bool'", "'unit'", "'true'", "'false'", "';'", 
		"':'", "','", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ONE_LINE_COMMENT", "MULTILINE_COMMENT", "IF", "THEN", "ELSE", 
		"WHILE", "RETURN", "FUN", "VARDECL", "NUMTYPE", "BOOLTYPE", "UNITTYPE", 
		"TRUE", "FALSE", "SEP", "COLON", "COMMA", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "LEQ", 
		"GT", "GEQ", "AND", "OR", "ASSIGN", "NUM", "VAR"
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				procedureDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(IF);
				setState(43);
				match(LPAREN);
				setState(44);
				condition();
				setState(45);
				match(RPAREN);
				setState(46);
				match(THEN);
				setState(47);
				match(LBRACE);
				setState(48);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(49);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(IF);
				setState(52);
				match(LPAREN);
				setState(53);
				condition();
				setState(54);
				match(RPAREN);
				setState(55);
				match(THEN);
				setState(56);
				match(LBRACE);
				setState(57);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(58);
				match(RBRACE);
				setState(59);
				match(ELSE);
				setState(60);
				match(LBRACE);
				setState(61);
				((StatementContext)_localctx).falseBranch = statementList();
				setState(62);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(WHILE);
				setState(65);
				match(LPAREN);
				setState(66);
				condition();
				setState(67);
				match(RPAREN);
				setState(68);
				match(LBRACE);
				setState(69);
				((StatementContext)_localctx).loopBranch = statementList();
				setState(70);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(VARDECL);
				setState(73);
				variableDecl();
				setState(74);
				match(ASSIGN);
				setState(75);
				expression(0);
				setState(76);
				match(SEP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				variable();
				setState(79);
				match(ASSIGN);
				setState(80);
				expression(0);
				setState(81);
				match(SEP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				expression(0);
				setState(84);
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
			setState(88);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				match(LPAREN);
				setState(92);
				((ExpressionContext)_localctx).nestedExpression = expression(0);
				setState(93);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(95);
				variable();
				}
				break;
			case 3:
				{
				setState(96);
				literal();
				}
				break;
			case 4:
				{
				setState(97);
				procedureCall();
				}
				break;
			case 5:
				{
				setState(98);
				match(IF);
				setState(99);
				match(LPAREN);
				setState(100);
				condition();
				setState(101);
				match(RPAREN);
				setState(102);
				match(THEN);
				setState(103);
				((ExpressionContext)_localctx).trueBranch = expression(0);
				setState(104);
				match(ELSE);
				setState(105);
				((ExpressionContext)_localctx).falseBranch = expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(110);
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
						setState(111);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
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
						setState(114);
						((ExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
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
						setState(117);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
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
						setState(120);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(122);
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
						setState(123);
						((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(129);
			match(FUN);
			setState(130);
			functionName();
			setState(131);
			match(LPAREN);
			setState(132);
			declArgumentsList();
			setState(133);
			match(RPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(134);
				match(COLON);
				setState(135);
				variableType();
				}
			}

			setState(138);
			match(LBRACE);
			setState(139);
			statementList();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(140);
				match(RETURN);
				setState(141);
				expression(0);
				setState(142);
				match(SEP);
				}
			}

			setState(146);
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
			setState(148);
			functionName();
			setState(149);
			match(LPAREN);
			setState(150);
			callArgumentsList();
			setState(151);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				parameterDecl();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(154);
					match(COMMA);
					setState(155);
					parameterDecl();
					}
					}
					setState(160);
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
			setState(173);
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
				setState(164);
				expression(0);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					setState(166);
					expression(0);
					}
					}
					setState(171);
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
			setState(175);
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
			setState(177);
			variable();
			setState(178);
			match(COLON);
			setState(179);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			variable();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(182);
				match(COLON);
				setState(183);
				variableType();
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

	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode NUMTYPE() { return getToken(ToylParser.NUMTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(ToylParser.BOOLTYPE, 0); }
		public TerminalNode UNITTYPE() { return getToken(ToylParser.UNITTYPE, 0); }
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
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << UNITTYPE))) != 0)) ) {
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
			setState(188);
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
			setState(190);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\5\t"+
		"\u00a5\n\t\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n\5\n\u00b0"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\2\3\n\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2"+
		"\t\3\2\33\35\3\2\31\32\3\2 #\3\2\36\37\3\2$%\3\2\r\17\4\2\20\21\'\'\2"+
		"\u00cb\2 \3\2\2\2\4)\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\nm\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u0096\3\2\2\2\20\u00a4\3\2\2\2\22\u00af\3\2\2\2\24\u00b1\3"+
		"\2\2\2\26\u00b3\3\2\2\2\30\u00b7\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2"+
		"\2\2\36\u00c0\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&*\3\2\2\2\'%\3\2\2\2(*\3\2\2\2)%\3\2\2\2)("+
		"\3\2\2\2*\5\3\2\2\2+Y\5\f\7\2,-\7\6\2\2-.\7\25\2\2./\5\b\5\2/\60\7\26"+
		"\2\2\60\61\7\7\2\2\61\62\7\27\2\2\62\63\5\4\3\2\63\64\7\30\2\2\64Y\3\2"+
		"\2\2\65\66\7\6\2\2\66\67\7\25\2\2\678\5\b\5\289\7\26\2\29:\7\7\2\2:;\7"+
		"\27\2\2;<\5\4\3\2<=\7\30\2\2=>\7\b\2\2>?\7\27\2\2?@\5\4\3\2@A\7\30\2\2"+
		"AY\3\2\2\2BC\7\t\2\2CD\7\25\2\2DE\5\b\5\2EF\7\26\2\2FG\7\27\2\2GH\5\4"+
		"\3\2HI\7\30\2\2IY\3\2\2\2JK\7\f\2\2KL\5\30\r\2LM\7&\2\2MN\5\n\6\2NO\7"+
		"\22\2\2OY\3\2\2\2PQ\5\34\17\2QR\7&\2\2RS\5\n\6\2ST\7\22\2\2TY\3\2\2\2"+
		"UV\5\n\6\2VW\7\22\2\2WY\3\2\2\2X+\3\2\2\2X,\3\2\2\2X\65\3\2\2\2XB\3\2"+
		"\2\2XJ\3\2\2\2XP\3\2\2\2XU\3\2\2\2Y\7\3\2\2\2Z[\5\n\6\2[\t\3\2\2\2\\]"+
		"\b\6\1\2]^\7\25\2\2^_\5\n\6\2_`\7\26\2\2`n\3\2\2\2an\5\34\17\2bn\5\36"+
		"\20\2cn\5\16\b\2de\7\6\2\2ef\7\25\2\2fg\5\b\5\2gh\7\26\2\2hi\7\7\2\2i"+
		"j\5\n\6\2jk\7\b\2\2kl\5\n\6\bln\3\2\2\2m\\\3\2\2\2ma\3\2\2\2mb\3\2\2\2"+
		"mc\3\2\2\2md\3\2\2\2n\u0080\3\2\2\2op\f\7\2\2pq\t\2\2\2q\177\5\n\6\br"+
		"s\f\6\2\2st\t\3\2\2t\177\5\n\6\7uv\f\5\2\2vw\t\4\2\2w\177\5\n\6\6xy\f"+
		"\4\2\2yz\t\5\2\2z\177\5\n\6\5{|\f\3\2\2|}\t\6\2\2}\177\5\n\6\4~o\3\2\2"+
		"\2~r\3\2\2\2~u\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7\13\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\5\20\t\2\u0087\u008a\7\26\2\2\u0088\u0089\7\23\2\2\u0089\u008b\5\32\16"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\7\27\2\2\u008d\u0092\5\4\3\2\u008e\u008f\7\n\2\2\u008f\u0090\5\n\6\2"+
		"\u0090\u0091\7\22\2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\30\2\2\u0095\r\3\2\2\2\u0096"+
		"\u0097\5\24\13\2\u0097\u0098\7\25\2\2\u0098\u0099\5\22\n\2\u0099\u009a"+
		"\7\26\2\2\u009a\17\3\2\2\2\u009b\u00a0\5\26\f\2\u009c\u009d\7\24\2\2\u009d"+
		"\u009f\5\26\f\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2"+
		"\2\u00a6\u00ab\5\n\6\2\u00a7\u00a8\7\24\2\2\u00a8\u00aa\5\n\6\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a6\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7(\2\2"+
		"\u00b2\25\3\2\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6"+
		"\5\32\16\2\u00b6\27\3\2\2\2\u00b7\u00ba\5\34\17\2\u00b8\u00b9\7\23\2\2"+
		"\u00b9\u00bb\5\32\16\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31"+
		"\3\2\2\2\u00bc\u00bd\t\7\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7(\2\2\u00bf"+
		"\35\3\2\2\2\u00c0\u00c1\t\b\2\2\u00c1\37\3\2\2\2\17%)Xm~\u0080\u008a\u0092"+
		"\u00a0\u00a4\u00ab\u00af\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
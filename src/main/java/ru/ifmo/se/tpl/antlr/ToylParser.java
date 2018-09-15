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
		RULE_variableType = 11, RULE_variable = 12, RULE_literal = 13;
	public static final String[] ruleNames = {
		"file", "statementList", "statement", "condition", "expression", "procedureDecl", 
		"procedureCall", "declArgumentsList", "callArgumentsList", "functionName", 
		"parameterDecl", "variableType", "variable", "literal"
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
			setState(28);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FUN) | (1L << VARDECL) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << NUM) | (1L << VAR))) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
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
		public VariableContext newVariable;
		public VariableContext oldVariable;
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				procedureDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IF);
				setState(38);
				match(LPAREN);
				setState(39);
				condition();
				setState(40);
				match(RPAREN);
				setState(41);
				match(THEN);
				setState(42);
				match(LBRACE);
				setState(43);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(44);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(IF);
				setState(47);
				match(LPAREN);
				setState(48);
				condition();
				setState(49);
				match(RPAREN);
				setState(50);
				match(THEN);
				setState(51);
				match(LBRACE);
				setState(52);
				((StatementContext)_localctx).trueBranch = statementList();
				setState(53);
				match(RBRACE);
				setState(54);
				match(ELSE);
				setState(55);
				match(LBRACE);
				setState(56);
				((StatementContext)_localctx).falseBranch = statementList();
				setState(57);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(WHILE);
				setState(60);
				match(LPAREN);
				setState(61);
				condition();
				setState(62);
				match(RPAREN);
				setState(63);
				match(LBRACE);
				setState(64);
				((StatementContext)_localctx).loopBranch = statementList();
				setState(65);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(VARDECL);
				setState(68);
				((StatementContext)_localctx).newVariable = variable();
				setState(69);
				match(ASSIGN);
				setState(70);
				expression(0);
				setState(71);
				match(SEP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				((StatementContext)_localctx).oldVariable = variable();
				setState(74);
				match(ASSIGN);
				setState(75);
				expression(0);
				setState(76);
				match(SEP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				expression(0);
				setState(79);
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
			setState(83);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(86);
				match(LPAREN);
				setState(87);
				((ExpressionContext)_localctx).nestedExpression = expression(0);
				setState(88);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(90);
				variable();
				}
				break;
			case 3:
				{
				setState(91);
				literal();
				}
				break;
			case 4:
				{
				setState(92);
				procedureCall();
				}
				break;
			case 5:
				{
				setState(93);
				match(IF);
				setState(94);
				match(LPAREN);
				setState(95);
				condition();
				setState(96);
				match(RPAREN);
				setState(97);
				match(THEN);
				setState(98);
				((ExpressionContext)_localctx).trueBranch = expression(0);
				setState(99);
				match(ELSE);
				setState(100);
				((ExpressionContext)_localctx).falseBranch = expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
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
						setState(106);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
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
						setState(109);
						((ExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
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
						setState(112);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
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
						setState(115);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
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
						setState(118);
						((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(123);
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
			setState(124);
			match(FUN);
			setState(125);
			functionName();
			setState(126);
			match(LPAREN);
			setState(127);
			declArgumentsList();
			setState(128);
			match(RPAREN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(129);
				match(COLON);
				setState(130);
				variableType();
				}
			}

			setState(133);
			match(LBRACE);
			setState(134);
			statementList();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(135);
				match(RETURN);
				setState(136);
				expression(0);
				setState(137);
				match(SEP);
				}
			}

			setState(141);
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
			setState(143);
			functionName();
			setState(144);
			match(LPAREN);
			setState(145);
			callArgumentsList();
			setState(146);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				parameterDecl();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					parameterDecl();
					}
					}
					setState(155);
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
			setState(168);
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
				setState(159);
				expression(0);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					expression(0);
					}
					}
					setState(166);
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
			setState(170);
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
			setState(172);
			variable();
			setState(173);
			match(COLON);
			setState(174);
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
		enterRule(_localctx, 22, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6i\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6z\n"+
		"\6\f\6\16\6}\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u008e\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7"+
		"\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\n\7\n\u00a5"+
		"\n\n\f\n\16\n\u00a8\13\n\3\n\5\n\u00ab\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\2\3\n\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\t\3\2\32\34\3\2\30\31\3\2\37\"\3\2\35\36\3\2#$\3\2\r\16\4\2\17"+
		"\20&&\2\u00c0\2\36\3\2\2\2\4#\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nh\3\2\2\2"+
		"\f~\3\2\2\2\16\u0091\3\2\2\2\20\u009f\3\2\2\2\22\u00aa\3\2\2\2\24\u00ac"+
		"\3\2\2\2\26\u00ae\3\2\2\2\30\u00b2\3\2\2\2\32\u00b4\3\2\2\2\34\u00b6\3"+
		"\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&T\5\f\7\2\'(\7\6\2\2()\7\24\2\2"+
		")*\5\b\5\2*+\7\25\2\2+,\7\7\2\2,-\7\26\2\2-.\5\4\3\2./\7\27\2\2/T\3\2"+
		"\2\2\60\61\7\6\2\2\61\62\7\24\2\2\62\63\5\b\5\2\63\64\7\25\2\2\64\65\7"+
		"\7\2\2\65\66\7\26\2\2\66\67\5\4\3\2\678\7\27\2\289\7\b\2\29:\7\26\2\2"+
		":;\5\4\3\2;<\7\27\2\2<T\3\2\2\2=>\7\t\2\2>?\7\24\2\2?@\5\b\5\2@A\7\25"+
		"\2\2AB\7\26\2\2BC\5\4\3\2CD\7\27\2\2DT\3\2\2\2EF\7\f\2\2FG\5\32\16\2G"+
		"H\7%\2\2HI\5\n\6\2IJ\7\21\2\2JT\3\2\2\2KL\5\32\16\2LM\7%\2\2MN\5\n\6\2"+
		"NO\7\21\2\2OT\3\2\2\2PQ\5\n\6\2QR\7\21\2\2RT\3\2\2\2S&\3\2\2\2S\'\3\2"+
		"\2\2S\60\3\2\2\2S=\3\2\2\2SE\3\2\2\2SK\3\2\2\2SP\3\2\2\2T\7\3\2\2\2UV"+
		"\5\n\6\2V\t\3\2\2\2WX\b\6\1\2XY\7\24\2\2YZ\5\n\6\2Z[\7\25\2\2[i\3\2\2"+
		"\2\\i\5\32\16\2]i\5\34\17\2^i\5\16\b\2_`\7\6\2\2`a\7\24\2\2ab\5\b\5\2"+
		"bc\7\25\2\2cd\7\7\2\2de\5\n\6\2ef\7\b\2\2fg\5\n\6\bgi\3\2\2\2hW\3\2\2"+
		"\2h\\\3\2\2\2h]\3\2\2\2h^\3\2\2\2h_\3\2\2\2i{\3\2\2\2jk\f\7\2\2kl\t\2"+
		"\2\2lz\5\n\6\bmn\f\6\2\2no\t\3\2\2oz\5\n\6\7pq\f\5\2\2qr\t\4\2\2rz\5\n"+
		"\6\6st\f\4\2\2tu\t\5\2\2uz\5\n\6\5vw\f\3\2\2wx\t\6\2\2xz\5\n\6\4yj\3\2"+
		"\2\2ym\3\2\2\2yp\3\2\2\2ys\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\13\3\2\2\2}{\3\2\2\2~\177\7\13\2\2\177\u0080\5\24\13\2\u0080\u0081"+
		"\7\24\2\2\u0081\u0082\5\20\t\2\u0082\u0085\7\25\2\2\u0083\u0084\7\22\2"+
		"\2\u0084\u0086\5\30\r\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\26\2\2\u0088\u008d\5\4\3\2\u0089\u008a\7"+
		"\n\2\2\u008a\u008b\5\n\6\2\u008b\u008c\7\21\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\27"+
		"\2\2\u0090\r\3\2\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\24\2\2\u0093"+
		"\u0094\5\22\n\2\u0094\u0095\7\25\2\2\u0095\17\3\2\2\2\u0096\u009b\5\26"+
		"\f\2\u0097\u0098\7\23\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0096\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a6\5\n\6\2\u00a2\u00a3\7\23\2"+
		"\2\u00a3\u00a5\5\n\6\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\23\3\2\2"+
		"\2\u00ac\u00ad\7\'\2\2\u00ad\25\3\2\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0"+
		"\7\22\2\2\u00b0\u00b1\5\30\r\2\u00b1\27\3\2\2\2\u00b2\u00b3\t\7\2\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\t\b\2\2\u00b7"+
		"\35\3\2\2\2\r#Shy{\u0085\u008d\u009b\u009f\u00a6\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
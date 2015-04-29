// Generated from D:\MyProjects\Eclipse\LunaWorkspace\ExpressionProject\Expr.g4 by ANTLR 4.1
package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, ID=7, INT=8, NEWLINE=9, 
		WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'-'", "'*'", "'('", "'='", "ID", "INT", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_atom = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "multExpr", "atom"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(13); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); ((StatContext)_localctx).expr = expr();
				setState(16); match(NEWLINE);
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); ((StatContext)_localctx).ID = match(ID);
				setState(20); match(6);
				setState(21); ((StatContext)_localctx).expr = expr();
				setState(22); match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), new Integer(((StatContext)_localctx).expr.value));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); match(NEWLINE);
				 System.out.println("newline"); 
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MultExprContext e;
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); ((ExprContext)_localctx).e = multExpr();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(39);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(31); match(2);
						setState(32); ((ExprContext)_localctx).e = multExpr();
						_localctx.value += ((ExprContext)_localctx).e.value;
						}
						break;

					case 2:
						{
						setState(35); match(3);
						setState(36); ((ExprContext)_localctx).e = multExpr();
						_localctx.value -= ((ExprContext)_localctx).e.value;
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class MultExprContext extends ParserRuleContext {
		public int value;
		public AtomContext e;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); ((MultExprContext)_localctx).e = atom();
			((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).e.value;
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(46); match(4);
					setState(47); ((MultExprContext)_localctx).e = atom();
					_localctx.value *= ((MultExprContext)_localctx).e.value;
					}
					} 
				}
				setState(54);
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
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public Token ID;
		public ExprContext e;
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); ((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); ((AtomContext)_localctx).ID = match(ID);

				        Integer v = (Integer)memory.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        if ( v!=null ) ((AtomContext)_localctx).value =  v.intValue();
				        else System.err.println("undefined variable "+(((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(5);
				setState(60); ((AtomContext)_localctx).e = expr();
				setState(61); match(1);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).e.value;
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\fE\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6\2"+
		"\7\2\4\6\b\n\2\2G\2\r\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b.\3\2\2\2\nB"+
		"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\13\2\2\23\24\b\3\1\2\24\36\3\2"+
		"\2\2\25\26\7\t\2\2\26\27\7\b\2\2\27\30\5\6\4\2\30\31\7\13\2\2\31\32\b"+
		"\3\1\2\32\36\3\2\2\2\33\34\7\13\2\2\34\36\b\3\1\2\35\21\3\2\2\2\35\25"+
		"\3\2\2\2\35\33\3\2\2\2\36\5\3\2\2\2\37 \5\b\5\2 +\b\4\1\2!\"\7\4\2\2\""+
		"#\5\b\5\2#$\b\4\1\2$*\3\2\2\2%&\7\5\2\2&\'\5\b\5\2\'(\b\4\1\2(*\3\2\2"+
		"\2)!\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2"+
		"\2\2./\5\n\6\2/\66\b\5\1\2\60\61\7\6\2\2\61\62\5\n\6\2\62\63\b\5\1\2\63"+
		"\65\3\2\2\2\64\60\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t"+
		"\3\2\2\28\66\3\2\2\29:\7\n\2\2:C\b\6\1\2;<\7\t\2\2<C\b\6\1\2=>\7\7\2\2"+
		">?\5\6\4\2?@\7\3\2\2@A\b\6\1\2AC\3\2\2\2B9\3\2\2\2B;\3\2\2\2B=\3\2\2\2"+
		"C\13\3\2\2\2\b\17\35)+\66B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/djjudjju/Documents/workspace/Qualite/ExpressionProject/src/parser/Expr.g4 by ANTLR 4.1

package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, ID=9, 
		INT=10, NEWLINE=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'^'", "')'", "'+'", "'*'", "'-'", "'('", "'/'", "'='", "ID", "INT", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"INT", "NEWLINE", "WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16A\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\6\n-\n\n\r\n\16\n.\3\13\6\13\62\n\13\r\13\16\13\63"+
		"\3\f\5\f\67\n\f\3\f\3\f\3\r\6\r<\n\r\r\r\16\r=\3\r\3\r\2\16\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\2\3\2\4\4\2C\\c|\4\2\13\13\"\"D\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2"+
		"\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17\'\3\2\2\2\21)\3\2\2"+
		"\2\23,\3\2\2\2\25\61\3\2\2\2\27\66\3\2\2\2\31;\3\2\2\2\33\34\7`\2\2\34"+
		"\4\3\2\2\2\35\36\7+\2\2\36\6\3\2\2\2\37 \7-\2\2 \b\3\2\2\2!\"\7,\2\2\""+
		"\n\3\2\2\2#$\7/\2\2$\f\3\2\2\2%&\7*\2\2&\16\3\2\2\2\'(\7\61\2\2(\20\3"+
		"\2\2\2)*\7?\2\2*\22\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./"+
		"\3\2\2\2/\24\3\2\2\2\60\62\4\62;\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\26\3\2\2\2\65\67\7\17\2\2\66\65\3\2\2\2\66\67"+
		"\3\2\2\2\678\3\2\2\289\7\f\2\29\30\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\r\2\2@\32\3\2\2\2\7\2.\63\66=";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
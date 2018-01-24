// Generated from Program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MATCH=1, RETURN=2, CREATE=3, VIRGUL=4, STRING=5, LPAREN=6, RPAREN=7, COL=8, 
		DASH=9, LBRAC=10, RBRAC=11, LCBRAC=12, RCBRAC=13, LARROW=14, RARROW=15, 
		DOT=16, VARIABLE=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"MATCH", "RETURN", "CREATE", "VIRGUL", "STRING", "LPAREN", "RPAREN", "COL", 
		"DASH", "LBRAC", "RBRAC", "LCBRAC", "RCBRAC", "LARROW", "RARROW", "DOT", 
		"VARIABLE", "WS"
	};


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6B\n\6\f\6\16\6E\13\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\6\22b\n\22\r\22\16"+
		"\22c\3\23\6\23g\n\23\r\23\16\23h\3\23\3\23\3C\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3"+
		"\2\4\5\2C\\aac|\4\2\13\f\"\"o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5-\3\2\2\2\7"+
		"\64\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2"+
		"\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2"+
		"\2\37[\3\2\2\2!^\3\2\2\2#a\3\2\2\2%f\3\2\2\2\'(\7O\2\2()\7C\2\2)*\7V\2"+
		"\2*+\7E\2\2+,\7J\2\2,\4\3\2\2\2-.\7T\2\2./\7G\2\2/\60\7V\2\2\60\61\7W"+
		"\2\2\61\62\7T\2\2\62\63\7P\2\2\63\6\3\2\2\2\64\65\7E\2\2\65\66\7T\2\2"+
		"\66\67\7G\2\2\678\7C\2\289\7V\2\29:\7G\2\2:\b\3\2\2\2;<\7.\2\2<\n\3\2"+
		"\2\2=C\7$\2\2>?\7^\2\2?B\7$\2\2@B\13\2\2\2A>\3\2\2\2A@\3\2\2\2BE\3\2\2"+
		"\2CD\3\2\2\2CA\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7$\2\2G\f\3\2\2\2HI\7*\2"+
		"\2I\16\3\2\2\2JK\7+\2\2K\20\3\2\2\2LM\7<\2\2M\22\3\2\2\2NO\7/\2\2O\24"+
		"\3\2\2\2PQ\7]\2\2Q\26\3\2\2\2RS\7_\2\2S\30\3\2\2\2TU\7}\2\2U\32\3\2\2"+
		"\2VW\7\177\2\2W\34\3\2\2\2XY\7>\2\2YZ\7/\2\2Z\36\3\2\2\2[\\\7/\2\2\\]"+
		"\7@\2\2] \3\2\2\2^_\7\60\2\2_\"\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2d$\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\b\23\2\2k&\3\2\2\2\7\2ACch\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
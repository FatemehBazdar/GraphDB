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
		MATCH=1, RETURN=2, CREATE=3, VIRGUL=4, LPAREN=5, RPAREN=6, COL=7, DASH=8, 
		LBRAC=9, RBRAC=10, LARROW=11, RARROW=12, DOT=13, VARIABLE=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"MATCH", "RETURN", "CREATE", "VIRGUL", "LPAREN", "RPAREN", "COL", "DASH", 
		"LBRAC", "RBRAC", "LARROW", "RARROW", "DOT", "VARIABLE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\6\17M\n\17\r\17\16\17N\3\20\6\20R\n\20\r\20\16\20S\3"+
		"\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\4\5\2C\\aac|\4\2\13\f\"\"X\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5\'\3\2\2\2\7.\3\2\2\2\t\65"+
		"\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2"+
		"\25A\3\2\2\2\27C\3\2\2\2\31F\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37Q\3\2\2"+
		"\2!\"\7O\2\2\"#\7C\2\2#$\7V\2\2$%\7E\2\2%&\7J\2\2&\4\3\2\2\2\'(\7T\2\2"+
		"()\7G\2\2)*\7V\2\2*+\7W\2\2+,\7T\2\2,-\7P\2\2-\6\3\2\2\2./\7E\2\2/\60"+
		"\7T\2\2\60\61\7G\2\2\61\62\7C\2\2\62\63\7V\2\2\63\64\7G\2\2\64\b\3\2\2"+
		"\2\65\66\7.\2\2\66\n\3\2\2\2\678\7*\2\28\f\3\2\2\29:\7+\2\2:\16\3\2\2"+
		"\2;<\7<\2\2<\20\3\2\2\2=>\7/\2\2>\22\3\2\2\2?@\7]\2\2@\24\3\2\2\2AB\7"+
		"_\2\2B\26\3\2\2\2CD\7>\2\2DE\7/\2\2E\30\3\2\2\2FG\7/\2\2GH\7@\2\2H\32"+
		"\3\2\2\2IJ\7\60\2\2J\34\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2O\36\3\2\2\2PR\t\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UV\b\20\2\2V \3\2\2\2\5\2NS\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
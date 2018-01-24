
// Generated from Program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class ProgramLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int MATCH = 1, RETURN = 2, CREATE = 3, VIRGUL = 4, STRING = 5, LPAREN = 6, RPAREN = 7, COL = 8,
			DASH = 9, LBRAC = 10, RBRAC = 11, LCBRAC = 12, RCBRAC = 13, LARROW = 14, RARROW = 15, DOT = 16, SEMIC = 17,
			VARIABLE = 18, WS = 19;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'",
			"'\\u0005'", "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'", "'\\u000E'",
			"'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", "'\\u0013'" };
	public static final String[] ruleNames = { "MATCH", "RETURN", "CREATE", "VIRGUL", "STRING", "LPAREN", "RPAREN",
			"COL", "DASH", "LBRAC", "RBRAC", "LCBRAC", "RCBRAC", "LARROW", "RARROW", "DOT", "SEMIC", "VARIABLE", "WS" };

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25p\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"
			+ "\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6D\n\6\f\6\16"
			+ "\6G\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"
			+ "\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"
			+ "\6\23f\n\23\r\23\16\23g\3\24\6\24k\n\24\r\24\16\24l\3\24\3\24\3E\2\25"
			+ "\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"
			+ "\37\21!\22#\23%\24\'\25\3\2\4\5\2C\\aac|\4\2\13\f\"\"s\2\3\3\2\2\2\2\5"
			+ "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"
			+ "\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"
			+ "\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"
			+ "\'\3\2\2\2\3)\3\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\r"
			+ "J\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2"
			+ "\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#b\3\2\2\2%"
			+ "e\3\2\2\2\'j\3\2\2\2)*\7O\2\2*+\7C\2\2+,\7V\2\2,-\7E\2\2-.\7J\2\2.\4\3"
			+ "\2\2\2/\60\7T\2\2\60\61\7G\2\2\61\62\7V\2\2\62\63\7W\2\2\63\64\7T\2\2"
			+ "\64\65\7P\2\2\65\6\3\2\2\2\66\67\7E\2\2\678\7T\2\289\7G\2\29:\7C\2\2:"
			+ ";\7V\2\2;<\7G\2\2<\b\3\2\2\2=>\7.\2\2>\n\3\2\2\2?E\7$\2\2@A\7^\2\2AD\7"
			+ "$\2\2BD\13\2\2\2C@\3\2\2\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FH\3"
			+ "\2\2\2GE\3\2\2\2HI\7$\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20"
			+ "\3\2\2\2NO\7<\2\2O\22\3\2\2\2PQ\7/\2\2Q\24\3\2\2\2RS\7]\2\2S\26\3\2\2"
			+ "\2TU\7_\2\2U\30\3\2\2\2VW\7}\2\2W\32\3\2\2\2XY\7\177\2\2Y\34\3\2\2\2Z"
			+ "[\7>\2\2[\\\7/\2\2\\\36\3\2\2\2]^\7/\2\2^_\7@\2\2_ \3\2\2\2`a\7\60\2\2"
			+ "a\"\3\2\2\2bc\7=\2\2c$\3\2\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2"
			+ "gh\3\2\2\2h&\3\2\2\2ik\t\3\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2"
			+ "mn\3\2\2\2no\b\24\2\2o(\3\2\2\2\7\2CEgl\3\b\2\2";

	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public String getGrammarFileName() {
		return "Program.g4";
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}
	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}
	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}
}
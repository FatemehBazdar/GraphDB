// Generated from Program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, VIRGUL=2, LPAREN=3, RPAREN=4, COL=5, DASH=6, LBRAC=7, RBRAC=8, 
		LARROW=9, RARROW=10, VARIABLE=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'CREATE'", "','", "'('", "')'", "':'", "'-'", "'['", "']'", 
		"'<-'", "'->'", "VARIABLE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_create = 1, RULE_node_relation = 2, RULE_node = 3, 
		RULE_node_variable = 4, RULE_node_type = 5, RULE_type = 6, RULE_relation = 7, 
		RULE_relation_right = 8, RULE_relation_left = 9, RULE_variable = 10;
	public static final String[] ruleNames = {
		"program", "create", "node_relation", "node", "node_variable", "node_type", 
		"type", "relation", "relation_right", "relation_left", "variable"
	};

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); create();
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

	public static class CreateContext extends ParserRuleContext {
		public List<TerminalNode> VIRGUL() { return getTokens(ProgramParser.VIRGUL); }
		public List<Node_relationContext> node_relation() {
			return getRuleContexts(Node_relationContext.class);
		}
		public TerminalNode CREATE() { return getToken(ProgramParser.CREATE, 0); }
		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
		public Node_relationContext node_relation(int i) {
			return getRuleContext(Node_relationContext.class,i);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCreate(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(CREATE);
			setState(25); node_relation();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGUL) {
				{
				{
				setState(26); match(VIRGUL);
				setState(27); node_relation();
				}
				}
				setState(32);
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

	public static class Node_relationContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public Node_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNode_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNode_relation(this);
		}
	}

	public final Node_relationContext node_relation() throws RecognitionException {
		Node_relationContext _localctx = new Node_relationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_node_relation);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); relation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); node();
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProgramParser.LPAREN, 0); }
		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgramParser.RPAREN, 0); }
		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(LPAREN);
			setState(38); node_variable();
			setState(39); node_type();
			setState(40); match(RPAREN);
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

	public static class Node_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Node_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNode_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNode_variable(this);
		}
	}

	public final Node_variableContext node_variable() throws RecognitionException {
		Node_variableContext _localctx = new Node_variableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_variable);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); variable();
				}
				break;
			case RPAREN:
			case COL:
			case RBRAC:
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

	public static class Node_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Node_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNode_type(this);
		}
	}

	public final Node_typeContext node_type() throws RecognitionException {
		Node_typeContext _localctx = new Node_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_node_type);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case COL:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); type();
				}
				break;
			case RPAREN:
			case RBRAC:
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode COL() { return getToken(ProgramParser.COL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50); match(COL);
			setState(51); variable();
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

	public static class RelationContext extends ParserRuleContext {
		public Relation_leftContext relation_left() {
			return getRuleContext(Relation_leftContext.class,0);
		}
		public Relation_rightContext relation_right() {
			return getRuleContext(Relation_rightContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		try {
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); relation_right();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); relation_left();
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

	public static class Relation_rightContext extends ParserRuleContext {
		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class,0);
		}
		public TerminalNode LBRAC() { return getToken(ProgramParser.LBRAC, 0); }
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public TerminalNode RBRAC() { return getToken(ProgramParser.RBRAC, 0); }
		public TerminalNode RARROW() { return getToken(ProgramParser.RARROW, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public TerminalNode DASH() { return getToken(ProgramParser.DASH, 0); }
		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class,0);
		}
		public Relation_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterRelation_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitRelation_right(this);
		}
	}

	public final Relation_rightContext relation_right() throws RecognitionException {
		Relation_rightContext _localctx = new Relation_rightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relation_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); node();
			setState(58); match(DASH);
			setState(59); match(LBRAC);
			setState(60); node_variable();
			setState(61); node_type();
			setState(62); match(RBRAC);
			setState(63); match(RARROW);
			setState(64); node();
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

	public static class Relation_leftContext extends ParserRuleContext {
		public TerminalNode LARROW() { return getToken(ProgramParser.LARROW, 0); }
		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class,0);
		}
		public TerminalNode LBRAC() { return getToken(ProgramParser.LBRAC, 0); }
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public TerminalNode RBRAC() { return getToken(ProgramParser.RBRAC, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class,0);
		}
		public TerminalNode DASH() { return getToken(ProgramParser.DASH, 0); }
		public Relation_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterRelation_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitRelation_left(this);
		}
	}

	public final Relation_leftContext relation_left() throws RecognitionException {
		Relation_leftContext _localctx = new Relation_leftContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relation_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); node();
			setState(67); match(LARROW);
			setState(68); match(LBRAC);
			setState(69); node_variable();
			setState(70); node_type();
			setState(71); match(RBRAC);
			setState(72); match(DASH);
			setState(73); node();
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
		public TerminalNode VARIABLE() { return getToken(ProgramParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4\5\4"+
		"&\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6/\n\6\3\7\3\7\5\7\63\n\7\3\b\3\b"+
		"\3\b\3\t\3\t\5\t:\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\2I\2\30\3\2\2\2\4\32\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n.\3\2"+
		"\2\2\f\62\3\2\2\2\16\64\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24D\3\2\2\2\26"+
		"M\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\7\3\2\2\33 \5\6\4\2\34\35\7"+
		"\4\2\2\35\37\5\6\4\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!\5\3\2\2\2\" \3\2\2\2#&\5\20\t\2$&\5\b\5\2%#\3\2\2\2%$\3\2\2\2&\7\3\2"+
		"\2\2\'(\7\5\2\2()\5\n\6\2)*\5\f\7\2*+\7\6\2\2+\t\3\2\2\2,/\5\26\f\2-/"+
		"\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\13\3\2\2\2\60\63\5\16\b\2\61\63\3\2\2\2"+
		"\62\60\3\2\2\2\62\61\3\2\2\2\63\r\3\2\2\2\64\65\7\7\2\2\65\66\5\26\f\2"+
		"\66\17\3\2\2\2\67:\5\22\n\28:\5\24\13\29\67\3\2\2\298\3\2\2\2:\21\3\2"+
		"\2\2;<\5\b\5\2<=\7\b\2\2=>\7\t\2\2>?\5\n\6\2?@\5\f\7\2@A\7\n\2\2AB\7\f"+
		"\2\2BC\5\b\5\2C\23\3\2\2\2DE\5\b\5\2EF\7\13\2\2FG\7\t\2\2GH\5\n\6\2HI"+
		"\5\f\7\2IJ\7\n\2\2JK\7\b\2\2KL\5\b\5\2L\25\3\2\2\2MN\7\r\2\2N\27\3\2\2"+
		"\2\7 %.\629";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
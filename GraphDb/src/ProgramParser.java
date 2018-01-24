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
		MATCH=1, RETURN=2, CREATE=3, VIRGUL=4, STRING=5, LPAREN=6, RPAREN=7, COL=8, 
		DASH=9, LBRAC=10, RBRAC=11, LCBRAC=12, RCBRAC=13, LARROW=14, RARROW=15, 
		DOT=16, VARIABLE=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'MATCH'", "'RETURN'", "'CREATE'", "','", "STRING", "'('", 
		"')'", "':'", "'-'", "'['", "']'", "'{'", "'}'", "'<-'", "'->'", "'.'", 
		"VARIABLE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_create = 1, RULE_match = 2, RULE_leftHand = 3, 
		RULE_returnStatement = 4, RULE_node_relation = 5, RULE_node = 6, RULE_node_variable = 7, 
		RULE_node_type = 8, RULE_props = 9, RULE_node_props = 10, RULE_string = 11, 
		RULE_type = 12, RULE_relation = 13, RULE_relation_right = 14, RULE_relation_left = 15, 
		RULE_property_variable = 16, RULE_property_variable_ = 17, RULE_pvariable = 18, 
		RULE_variable = 19;
	public static final String[] ruleNames = {
		"program", "create", "match", "leftHand", "returnStatement", "node_relation", 
		"node", "node_variable", "node_type", "props", "node_props", "string", 
		"type", "relation", "relation_right", "relation_left", "property_variable", 
		"property_variable_", "pvariable", "variable"
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
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
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
			setState(42);
			switch (_input.LA(1)) {
			case MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); create();
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

	public static class CreateContext extends ParserRuleContext {
		public LeftHandContext leftHand() {
			return getRuleContext(LeftHandContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(ProgramParser.CREATE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
			setState(44); match(CREATE);
			setState(45); leftHand();
			setState(47);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(46); returnStatement();
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

	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(ProgramParser.MATCH, 0); }
		public LeftHandContext leftHand() {
			return getRuleContext(LeftHandContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMatch(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(MATCH);
			setState(50); leftHand();
			setState(51); returnStatement();
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

	public static class LeftHandContext extends ParserRuleContext {
		public List<TerminalNode> VIRGUL() { return getTokens(ProgramParser.VIRGUL); }
		public List<Node_relationContext> node_relation() {
			return getRuleContexts(Node_relationContext.class);
		}
		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
		public Node_relationContext node_relation(int i) {
			return getRuleContext(Node_relationContext.class,i);
		}
		public LeftHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterLeftHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitLeftHand(this);
		}
	}

	public final LeftHandContext leftHand() throws RecognitionException {
		LeftHandContext _localctx = new LeftHandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_leftHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); node_relation();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGUL) {
				{
				{
				setState(54); match(VIRGUL);
				setState(55); node_relation();
				}
				}
				setState(60);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public List<TerminalNode> VIRGUL() { return getTokens(ProgramParser.VIRGUL); }
		public TerminalNode RETURN() { return getToken(ProgramParser.RETURN, 0); }
		public List<Property_variableContext> property_variable() {
			return getRuleContexts(Property_variableContext.class);
		}
		public Property_variableContext property_variable(int i) {
			return getRuleContext(Property_variableContext.class,i);
		}
		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(RETURN);
			setState(62); property_variable();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGUL) {
				{
				{
				setState(63); match(VIRGUL);
				setState(64); property_variable();
				}
				}
				setState(69);
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
		enterRule(_localctx, 10, RULE_node_relation);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); relation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); node();
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
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(LPAREN);
			setState(75); node_variable();
			setState(76); node_type();
			setState(77); props();
			setState(78); match(RPAREN);
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
		enterRule(_localctx, 14, RULE_node_variable);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); variable();
				}
				break;
			case RPAREN:
			case COL:
			case RBRAC:
			case LCBRAC:
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
		enterRule(_localctx, 16, RULE_node_type);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case COL:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); type();
				}
				break;
			case RPAREN:
			case RBRAC:
			case LCBRAC:
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

	public static class PropsContext extends ParserRuleContext {
		public TerminalNode LCBRAC() { return getToken(ProgramParser.LCBRAC, 0); }
		public List<Node_propsContext> node_props() {
			return getRuleContexts(Node_propsContext.class);
		}
		public List<TerminalNode> VIRGUL() { return getTokens(ProgramParser.VIRGUL); }
		public Node_propsContext node_props(int i) {
			return getRuleContext(Node_propsContext.class,i);
		}
		public TerminalNode RCBRAC() { return getToken(ProgramParser.RCBRAC, 0); }
		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProps(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_props);
		int _la;
		try {
			setState(101);
			switch (_input.LA(1)) {
			case LCBRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(LCBRAC);
				setState(97);
				_la = _input.LA(1);
				if (_la==VARIABLE) {
					{
					setState(89); node_props();
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGUL) {
						{
						{
						setState(90); match(VIRGUL);
						setState(91); node_props();
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(99); match(RCBRAC);
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

	public static class Node_propsContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COL() { return getToken(ProgramParser.COL, 0); }
		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class,0);
		}
		public Node_propsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNode_props(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNode_props(this);
		}
	}

	public final Node_propsContext node_props() throws RecognitionException {
		Node_propsContext _localctx = new Node_propsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_node_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); pvariable();
			setState(104); match(COL);
			setState(105); string();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ProgramParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(STRING);
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
		enterRule(_localctx, 24, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109); match(COL);
			setState(110); variable();
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
		enterRule(_localctx, 26, RULE_relation);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); relation_right();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); relation_left();
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
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_relation_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); node();
			setState(117); match(DASH);
			setState(118); match(LBRAC);
			setState(119); node_variable();
			setState(120); node_type();
			setState(121); props();
			setState(122); match(RBRAC);
			setState(123); match(RARROW);
			setState(124); node();
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
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_relation_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); node();
			setState(127); match(LARROW);
			setState(128); match(LBRAC);
			setState(129); node_variable();
			setState(130); node_type();
			setState(131); props();
			setState(132); match(RBRAC);
			setState(133); match(DASH);
			setState(134); node();
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

	public static class Property_variableContext extends ParserRuleContext {
		public Property_variable_Context property_variable_() {
			return getRuleContext(Property_variable_Context.class,0);
		}
		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class,0);
		}
		public Property_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProperty_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProperty_variable(this);
		}
	}

	public final Property_variableContext property_variable() throws RecognitionException {
		Property_variableContext _localctx = new Property_variableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); pvariable();
			setState(137); property_variable_();
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

	public static class Property_variable_Context extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ProgramParser.DOT, 0); }
		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class,0);
		}
		public Property_variable_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_variable_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProperty_variable_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProperty_variable_(this);
		}
	}

	public final Property_variable_Context property_variable_() throws RecognitionException {
		Property_variable_Context _localctx = new Property_variable_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_property_variable_);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(DOT);
				setState(140); pvariable();
				}
				break;
			case EOF:
			case VIRGUL:
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

	public static class PvariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterPvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitPvariable(this);
		}
	}

	public final PvariableContext pvariable() throws RecognitionException {
		PvariableContext _localctx = new PvariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); variable();
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
		enterRule(_localctx, 38, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\7"+
		"\6D\n\6\f\6\16\6G\13\6\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\5\tU\n\t\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\7\13_\n\13\f\13\16\13"+
		"b\13\13\5\13d\n\13\3\13\3\13\5\13h\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\5\17u\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u0091\n\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u008e\2,\3\2\2\2\4.\3"+
		"\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n?\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20"+
		"T\3\2\2\2\22X\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32o\3\2\2\2"+
		"\34t\3\2\2\2\36v\3\2\2\2 \u0080\3\2\2\2\"\u008a\3\2\2\2$\u0090\3\2\2\2"+
		"&\u0092\3\2\2\2(\u0094\3\2\2\2*-\5\6\4\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2"+
		"-\3\3\2\2\2./\7\5\2\2/\61\5\b\5\2\60\62\5\n\6\2\61\60\3\2\2\2\61\62\3"+
		"\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\5\b\5\2\65\66\5\n\6\2\66\7\3\2"+
		"\2\2\67<\5\f\7\289\7\6\2\29;\5\f\7\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=\t\3\2\2\2><\3\2\2\2?@\7\4\2\2@E\5\"\22\2AB\7\6\2\2BD\5\"\22\2"+
		"CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HK\5\34"+
		"\17\2IK\5\16\b\2JH\3\2\2\2JI\3\2\2\2K\r\3\2\2\2LM\7\b\2\2MN\5\20\t\2N"+
		"O\5\22\n\2OP\5\24\13\2PQ\7\t\2\2Q\17\3\2\2\2RU\5(\25\2SU\3\2\2\2TR\3\2"+
		"\2\2TS\3\2\2\2U\21\3\2\2\2VY\5\32\16\2WY\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\23\3\2\2\2Zc\7\16\2\2[`\5\26\f\2\\]\7\6\2\2]_\5\26\f\2^\\\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2eh\7\17\2\2fh\3\2\2\2gZ\3\2\2\2gf\3\2\2\2h\25\3\2\2\2ij\5&\24\2"+
		"jk\7\n\2\2kl\5\30\r\2l\27\3\2\2\2mn\7\7\2\2n\31\3\2\2\2op\7\n\2\2pq\5"+
		"(\25\2q\33\3\2\2\2ru\5\36\20\2su\5 \21\2tr\3\2\2\2ts\3\2\2\2u\35\3\2\2"+
		"\2vw\5\16\b\2wx\7\13\2\2xy\7\f\2\2yz\5\20\t\2z{\5\22\n\2{|\5\24\13\2|"+
		"}\7\r\2\2}~\7\21\2\2~\177\5\16\b\2\177\37\3\2\2\2\u0080\u0081\5\16\b\2"+
		"\u0081\u0082\7\20\2\2\u0082\u0083\7\f\2\2\u0083\u0084\5\20\t\2\u0084\u0085"+
		"\5\22\n\2\u0085\u0086\5\24\13\2\u0086\u0087\7\r\2\2\u0087\u0088\7\13\2"+
		"\2\u0088\u0089\5\16\b\2\u0089!\3\2\2\2\u008a\u008b\5&\24\2\u008b\u008c"+
		"\5$\23\2\u008c#\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u0091\5&\24\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008f\3\2\2\2\u0091%\3\2\2\2"+
		"\u0092\u0093\5(\25\2\u0093\'\3\2\2\2\u0094\u0095\7\23\2\2\u0095)\3\2\2"+
		"\2\16,\61<EJTX`cgt\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
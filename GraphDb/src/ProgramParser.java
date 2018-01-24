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
		MATCH=1, RETURN=2, CREATE=3, VIRGUL=4, LPAREN=5, RPAREN=6, COL=7, DASH=8, 
		LBRAC=9, RBRAC=10, LARROW=11, RARROW=12, DOT=13, VARIABLE=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'MATCH'", "'RETURN'", "'CREATE'", "','", "'('", "')'", "':'", 
		"'-'", "'['", "']'", "'<-'", "'->'", "'.'", "VARIABLE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_create = 1, RULE_match = 2, RULE_leftHand = 3, 
		RULE_returnStatement = 4, RULE_node_relation = 5, RULE_node = 6, RULE_node_variable = 7, 
		RULE_node_type = 8, RULE_type = 9, RULE_relation = 10, RULE_relation_right = 11, 
		RULE_relation_left = 12, RULE_property_variable = 13, RULE_property_variable_ = 14, 
		RULE_pvariable = 15, RULE_variable = 16;
	public static final String[] ruleNames = {
		"program", "create", "match", "leftHand", "returnStatement", "node_relation", 
		"node", "node_variable", "node_type", "type", "relation", "relation_right", 
		"relation_left", "property_variable", "property_variable_", "pvariable", 
		"variable"
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
			setState(36);
			switch (_input.LA(1)) {
			case MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); match();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); create();
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
			setState(38); match(CREATE);
			setState(39); leftHand();
			setState(41);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(40); returnStatement();
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
			setState(43); match(MATCH);
			setState(44); leftHand();
			setState(45); returnStatement();
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
			setState(47); node_relation();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGUL) {
				{
				{
				setState(48); match(VIRGUL);
				setState(49); node_relation();
				}
				}
				setState(54);
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
			setState(55); match(RETURN);
			setState(56); property_variable();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGUL) {
				{
				{
				setState(57); match(VIRGUL);
				setState(58); property_variable();
				}
				}
				setState(63);
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
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); relation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); node();
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
		enterRule(_localctx, 12, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(LPAREN);
			setState(69); node_variable();
			setState(70); node_type();
			setState(71); match(RPAREN);
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
			setState(75);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); variable();
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
		enterRule(_localctx, 16, RULE_node_type);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case COL:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); type();
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
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81); match(COL);
			setState(82); variable();
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
		enterRule(_localctx, 20, RULE_relation);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); relation_right();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); relation_left();
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
		enterRule(_localctx, 22, RULE_relation_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); node();
			setState(89); match(DASH);
			setState(90); match(LBRAC);
			setState(91); node_variable();
			setState(92); node_type();
			setState(93); match(RBRAC);
			setState(94); match(RARROW);
			setState(95); node();
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
		enterRule(_localctx, 24, RULE_relation_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); node();
			setState(98); match(LARROW);
			setState(99); match(LBRAC);
			setState(100); node_variable();
			setState(101); node_type();
			setState(102); match(RBRAC);
			setState(103); match(DASH);
			setState(104); node();
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
		enterRule(_localctx, 26, RULE_property_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); pvariable();
			setState(107); property_variable_();
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
		enterRule(_localctx, 28, RULE_property_variable_);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(DOT);
				setState(110); pvariable();
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
		enterRule(_localctx, 30, RULE_pvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); variable();
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
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\5\2\'\n\2\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\65\n"+
		"\5\f\5\16\58\13\5\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\5\7"+
		"E\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tN\n\t\3\n\3\n\5\nR\n\n\3\13\3\13"+
		"\3\13\3\f\3\f\5\fY\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20s"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\2p\2&\3\2\2\2\4(\3\2\2\2\6-\3\2\2\2\b\61\3\2\2\2\n9\3\2\2"+
		"\2\fD\3\2\2\2\16F\3\2\2\2\20M\3\2\2\2\22Q\3\2\2\2\24S\3\2\2\2\26X\3\2"+
		"\2\2\30Z\3\2\2\2\32c\3\2\2\2\34l\3\2\2\2\36r\3\2\2\2 t\3\2\2\2\"v\3\2"+
		"\2\2$\'\5\6\4\2%\'\5\4\3\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2()\7\5\2\2)"+
		"+\5\b\5\2*,\5\n\6\2+*\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-.\7\3\2\2./\5\b\5\2"+
		"/\60\5\n\6\2\60\7\3\2\2\2\61\66\5\f\7\2\62\63\7\6\2\2\63\65\5\f\7\2\64"+
		"\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28\66\3"+
		"\2\2\29:\7\4\2\2:?\5\34\17\2;<\7\6\2\2<>\5\34\17\2=;\3\2\2\2>A\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2A?\3\2\2\2BE\5\26\f\2CE\5\16\b\2DB\3\2"+
		"\2\2DC\3\2\2\2E\r\3\2\2\2FG\7\7\2\2GH\5\20\t\2HI\5\22\n\2IJ\7\b\2\2J\17"+
		"\3\2\2\2KN\5\"\22\2LN\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\21\3\2\2\2OR\5\24\13"+
		"\2PR\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\23\3\2\2\2ST\7\t\2\2TU\5\"\22\2U\25"+
		"\3\2\2\2VY\5\30\r\2WY\5\32\16\2XV\3\2\2\2XW\3\2\2\2Y\27\3\2\2\2Z[\5\16"+
		"\b\2[\\\7\n\2\2\\]\7\13\2\2]^\5\20\t\2^_\5\22\n\2_`\7\f\2\2`a\7\16\2\2"+
		"ab\5\16\b\2b\31\3\2\2\2cd\5\16\b\2de\7\r\2\2ef\7\13\2\2fg\5\20\t\2gh\5"+
		"\22\n\2hi\7\f\2\2ij\7\n\2\2jk\5\16\b\2k\33\3\2\2\2lm\5 \21\2mn\5\36\20"+
		"\2n\35\3\2\2\2op\7\17\2\2ps\5 \21\2qs\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\37"+
		"\3\2\2\2tu\5\"\22\2u!\3\2\2\2vw\7\20\2\2w#\3\2\2\2\13&+\66?DMQXr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}

// Generated from Program.g4 by ANTLR 4.4
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class ProgramParser extends Parser {
	public static class CreateContext extends ParserRuleContext {
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode CREATE() {
			return getToken(ProgramParser.CREATE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterCreate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitCreate(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create;
		}

		public LeftHandContext leftHand() {
			return getRuleContext(LeftHandContext.class, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}
	}

	public static class LeftHandContext extends ParserRuleContext {
		public LeftHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterLeftHand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitLeftHand(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_leftHand;
		}

		public List<Node_relationContext> node_relation() {
			return getRuleContexts(Node_relationContext.class);
		}

		public Node_relationContext node_relation(int i) {
			return getRuleContext(Node_relationContext.class, i);
		}

		public List<TerminalNode> VIRGUL() {
			return getTokens(ProgramParser.VIRGUL);
		}

		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
	}
	public static class MatchContext extends ParserRuleContext {
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterMatch(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitMatch(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_match;
		}

		public LeftHandContext leftHand() {
			return getRuleContext(LeftHandContext.class, 0);
		}

		public TerminalNode MATCH() {
			return getToken(ProgramParser.MATCH, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}
	}
	public static class Node_propsContext extends ParserRuleContext {
		public Node_propsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode COL() {
			return getToken(ProgramParser.COL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterNode_props(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitNode_props(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_node_props;
		}

		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class, 0);
		}

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
		}
	}
	public static class Node_relationContext extends ParserRuleContext {
		public Node_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterNode_relation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitNode_relation(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_node_relation;
		}

		public NodeContext node() {
			return getRuleContext(NodeContext.class, 0);
		}

		public RelationContext relation() {
			return getRuleContext(RelationContext.class, 0);
		}
	}
	public static class Node_typeContext extends ParserRuleContext {
		public Node_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterNode_type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitNode_type(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_node_type;
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}
	}
	public static class Node_variableContext extends ParserRuleContext {
		public Node_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterNode_variable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitNode_variable(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_node_variable;
		}

		public VariableContext variable() {
			return getRuleContext(VariableContext.class, 0);
		}
	}

	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterNode(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitNode(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_node;
		}

		public TerminalNode LPAREN() {
			return getToken(ProgramParser.LPAREN, 0);
		}

		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class, 0);
		}

		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class, 0);
		}

		public PropsContext props() {
			return getRuleContext(PropsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(ProgramParser.RPAREN, 0);
		}
	}

	public static class Program_Context extends ParserRuleContext {
		public Program_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public CreateContext create() {
			return getRuleContext(CreateContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterProgram_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitProgram_(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program_;
		}

		public MatchContext match() {
			return getRuleContext(MatchContext.class, 0);
		}
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitProgram(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		public List<Program_Context> program_() {
			return getRuleContexts(Program_Context.class);
		}

		public Program_Context program_(int i) {
			return getRuleContext(Program_Context.class, i);
		}

		public List<TerminalNode> SEMIC() {
			return getTokens(ProgramParser.SEMIC);
		}

		public TerminalNode SEMIC(int i) {
			return getToken(ProgramParser.SEMIC, i);
		}
	}

	public static class Property_variable_Context extends ParserRuleContext {
		public Property_variable_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DOT() {
			return getToken(ProgramParser.DOT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterProperty_variable_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitProperty_variable_(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_property_variable_;
		}

		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class, 0);
		}
	}

	public static class Property_variableContext extends ParserRuleContext {
		public Property_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterProperty_variable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitProperty_variable(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_property_variable;
		}

		public Property_variable_Context property_variable_() {
			return getRuleContext(Property_variable_Context.class, 0);
		}

		public PvariableContext pvariable() {
			return getRuleContext(PvariableContext.class, 0);
		}
	}

	public static class PropsContext extends ParserRuleContext {
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterProps(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitProps(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_props;
		}

		public TerminalNode LCBRAC() {
			return getToken(ProgramParser.LCBRAC, 0);
		}

		public List<Node_propsContext> node_props() {
			return getRuleContexts(Node_propsContext.class);
		}

		public Node_propsContext node_props(int i) {
			return getRuleContext(Node_propsContext.class, i);
		}

		public TerminalNode RCBRAC() {
			return getToken(ProgramParser.RCBRAC, 0);
		}

		public List<TerminalNode> VIRGUL() {
			return getTokens(ProgramParser.VIRGUL);
		}

		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
	}

	public static class PvariableContext extends ParserRuleContext {
		public PvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterPvariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitPvariable(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pvariable;
		}

		public VariableContext variable() {
			return getRuleContext(VariableContext.class, 0);
		}
	}

	public static class Relation_leftContext extends ParserRuleContext {
		public Relation_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DASH() {
			return getToken(ProgramParser.DASH, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterRelation_left(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitRelation_left(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relation_left;
		}

		public TerminalNode LARROW() {
			return getToken(ProgramParser.LARROW, 0);
		}

		public TerminalNode LBRAC() {
			return getToken(ProgramParser.LBRAC, 0);
		}

		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}

		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class, i);
		}

		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class, 0);
		}

		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class, 0);
		}

		public PropsContext props() {
			return getRuleContext(PropsContext.class, 0);
		}

		public TerminalNode RBRAC() {
			return getToken(ProgramParser.RBRAC, 0);
		}
	}

	public static class Relation_rightContext extends ParserRuleContext {
		public Relation_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DASH() {
			return getToken(ProgramParser.DASH, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterRelation_right(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitRelation_right(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relation_right;
		}

		public TerminalNode LBRAC() {
			return getToken(ProgramParser.LBRAC, 0);
		}

		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}

		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class, i);
		}

		public Node_typeContext node_type() {
			return getRuleContext(Node_typeContext.class, 0);
		}

		public Node_variableContext node_variable() {
			return getRuleContext(Node_variableContext.class, 0);
		}

		public PropsContext props() {
			return getRuleContext(PropsContext.class, 0);
		}

		public TerminalNode RARROW() {
			return getToken(ProgramParser.RARROW, 0);
		}

		public TerminalNode RBRAC() {
			return getToken(ProgramParser.RBRAC, 0);
		}
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterRelation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitRelation(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relation;
		}

		public Relation_leftContext relation_left() {
			return getRuleContext(Relation_leftContext.class, 0);
		}

		public Relation_rightContext relation_right() {
			return getRuleContext(Relation_rightContext.class, 0);
		}
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterReturnStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitReturnStatement(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStatement;
		}

		public List<Property_variableContext> property_variable() {
			return getRuleContexts(Property_variableContext.class);
		}

		public Property_variableContext property_variable(int i) {
			return getRuleContext(Property_variableContext.class, i);
		}

		public TerminalNode RETURN() {
			return getToken(ProgramParser.RETURN, 0);
		}

		public List<TerminalNode> VIRGUL() {
			return getTokens(ProgramParser.VIRGUL);
		}

		public TerminalNode VIRGUL(int i) {
			return getToken(ProgramParser.VIRGUL, i);
		}
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitString(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_string;
		}

		public TerminalNode STRING() {
			return getToken(ProgramParser.STRING, 0);
		}
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode COL() {
			return getToken(ProgramParser.COL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitType(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		public VariableContext variable() {
			return getRuleContext(VariableContext.class, 0);
		}
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).enterVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ProgramListener)
				((ProgramListener) listener).exitVariable(this);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variable;
		}

		public TerminalNode VARIABLE() {
			return getToken(ProgramParser.VARIABLE, 0);
		}
	}

	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;

	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

	public static final int MATCH = 1, RETURN = 2, CREATE = 3, VIRGUL = 4, STRING = 5, LPAREN = 6, RPAREN = 7, COL = 8,
			DASH = 9, LBRAC = 10, RBRAC = 11, LCBRAC = 12, RCBRAC = 13, LARROW = 14, RARROW = 15, DOT = 16, SEMIC = 17,
			VARIABLE = 18, WS = 19;

	public static final String[] tokenNames = { "<INVALID>", "'MATCH'", "'RETURN'", "'CREATE'", "','", "STRING", "'('",
			"')'", "':'", "'-'", "'['", "']'", "'{'", "'}'", "'<-'", "'->'", "'.'", "';'", "VARIABLE", "WS" };

	public static final int RULE_program = 0, RULE_program_ = 1, RULE_create = 2, RULE_match = 3, RULE_leftHand = 4,
			RULE_returnStatement = 5, RULE_node_relation = 6, RULE_node = 7, RULE_node_variable = 8, RULE_node_type = 9,
			RULE_props = 10, RULE_node_props = 11, RULE_string = 12, RULE_type = 13, RULE_relation = 14,
			RULE_relation_right = 15, RULE_relation_left = 16, RULE_property_variable = 17,
			RULE_property_variable_ = 18, RULE_pvariable = 19, RULE_variable = 20;

	public static final String[] ruleNames = { "program", "program_", "create", "match", "leftHand", "returnStatement",
			"node_relation", "node", "node_variable", "node_type", "props", "node_props", "string", "type", "relation",
			"relation_right", "relation_left", "property_variable", "property_variable_", "pvariable", "variable" };

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00a2\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\7\2\61\n\2\f"
			+ "\2\16\2\64\13\2\3\3\3\3\5\38\n\3\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5"
			+ "\3\6\3\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7"
			+ "R\13\7\3\b\3\b\5\bV\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n`\n\n\3\13"
			+ "\3\13\5\13d\n\13\3\f\3\f\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\5\fo\n\f\3\f"
			+ "\3\f\5\fs\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\5\20"
			+ "\u0080\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"
			+ "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"
			+ "\5\24\u009c\n\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22"
			+ "\24\26\30\32\34\36 \"$&(*\2\2\u009a\2\62\3\2\2\2\4\67\3\2\2\2\69\3\2\2"
			+ "\2\b>\3\2\2\2\nB\3\2\2\2\fJ\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22_\3\2\2"
			+ "\2\24c\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2\32x\3\2\2\2\34z\3\2\2\2\36\177"
			+ "\3\2\2\2 \u0081\3\2\2\2\"\u008b\3\2\2\2$\u0095\3\2\2\2&\u009b\3\2\2\2"
			+ "(\u009d\3\2\2\2*\u009f\3\2\2\2,.\5\4\3\2-/\7\23\2\2.-\3\2\2\2./\3\2\2"
			+ "\2/\61\3\2\2\2\60,\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"
			+ "\3\3\2\2\2\64\62\3\2\2\2\658\5\b\5\2\668\5\6\4\2\67\65\3\2\2\2\67\66\3"
			+ "\2\2\28\5\3\2\2\29:\7\5\2\2:<\5\n\6\2;=\5\f\7\2<;\3\2\2\2<=\3\2\2\2=\7"
			+ "\3\2\2\2>?\7\3\2\2?@\5\n\6\2@A\5\f\7\2A\t\3\2\2\2BG\5\16\b\2CD\7\6\2\2"
			+ "DF\5\16\b\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IG\3\2"
			+ "\2\2JK\7\4\2\2KP\5$\23\2LM\7\6\2\2MO\5$\23\2NL\3\2\2\2OR\3\2\2\2PN\3\2"
			+ "\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2SV\5\36\20\2TV\5\20\t\2US\3\2\2\2U"
			+ "T\3\2\2\2V\17\3\2\2\2WX\7\b\2\2XY\5\22\n\2YZ\5\24\13\2Z[\5\26\f\2[\\\7"
			+ "\t\2\2\\\21\3\2\2\2]`\5*\26\2^`\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\23\3\2\2"
			+ "\2ad\5\34\17\2bd\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\25\3\2\2\2en\7\16\2\2fk"
			+ "\5\30\r\2gh\7\6\2\2hj\5\30\r\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"
			+ "lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2ps\7\17\2\2qs\3\2\2"
			+ "\2re\3\2\2\2rq\3\2\2\2s\27\3\2\2\2tu\5(\25\2uv\7\n\2\2vw\5\32\16\2w\31"
			+ "\3\2\2\2xy\7\7\2\2y\33\3\2\2\2z{\7\n\2\2{|\5*\26\2|\35\3\2\2\2}\u0080"
			+ "\5 \21\2~\u0080\5\"\22\2\177}\3\2\2\2\177~\3\2\2\2\u0080\37\3\2\2\2\u0081"
			+ "\u0082\5\20\t\2\u0082\u0083\7\13\2\2\u0083\u0084\7\f\2\2\u0084\u0085\5"
			+ "\22\n\2\u0085\u0086\5\24\13\2\u0086\u0087\5\26\f\2\u0087\u0088\7\r\2\2"
			+ "\u0088\u0089\7\21\2\2\u0089\u008a\5\20\t\2\u008a!\3\2\2\2\u008b\u008c"
			+ "\5\20\t\2\u008c\u008d\7\20\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\22\n"
			+ "\2\u008f\u0090\5\24\13\2\u0090\u0091\5\26\f\2\u0091\u0092\7\r\2\2\u0092"
			+ "\u0093\7\13\2\2\u0093\u0094\5\20\t\2\u0094#\3\2\2\2\u0095\u0096\5(\25"
			+ "\2\u0096\u0097\5&\24\2\u0097%\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009c"
			+ "\5(\25\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c"
			+ "\'\3\2\2\2\u009d\u009e\5*\26\2\u009e)\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0"
			+ "+\3\2\2\2\20.\62\67<GPU_cknr\177\u009b";

	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				match(CREATE);
				setState(56);
				leftHand();
				setState(58);
				_la = _input.LA(1);
				if (_la == RETURN) {
					{
						setState(57);
						returnStatement();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
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

	public final LeftHandContext leftHand() throws RecognitionException {
		LeftHandContext _localctx = new LeftHandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_leftHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(64);
				node_relation();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == VIRGUL) {
					{
						{
							setState(65);
							match(VIRGUL);
							setState(66);
							node_relation();
						}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(60);
				match(MATCH);
				setState(61);
				leftHand();
				setState(62);
				returnStatement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(LPAREN);
				setState(86);
				node_variable();
				setState(87);
				node_type();
				setState(88);
				props();
				setState(89);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Node_propsContext node_props() throws RecognitionException {
		Node_propsContext _localctx = new Node_propsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_node_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				pvariable();
				setState(115);
				match(COL);
				setState(116);
				string();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Node_relationContext node_relation() throws RecognitionException {
		Node_relationContext _localctx = new Node_relationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_node_relation);
		try {
			setState(83);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(81);
				relation();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(82);
				node();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Node_typeContext node_type() throws RecognitionException {
		Node_typeContext _localctx = new Node_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node_type);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case COL:
				enterOuterAlt(_localctx, 1); {
				setState(95);
				type();
			}
				break;
			case RPAREN:
			case RBRAC:
			case LCBRAC:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Node_variableContext node_variable() throws RecognitionException {
		Node_variableContext _localctx = new Node_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_node_variable);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1); {
				setState(91);
				variable();
			}
				break;
			case RPAREN:
			case COL:
			case RBRAC:
			case LCBRAC:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == MATCH || _la == CREATE) {
					{
						{
							setState(42);
							program_();
							setState(44);
							_la = _input.LA(1);
							if (_la == SEMIC) {
								{
									setState(43);
									match(SEMIC);
								}
							}

						}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Program_Context program_() throws RecognitionException {
		Program_Context _localctx = new Program_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case MATCH:
				enterOuterAlt(_localctx, 1); {
				setState(51);
				match();
			}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2); {
				setState(52);
				create();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Property_variableContext property_variable() throws RecognitionException {
		Property_variableContext _localctx = new Property_variableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(147);
				pvariable();
				setState(148);
				property_variable_();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Property_variable_Context property_variable_() throws RecognitionException {
		Property_variable_Context _localctx = new Property_variable_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_property_variable_);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1); {
				setState(150);
				match(DOT);
				setState(151);
				pvariable();
			}
				break;
			case EOF:
			case MATCH:
			case CREATE:
			case VIRGUL:
			case SEMIC:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_props);
		int _la;
		try {
			setState(112);
			switch (_input.LA(1)) {
			case LCBRAC:
				enterOuterAlt(_localctx, 1); {
				setState(99);
				match(LCBRAC);
				setState(108);
				_la = _input.LA(1);
				if (_la == VARIABLE) {
					{
						setState(100);
						node_props();
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == VIRGUL) {
							{
								{
									setState(101);
									match(VIRGUL);
									setState(102);
									node_props();
								}
							}
							setState(107);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(110);
				match(RCBRAC);
			}
				break;
			case RPAREN:
			case RBRAC:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PvariableContext pvariable() throws RecognitionException {
		PvariableContext _localctx = new PvariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(155);
				variable();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relation);
		try {
			setState(125);
			switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(123);
				relation_right();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(124);
				relation_left();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Relation_leftContext relation_left() throws RecognitionException {
		Relation_leftContext _localctx = new Relation_leftContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relation_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(137);
				node();
				setState(138);
				match(LARROW);
				setState(139);
				match(LBRAC);
				setState(140);
				node_variable();
				setState(141);
				node_type();
				setState(142);
				props();
				setState(143);
				match(RBRAC);
				setState(144);
				match(DASH);
				setState(145);
				node();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Relation_rightContext relation_right() throws RecognitionException {
		Relation_rightContext _localctx = new Relation_rightContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relation_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(127);
				node();
				setState(128);
				match(DASH);
				setState(129);
				match(LBRAC);
				setState(130);
				node_variable();
				setState(131);
				node_type();
				setState(132);
				props();
				setState(133);
				match(RBRAC);
				setState(134);
				match(RARROW);
				setState(135);
				node();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(72);
				match(RETURN);
				setState(73);
				property_variable();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == VIRGUL) {
					{
						{
							setState(74);
							match(VIRGUL);
							setState(75);
							property_variable();
						}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(118);
				match(STRING);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(120);
					match(COL);
					setState(121);
					variable();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(157);
				match(VARIABLE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
}
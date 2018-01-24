
// Generated from Program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#create}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCreate(@NotNull ProgramParser.CreateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#leftHand}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLeftHand(@NotNull ProgramParser.LeftHandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#match}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMatch(@NotNull ProgramParser.MatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#node}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNode(@NotNull ProgramParser.NodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#node_props}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNode_props(@NotNull ProgramParser.Node_propsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#node_relation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNode_relation(@NotNull ProgramParser.Node_relationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#node_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNode_type(@NotNull ProgramParser.Node_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#node_variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNode_variable(@NotNull ProgramParser.Node_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#program}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterProgram(@NotNull ProgramParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#program_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterProgram_(@NotNull ProgramParser.Program_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#property_variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterProperty_variable(@NotNull ProgramParser.Property_variableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#property_variable_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterProperty_variable_(@NotNull ProgramParser.Property_variable_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#props}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterProps(@NotNull ProgramParser.PropsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#pvariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPvariable(@NotNull ProgramParser.PvariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#relation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRelation(@NotNull ProgramParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#relation_left}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRelation_left(@NotNull ProgramParser.Relation_leftContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#relation_right}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRelation_right(@NotNull ProgramParser.Relation_rightContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#returnStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterReturnStatement(@NotNull ProgramParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#string}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterString(@NotNull ProgramParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterType(@NotNull ProgramParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariable(@NotNull ProgramParser.VariableContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#create}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCreate(@NotNull ProgramParser.CreateContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#leftHand}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLeftHand(@NotNull ProgramParser.LeftHandContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#match}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMatch(@NotNull ProgramParser.MatchContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#node}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNode(@NotNull ProgramParser.NodeContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#node_props}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNode_props(@NotNull ProgramParser.Node_propsContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#node_relation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNode_relation(@NotNull ProgramParser.Node_relationContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#node_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNode_type(@NotNull ProgramParser.Node_typeContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#node_variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNode_variable(@NotNull ProgramParser.Node_variableContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#program}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitProgram(@NotNull ProgramParser.ProgramContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#program_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitProgram_(@NotNull ProgramParser.Program_Context ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#property_variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitProperty_variable(@NotNull ProgramParser.Property_variableContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#property_variable_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitProperty_variable_(@NotNull ProgramParser.Property_variable_Context ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#props}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitProps(@NotNull ProgramParser.PropsContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#pvariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPvariable(@NotNull ProgramParser.PvariableContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#relation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRelation(@NotNull ProgramParser.RelationContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#relation_left}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRelation_left(@NotNull ProgramParser.Relation_leftContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#relation_right}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRelation_right(@NotNull ProgramParser.Relation_rightContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#returnStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitReturnStatement(@NotNull ProgramParser.ReturnStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#string}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitString(@NotNull ProgramParser.StringContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitType(@NotNull ProgramParser.TypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link ProgramParser#variable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariable(@NotNull ProgramParser.VariableContext ctx);
}
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import parsing.ds.ParsingNode;
import parsing.ds.ParsingRelation;

public class AntlrProgramListener extends ProgramBaseListener {

	Stack<Object> data = new Stack<>();

	
	@Override
	public void exitRelation_right(ProgramParser.Relation_rightContext ctx) {
		// TODO Auto-generated method stub
		super.exitRelation_right(ctx);
		try {
			ParsingNode end = (ParsingNode) data.pop();
			String type = (String) data.pop();
			String variable = (String) data.pop();
			ParsingNode start = (ParsingNode) data.pop();
			ParsingRelation pr = new ParsingRelation(start, end, null, type, variable);
			data.push(pr);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void exitRelation_left(ProgramParser.Relation_leftContext ctx) {
		// TODO Auto-generated method stub
		super.exitRelation_left(ctx);
		try {
			ParsingNode start = (ParsingNode) data.pop();
			String type = (String) data.pop();
			String variable = (String) data.pop();
			ParsingNode end = (ParsingNode) data.pop();
			ParsingRelation pr = new ParsingRelation(start, end, null, type, variable);
			data.push(pr);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void exitNode_variable(ProgramParser.Node_variableContext ctx) {
		super.exitNode_variable(ctx);
		data.push(ctx.getText());
	}

	@Override
	public void exitNode_type(ProgramParser.Node_typeContext ctx) {
		super.exitNode_type(ctx);

		try {
			String type = ctx.getText().substring(1);
			data.push(type);
		} catch (Exception e) {
			data.push("");
		}
	}

	@Override
	public void exitNode(ProgramParser.NodeContext ctx) {
		super.exitNode(ctx);

		String type = (String) data.pop();
		String variable = (String) data.pop();

		ParsingNode pn = new ParsingNode(type, variable, null);
		data.push(pn);
	}
	
	@Override
	public void exitProgram(ProgramParser.ProgramContext ctx) {
		super.exitProgram(ctx);
		
		System.out.println(data.pop());
	}
	
	
	
}
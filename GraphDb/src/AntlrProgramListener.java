import java.util.Stack;

import manager.Executer;
import parsing.ds.Parsing;
import parsing.ds.ParsingCreate;
import parsing.ds.ParsingLeftHand;
import parsing.ds.ParsingMatch;
import parsing.ds.ParsingNode;
import parsing.ds.ParsingProperty;
import parsing.ds.ParsingProps;
import parsing.ds.ParsingRelation;
import parsing.ds.ParsingReturn;
import parsing.ds.ParsingReturnPart;

public class AntlrProgramListener extends ProgramBaseListener {

	Stack<Object> data = new Stack<>();

	@Override
	public void exitNode_props(ProgramParser.Node_propsContext ctx) {
		// TODO Auto-generated method stub
		super.exitNode_props(ctx);

		String val = (String) data.pop();
		String name = (String) data.pop();

		data.push(new ParsingProps(name, val));
	}

	@Override
	public void enterProps(ProgramParser.PropsContext ctx) {
		// TODO Auto-generated method stub
		super.enterProps(ctx);

		data.push("#");
	}

	@Override
	public void exitProps(ProgramParser.PropsContext ctx) {
		// TODO Auto-generated method stub
		super.exitProps(ctx);

		Object obj = data.pop();

		ParsingProperty pp = new ParsingProperty();

		while (obj != "#") {
			pp.add((ParsingProps) obj);
			obj = data.pop();
		}

		data.push(pp);

	}

	@Override
	public void exitString(ProgramParser.StringContext ctx) {
		// TODO Auto-generated method stub
		super.exitString(ctx);

		String str = ctx.getText();

		data.push(str);
	}

	@Override
	public void enterReturnStatement(ProgramParser.ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterReturnStatement(ctx);
		data.push(".RETURN.");
	}

	@Override
	public void exitReturnStatement(ProgramParser.ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		super.exitReturnStatement(ctx);

		ParsingReturn pr = new ParsingReturn();

		Object obj = data.pop();

		while (obj.toString() != ".RETURN.") {
			try {
				pr.add((ParsingReturnPart) obj);
			} catch (Exception e) {
				System.out.println(e);
			}

			obj = data.pop();
		}
		// TODO

		data.push(pr);

	}

	@Override
	public void enterLeftHand(ProgramParser.LeftHandContext ctx) {
		// TODO Auto-generated method stub
		super.enterLeftHand(ctx);
		data.push("LEFT_HAND");
	}

	@Override
	public void exitLeftHand(ProgramParser.LeftHandContext ctx) {
		// TODO Auto-generated method stub
		super.exitLeftHand(ctx);

		ParsingLeftHand plh = new ParsingLeftHand();

		Object obj = data.pop();

		while (obj.toString() != "LEFT_HAND") {
			try {
				plh.add((Parsing) obj);
			} catch (Exception e) {
				System.out.println(e);
			}

			obj = data.pop();
		}
		// TODO

		data.push(plh);

	}

	@Override
	public void enterCreate(ProgramParser.CreateContext ctx) {
		// TODO Auto-generated method stub
		super.enterCreate(ctx);

		data.push("#");

	}

	@Override
	public void exitMatch(ProgramParser.MatchContext ctx) {
		// TODO Auto-generated method stub
		super.exitMatch(ctx);

		try {

			ParsingReturn pr = (ParsingReturn) data.pop();
			ParsingLeftHand plh = (ParsingLeftHand) data.pop();

			ParsingMatch pm = new ParsingMatch(plh, pr);
			data.push(pm);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void exitCreate(ProgramParser.CreateContext ctx) {
		// TODO Auto-generated method stub
		super.exitCreate(ctx);

		try {

			Object p1 = data.pop();
			Object p2 = data.pop();

			ParsingReturn pr = new ParsingReturn();

			if (p2.toString() != "#") {
				data.pop();
				pr = (ParsingReturn) p1;
				p1 = p2;
			}

			ParsingLeftHand plh = (ParsingLeftHand) p1;

			ParsingCreate pc = new ParsingCreate(plh, pr);
			data.push(pc);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void exitRelation_right(ProgramParser.Relation_rightContext ctx) {
		// TODO Auto-generated method stub
		super.exitRelation_right(ctx);
		try {
			ParsingNode end = (ParsingNode) data.pop();
			ParsingProperty pp = (ParsingProperty) data.pop();
			String type = (String) data.pop();
			String variable = (String) data.pop();
			ParsingNode start = (ParsingNode) data.pop();
			ParsingRelation pr = new ParsingRelation(start, end, pp, type, variable);
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
			ParsingProperty pp = (ParsingProperty) data.pop();
			String type = (String) data.pop();
			String variable = (String) data.pop();
			ParsingNode end = (ParsingNode) data.pop();
			ParsingRelation pr = new ParsingRelation(start, end, pp, type, variable);
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

		ParsingProperty pp = (ParsingProperty) data.pop();
		String type = (String) data.pop();
		String variable = (String) data.pop();

		ParsingNode pn = new ParsingNode(type, variable, pp);
		data.push(pn);
	}
	
	@Override
	public void exitProgram_(ProgramParser.Program_Context ctx) {
		super.exitProgram_(ctx);

		Executer exec = new Executer((parsing.ds.Parser) data.pop());
		exec.exec();

		while (!data.isEmpty())
			System.out.println(data.pop());
	}

	@Override
	public void enterProperty_variable(ProgramParser.Property_variableContext ctx) {
		// TODO Auto-generated method stub
		super.enterProperty_variable(ctx);

		data.push("#");
	}

	@Override
	public void exitProperty_variable(ProgramParser.Property_variableContext ctx) {
		// TODO Auto-generated method stub
		super.exitProperty_variable(ctx);

		String p1 = (String) data.pop();
		String p2 = (String) data.pop();

		if (p2 != "#") {
			data.pop();
			String tmp = p1;
			p1 = p2;
			p2 = tmp;
		} else {
			p2 = null;
		}

		ParsingReturnPart prp = new ParsingReturnPart(p1, p2);

		data.push(prp);

	}

	@Override
	public void exitPvariable(ProgramParser.PvariableContext ctx) {
		// TODO Auto-generated method stub
		super.exitPvariable(ctx);

		data.push(ctx.getText());
	}

}

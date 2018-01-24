package parsing.ds;

public class ParsingRelation implements Parsing {
	ParsingNode start, end;
	String type;
	ParsingProperty property;
	String variable;

	public ParsingNode getStart() {
		return start;
	}

	public ParsingNode getEnd() {
		return end;
	}

	public ParsingProperty getProperty() {
		return property;
	}

	public String getType() {
		return type;
	}

	public String getVariable() {
		return variable;
	}

	public ParsingRelation(ParsingNode start, ParsingNode end, ParsingProperty property, String type, String variable) {
		this.start = start;
		this.end = end;
		this.property = property;
		this.type = type;
		this.variable = variable;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Relation from " + start.toString() + " to " + end.toString() + " with type " + type + " and variable "
				+ variable;
	}

}

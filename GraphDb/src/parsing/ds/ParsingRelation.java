package parsing.ds;

public class ParsingRelation implements Parsing {
	ParsingNode start, end;
	String type;
	ParsingProperty properties;
	String variable;

	public ParsingRelation(ParsingNode start, ParsingNode end, ParsingProperty property, String type, String variable) {
		this.start = start;
		this.end = end;
		this.properties = property;
		this.type = type;
		this.variable = variable;
	}

	public ParsingNode getEnd() {
		return end;
	}

	public ParsingProperty getProperty() {
		return properties;
	}

	public ParsingNode getStart() {
		return start;
	}

	public String getType() {
		return type;
	}

	public String getVariable() {
		return variable;
	}

	@Override
	public String toString() {
		return "Relation from " + start.toString() + " to " + end.toString() + " with type " + type + " and variable "
				+ variable + " and properties: " + this.properties;
	}

}

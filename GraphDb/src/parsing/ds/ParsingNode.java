package parsing.ds;

public class ParsingNode implements Parsing {
	private String type;
	private String variable;
	private ParsingProperty properties;

	public ParsingNode(String type, String variable, ParsingProperty properties) {
		this.type = type;
		this.variable = variable;
		this.properties = properties;
	}

	public ParsingProperty getProperties() {
		return properties;
	}

	public String getType() {
		return type;
	}

	public String getVariable() {
		return variable;
	}

	@Override
	public String toString() {
		return "Node of type: " + type + " with variable " + variable + " and properties: " + this.properties;
	}

}

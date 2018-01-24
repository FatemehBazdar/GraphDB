package parsing.ds;

public class ParsingNode implements Parsing{
	private String type;
	private String variable;
	private ParsingProperty properties;

	
	public String getVariable() {
		return variable;
	}
	
	public ParsingProperty getProperties() {
		return properties;
	}

	public String getType() {
		return type;
	}

	public ParsingNode(String type, String variable, ParsingProperty properties) {
		this.type = type;
		this.variable = variable;
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node of type: " + type + " with variable " + variable + " and properties: " + this.properties;
	}
	
}

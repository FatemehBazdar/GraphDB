package parsing.ds;

public class ParsingProps {

	private String name;
	private String val;

	public ParsingProps(String name, String val) {
		this.name = name;
		this.val = val;
	}

	public String getName() {
		return name;
	}

	public String getVal() {
		return val;
	}

	@Override
	public String toString() {
		return this.name + ": " + this.val;
	}
}

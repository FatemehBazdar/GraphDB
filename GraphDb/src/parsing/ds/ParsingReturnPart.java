package parsing.ds;

public class ParsingReturnPart {

	private String obj;
	private String property;

	public ParsingReturnPart(String obj, String property) {
		this.obj = obj;
		this.property = property;
	}

	public String getObj() {
		return obj;
	}

	public String getProperty() {
		return property;
	}

	@Override
	public String toString() {
		String tmp = "";
		if (this.property != "#")
			tmp = "." + this.property;
		return this.obj + tmp;
	}

}

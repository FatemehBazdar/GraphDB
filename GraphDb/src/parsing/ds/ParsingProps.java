package parsing.ds;

public class ParsingProps {

	private String name;
	private String val;

	public String getName() {
		return name;
	}
	
	public String getVal() {
		return val;
	}
	
	public ParsingProps(String name, String val) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.val = val;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + ": " + this.val;
	}
}

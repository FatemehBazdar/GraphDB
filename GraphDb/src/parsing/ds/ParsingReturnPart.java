package parsing.ds;

public class ParsingReturnPart {

	private String obj;
	private String property;
	
	public String getObj() {
		return obj;
	}
	
	public String getProperty() {
		return property;
	}
	
	public ParsingReturnPart(String obj, String property) {
		// TODO Auto-generated constructor stub
		
		this.obj = obj;
		this.property = property;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmp = "";
		if(this.property!="#")
			tmp = "."+this.property;
		return this.obj + tmp;
	}
	
}

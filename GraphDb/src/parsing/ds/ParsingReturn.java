package parsing.ds;

import java.util.ArrayList;

public class ParsingReturn {
	private ArrayList<ParsingReturnPart> list = new ArrayList<>();
	
	public void add(ParsingReturnPart s) {
		this.list.add(s);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String list = "";
		for (ParsingReturnPart s: this.list)
			list += "* " + s + "\n";
		return list;
	}
}

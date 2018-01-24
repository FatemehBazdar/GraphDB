package parsing.ds;

import java.util.ArrayList;

public class ParsingLeftHand {
	private ArrayList<Parsing> list = new ArrayList<>();
	
	public void add(Parsing p) {
		this.list.add(p);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String list = "";
		for (Parsing p: this.list)
			list += "* " + p.toString() + "\n";
		return list;
	}
}

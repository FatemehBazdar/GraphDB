package parsing.ds;

import java.util.ArrayList;

public class ParsingLeftHand extends ArrayList<Parsing> {

	@Override
	public String toString() {
		String list = "";
		for (Parsing p : this)
			list += "* " + p.toString() + "\n";
		return list;
	}
}

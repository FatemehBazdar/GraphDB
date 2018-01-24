package parsing.ds;

import java.util.ArrayList;

public class ParsingReturn extends ArrayList<ParsingReturnPart> {

	@Override
	public String toString() {
		String list = "";
		for (ParsingReturnPart s : this)
			list += "* " + s + "\n";
		return list;
	}
}

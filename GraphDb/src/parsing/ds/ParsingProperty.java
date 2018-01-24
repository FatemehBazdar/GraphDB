package parsing.ds;

import java.util.ArrayList;

public class ParsingProperty extends ArrayList<ParsingProps> {

	@Override
	public String toString() {
		return super.toString().replaceAll("^\\[", "{").replaceAll("\\]$", "}");
	}

}

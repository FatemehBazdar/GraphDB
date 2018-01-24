package parsing.ds;

import java.util.ArrayList;

public class ParsingProperty extends ArrayList<ParsingProps>{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString().replaceAll("^\\[", "{").replaceAll("\\]$","}");
	}
	
}

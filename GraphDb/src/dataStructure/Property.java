package dataStructure;

import java.util.HashMap;

import parsing.ds.ParsingProperty;
import parsing.ds.ParsingProps;

public class Property extends HashMap<String, Object> {

	public Property(ParsingProperty properties) {
		for (ParsingProps pp : properties) {
			this.put(pp.getName(), pp.getVal());
		}
	}

}

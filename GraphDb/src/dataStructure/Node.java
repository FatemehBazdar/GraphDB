package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

import parsing.ds.ParsingNode;
import parsing.ds.ParsingProps;

public class Node extends DBType {
	private String type;

	public String getType() {
		return type;
	}

	public Node(ParsingNode pn) {
		this.type = pn.getType();
		this.properties = new Property(pn.getProperties());
	}

	public boolean compatible(ParsingNode pn) {
		if (!pn.getType().isEmpty() && !getType().equals(pn.getType()))
			return false;

		Property p = getProperties();
		for (ParsingProps prp : pn.getProperties()) {
			if (!p.containsKey(prp.getName()) || !p.get(prp.getName()).equals(prp.getVal()))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmp = "";
		if (!this.type.isEmpty()) {
			tmp = ":" + this.type;
		}

		return "(" + tmp + this.properties + ")";
	}

}

package dataStructure;

import parsing.ds.ParsingNode;
import parsing.ds.ParsingProps;

public class Node extends DBType {
	private String type;

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

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		String tmp = "";
		if (!this.type.isEmpty()) {
			tmp = ":" + this.type;
		}

		return "(" + tmp + this.properties + ")";
	}

}

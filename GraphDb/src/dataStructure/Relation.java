package dataStructure;

import java.util.LinkedList;

import parsing.ds.ParsingNode;
import parsing.ds.ParsingProps;
import parsing.ds.ParsingRelation;

public class Relation extends DBType {

	private Node start;
	private Node end;

	private String type;

	public Relation(ParsingRelation pr) {
		this.start = new Node(pr.getStart());
		this.end = new Node(pr.getEnd());
		this.type = pr.getType();
		this.properties = new Property(pr.getProperty());
	}
	
	public void setEnd(Node end) {
		this.end = end;
	}
	
	public void setStart(Node start) {
		this.start = start;
	}

	public Node getStart() {
		return start;
	}

	public Node getEnd() {
		return end;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Relation from " + start + " to " + end + " with property " + this.properties;
	}

	public boolean compatible(ParsingRelation pr) {
		if (!pr.getType().isEmpty() && !type.equals(pr.getType()))
			return false;

		Property p = getProperties();
		for (ParsingProps prp : pr.getProperty()) {
			if (!p.containsKey(prp.getName()) || !p.get(prp.getName()).equals(prp.getVal()))
				return false;
		}
		
		return start.compatible(pr.getStart()) && end.compatible(pr.getEnd());
	}

}

package dataStructure;

import java.util.LinkedList;

public class Relation {

	private Node start;
	private Node end;

	private String type;
	private Property properties;

	public Node getEnd() {
		return end;
	}

	public Property getProperties() {
		return properties;
	}

	public Node getStart() {
		return start;
	}

	public String getType() {
		return type;
	}
	
	public Relation(Node start, Node end, String type) {
		this.start = start;
		this.end = end;
		this.type = type;
		this.properties = new Property();
	}
	
	public Relation(Node start, Node end, String type, Property p) {
		this.start = start;
		this.end = end;
		this.type = type;
		this.properties = p;
	}

}

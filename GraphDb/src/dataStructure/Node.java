package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Node {
	private String type;
	private Property properties;

	public Property getProperties() {
		return properties;
	}

	public String getType() {
		return type;
	}
	
	Node(String type, Property properties){
		this.type = type;
		this.properties = properties;
	}
	
	Node(String type){
		this.type = type;
		this.properties = new Property();
	}
	
	Node(){
		this.type = "";
		this.properties = new Property();
	}

	Node(Property properties){
		this.type = "";
		this.properties = properties;
	}
	
}

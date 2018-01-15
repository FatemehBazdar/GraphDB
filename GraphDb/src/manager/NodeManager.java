package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import dataStructure.Node;
import dataStructure.Relation;

public class NodeManager {
	private NodeManager() {
	}

	private static NodeManager instance = new NodeManager();

	public static NodeManager getInstance() {
		return instance;
	}

	ArrayList<Node> nodes = new ArrayList();
	

	void add(Node node) {

	}

	void delete(int i) {

	}

	Node get(int i) {
		return null;
	}
}

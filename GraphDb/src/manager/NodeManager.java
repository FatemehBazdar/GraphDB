package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import dataStructure.DBType;
import dataStructure.Node;
import dataStructure.Property;
import dataStructure.Relation;
import parsing.ds.ParsingNode;
import parsing.ds.ParsingProps;

public class NodeManager extends ArrayList<Node> {
	private NodeManager() {
	}

	private static NodeManager instance = new NodeManager();

	public static NodeManager getInstance() {
		return instance;
	}

	public ArrayList<DBType> match(ParsingNode pn) {
		// TODO Auto-generated method stub
		ArrayList<DBType> ans = new ArrayList();

		for (Node n : this) {
			if (n.compatible(pn))
				ans.add(n);
		}

		return ans;
	}
}

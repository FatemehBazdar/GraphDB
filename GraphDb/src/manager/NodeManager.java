package manager;

import java.util.ArrayList;

import dataStructure.DBType;
import dataStructure.Node;
import parsing.ds.ParsingNode;

public class NodeManager extends ArrayList<Node> {
	private static NodeManager instance = new NodeManager();

	public static NodeManager getInstance() {
		return instance;
	}

	private NodeManager() {
	}

	public ArrayList<DBType> match(ParsingNode pn) {
		ArrayList<DBType> ans = new ArrayList();

		for (Node n : this) {
			if (n.compatible(pn))
				ans.add(n);
		}

		return ans;
	}
}

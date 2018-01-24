package manager;

import java.util.ArrayList;
import java.util.LinkedList;

import dataStructure.DBType;
import dataStructure.Node;
import dataStructure.Relation;
import parsing.ds.ParsingNode;
import parsing.ds.ParsingRelation;

public class RelationManager extends ArrayList<Relation> {
	private RelationManager() {
	}

	private static RelationManager instance = new RelationManager();

	@Override
	public boolean add(Relation r) {

		// Doing this in Executer now.
		// NodeManager.getInstance().add(r.getStart());
		// NodeManager.getInstance().add(r.getEnd());
		return super.add(r);

	}

	public ArrayList<DBType> match(ParsingRelation pn) {
		// TODO Auto-generated method stub
		ArrayList<DBType> ans = new ArrayList();

		for (Relation n : this) {
			if (n.compatible(pn))
				ans.add(n);
		}

		return ans;
	}

	public static RelationManager getInstance() {
		return instance;
	}
}

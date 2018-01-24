package manager;

import java.util.ArrayList;

import dataStructure.DBType;
import dataStructure.Relation;
import parsing.ds.ParsingRelation;

public class RelationManager extends ArrayList<Relation> {
	private static RelationManager instance = new RelationManager();

	public static RelationManager getInstance() {
		return instance;
	}

	private RelationManager() {
	}

	@Override
	public boolean add(Relation r) {

		// Doing this in Executer now.
		// NodeManager.getInstance().add(r.getStart());
		// NodeManager.getInstance().add(r.getEnd());
		return super.add(r);

	}

	public ArrayList<DBType> match(ParsingRelation pn) {
		ArrayList<DBType> ans = new ArrayList();

		for (Relation n : this) {
			if (n.compatible(pn))
				ans.add(n);
		}

		return ans;
	}
}

package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import dataStructure.DBType;
import dataStructure.Node;
import dataStructure.Relation;
import parsing.ds.Parser;
import parsing.ds.Parsing;
import parsing.ds.ParsingCreate;
import parsing.ds.ParsingMatch;
import parsing.ds.ParsingNode;
import parsing.ds.ParsingRelation;
import parsing.ds.ParsingReturnPart;

public class Executer {

	Parser p;
	ParsingCreate c;
	ParsingMatch m;

	NodeManager nodeManager = NodeManager.getInstance();
	RelationManager relationManager = RelationManager.getInstance();

	Map<String, DBType> variables = new HashMap<>();
	Map<String, ArrayList<DBType>> posibilities = new HashMap<>();

	public Executer(Parser p) {
		this.p = p;
	}

	public void exec() {
		System.out.println("***********DEBUG BEGIN************");
		System.out.println(p);
		System.out.println("************DEBUG END*************");
		if (p instanceof ParsingCreate) {
			c = (ParsingCreate) p;
			create();
		} else if (p instanceof ParsingMatch) {
			m = (ParsingMatch) p;
			match();
		}
	}

	private void c_Return(ParsingReturnPart var) {
		if (var.getProperty() == null) {
			// Doesn't have property
			if (variables.get(var.getObj()) != null) {
				System.out.println(var.getObj() + ": " + variables.get(var.getObj()));
			} else {
				System.out.println(var.getObj() + ": NOT FOUND");
			}
		} else {
			// Has Property
			if (variables.get(var.getObj()) != null) {
				DBType dbt = variables.get(var.getObj());
				if (dbt.getProperties().containsKey(var.getProperty())) {
					System.out.println(
							var.getObj() + "." + var.getProperty() + ": " + dbt.getProperties().get(var.getProperty()));
				} else {
					System.out.println(var.getObj() + "." + var.getProperty() + ": NOT FOUND");
				}
			} else {
				System.out.println(var.getObj() + ": NOT FOUND");
			}
		}
	}

	private void m_Return(ParsingReturnPart var) {
		// TODO
		if (var.getProperty() == null) {
			// Doesn't have property
			if (posibilities.get(var.getObj()) != null) {
				System.out.println(var.getObj() + ": " + posibilities.get(var.getObj()));
			} else {
				System.out.println(var.getObj() + ": NOT FOUND");
			}
		} else {
			// Has Property
			if (posibilities.get(var.getObj()) != null) {
				for (DBType dbt : posibilities.get(var.getObj())) {

					if (dbt.getProperties().containsKey(var.getProperty())) {
						System.out.println(var.getObj() + "." + var.getProperty() + ": "
								+ dbt.getProperties().get(var.getProperty()));
					} else {
						System.out.println(var.getObj() + "." + var.getProperty() + ": NOT FOUND");
					}
				}
			} else {
				System.out.println(var.getObj() + ": NOT FOUND");
			}
		}
	}

	private void create() {
		// Add nodes
		for (Parsing p : c.getLeftHand()) {
			if (p instanceof ParsingNode) {
				ParsingNode pn = (ParsingNode) p;

				Node n = new Node(pn);
				nodeManager.add(n);
				variables.put(pn.getVariable(), n);

			} else if (p instanceof ParsingRelation) {

				ParsingRelation pr = (ParsingRelation) p;

				Relation r = new Relation(pr);
				relationManager.add(r);
				variables.put(pr.getVariable(), r);
				variables.put(pr.getStart().getVariable(), r.getStart());
				variables.put(pr.getEnd().getVariable(), r.getEnd());
			}
		}

		for (ParsingReturnPart prp : c.getReturn()) {
			c_Return(prp);
		}
	}

	private ArrayList<DBType> node_match(ParsingNode pn) {

		if (posibilities.containsKey(pn.getVariable())) {
			ArrayList<DBType> ans = new ArrayList();
			for (DBType dbt : posibilities.get(pn.getVariable())) {
				if (dbt instanceof Node) {
					Node n = (Node) dbt;
					if (n.compatible(pn)) {
						ans.add(n);
					}
				}
			}
			return ans;
		} else {
			return nodeManager.match(pn);
		}
	}

	private void match() {
		// Match nodes
		for (Parsing p : m.getLeftHand()) {
			if (p instanceof ParsingNode) {
				ParsingNode pn = (ParsingNode) p;
				if (!pn.getVariable().isEmpty())
					posibilities.put(pn.getVariable(), node_match(pn));

			} else if (p instanceof ParsingRelation) {
				ParsingRelation pr = (ParsingRelation) p;

				// Relation
				ArrayList<Relation> relations = new ArrayList();

				if (posibilities.containsKey(pr.getVariable())) {
					for (DBType dbt : posibilities.get(pr.getVariable())) {
						if (dbt instanceof Node) {
							Relation n = (Relation) dbt;
							if (n.compatible(pr)) {
								relations.add(n);
							}
						}
					}
				} else {
					for (DBType dbt : relationManager.match(pr))
						relations.add((Relation) dbt);
				}

				// Left and Right

				// Match Left
				ArrayList<DBType> start = node_match(pr.getStart());
				// Match right
				ArrayList<DBType> end = node_match(pr.getEnd());

				// TODO Cross reference with variables
				ArrayList<DBType> ans_rel = new ArrayList();
				ArrayList<DBType> ans_start = new ArrayList();
				ArrayList<DBType> ans_end = new ArrayList();

				for (Relation r : relations) {
					if (start.contains(r.getStart()) && end.contains(r.getEnd())) {
						ans_rel.add(r);
						if (!ans_start.contains(r.getStart()))
							ans_start.add(r.getStart());
						if (!ans_end.contains(r.getEnd()))
							ans_end.add(r.getEnd());
					}
				}

				if (!pr.getVariable().isEmpty())
					posibilities.put(pr.getVariable(), ans_rel);
				if (!pr.getStart().getVariable().isEmpty())
					posibilities.put(pr.getStart().getVariable(), ans_start);
				if (!pr.getEnd().getVariable().isEmpty())
					posibilities.put(pr.getEnd().getVariable(), ans_end);

			}
		}

		// Parse return
		for (ParsingReturnPart prp : m.getReturn()) {
			m_Return(prp);
		}
	}

}

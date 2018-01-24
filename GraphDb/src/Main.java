import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	/*
	 * create a relation of type fgb from b to a.
	 * 
	 * CREATE (a)<-[c: fgb]-(b)
	 */
	static String test_create = "CREATE (a)<-[c : fgb]-(b)";

	/*
	 * Create a relation of type fgb from b to a, also create node a.
	 * 
	 * CREATE (a)<-[c: fgb]-(b), (a)
	 * 
	 */
	static String test_multi_create = "CREATE (a)<-[c : fgb]-(b), (a)";

	/*
	 * Create a relation of type b from a to d, return a
	 * 
	 * CREATE (a)-[c:b]->(d) RETURN a
	 * 
	 */
	static String test_create_return = "CREATE (a)-[c:b]->(d) RETURN a";

	/*
	 * Search for all nodes.
	 * 
	 * MATCH (a) RETURN a;
	 * 
	 */
	static String test_match = "MATCH (a) RETURN a";

	/*
	 * Match all nodes, return the b property.
	 * 
	 * MATCH (a) RETURN a.b
	 */
	static String test_match_prp = "MATCH (a) RETURN a.b";

	/*
	 * Create a person with property name=Bandal
	 * 
	 * CREATE (a: Person {name: "Bandal"})
	 * 
	 */
	static String test_property = "CREATE (a: Person {name: \"Bandal\"})";

	/*
	 * Create a person named Bandal, A person named Bazdar and add a Relation from
	 * bandal to Bazdar With property met: 4 years and kind: classmate
	 * 
	 * CREATE(a: Person {name: "Bandal")-[:Relation {met: "4 years", kind:
	 * "classmate"}->(b: Person {name: "Bazdar"})
	 * 
	 */
	static String test_rel_property = "CREATE (a: Person {name: \"Bandal\"})-"
			+ "[:Relation {met: \"4 years\", kind:\"classmate\"}]->" + "(b: Person {name:\"Bazdar\"})";

	/*
	 * Same as above, return bandal's name and Bazdar and the relation.
	 * 
	 * CREATE(a: Person {name: "Bandal")-[:Relation {met: "4 years", kind:
	 * "classmate"}->(b: Person {name: "Bazdar"}) RETURN a.name, b, r
	 * 
	 */
	static String test_rel_property_return = "CREATE (a: Person {name: \"Bandal\"})-"
			+ "[r:Relation {met: \"4 years\", kind:\"classmate\"}]->" + "(b: Person {name:\"Bazdar\"})"
			+ "RETURN a.name,b,r";

	/*
	 * Run multiple queries.
	 * 
	 * First Create the people from last example with more properties.
	 * 
	 * CREATE(a: Person {name: "Bandal", age: "kheili")-[:Relation {met: "4 years",
	 * kind: "classmate"}->(b: Person {name: "Bazdar"}) RETURN a.name, b, r
	 * 
	 * Then Match all persons
	 * 
	 * MATCH (a:Person) RETURN a;
	 * 
	 * Then Match all nodes who also have property age: kheili (notice how b is used
	 * multiple places)
	 * 
	 * MATCH (b),(b{age:"kheili"}) RETURN b.name, b.age
	 * 
	 */
	static String complex = "CREATE (a: Person {name: \"Bandal\", age:\"kheili\"})-"
			+ "[r:Relation {met: \"4 years\", kind:\"classmate\"}]->" + "(b: Person {name:\"Bazdar\"})"
			+ "RETURN a.name,b,r; " + "MATCH (a:Person) RETURN a;"
			+ "MATCH (b),(b{age:\"kheili\"}) RETURN b.name, b.age";

	/*
	 * Run multiple queries.
	 * 
	 * First Create the people from last example with more properties.
	 * 
	 * CREATE(a: Person {name: "Bandal", age: "kheili")-[:Relation {met: "4 years",
	 * kind: "classmate"}-> (b: Person {name: "Bazdar"}) RETURN a.name, b, r
	 * 
	 * Then Match any two nodes who are in a relation.
	 * 
	 * MATCH (a)-[]->(b) RETURN b, a.name
	 * 
	 */
	static String complex2 = "CREATE (a: Person {name: \"Bandal\", age:\"kheili\"})-"
			+ "[r:Relation {met: \"4 years\", kind:\"classmate\"}]->" + "(b: Person {name:\"Bazdar\"})"
			+ "RETURN a.name,b,r; " + "MATCH (a)-[]->(b) RETURN b,a.name";

	/*
	 * Run multiple queries.
	 * 
	 * First Create the people from last example with more properties. Notice how a
	 * is used multiple places.
	 * 
	 * CREATE(a: Person {name: "Bandal", age: "kheili")-[:Relation {met: "4 years",
	 * kind: "classmate"}-> (b: Person {name: "Bazdar"}), (a {term:"9") RETURN
	 * a.name, b, r
	 * 
	 * Then Match any two nodes who are in a relation.
	 * 
	 * MATCH (a)-[]->(b) RETURN b, a.name
	 * 
	 */
	static String complex3 = "CREATE (a: Person {name: \"Bandal\", age:\"kheili\"})-"
			+ "[r:Relation {met: \"4 years\", kind:\"classmate\"}]->"
			+ "(b: Person {name:\"Bazdar\"}), (a {term:\"9\"}), (b)-[]->(a)" + "RETURN a.name,b,r; "
			+ "MATCH (a)-[]->(b) RETURN b,a.name";

	static String test = complex3;

	public static void main(String[] args) {
		ProgramLexer pl = new ProgramLexer(new ANTLRInputStream(test));
		CommonTokenStream cts = new CommonTokenStream(pl);
		ProgramParser pp = new ProgramParser(cts);

		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrProgramListener apl = new AntlrProgramListener();
		walker.walk(apl, pp.program());
	}

}

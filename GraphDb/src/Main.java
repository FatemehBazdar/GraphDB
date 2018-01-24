import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
	
	static String test_create = "CREATE (a)<-[c : fgb]-(b)";
	static String test_multi_create = "CREATE (a)<-[c : fgb]-(b), (a)";
	static String test_create_return = "CREATE (a)-[c:b]->(d) RETURN a";
	static String test_match = "MATCH (a) RETURN a";
	static String test_match_prp = "MATCH (a) RETURN a.b";
			
	static String test = test_create_return;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramLexer pl= new ProgramLexer(new ANTLRInputStream(test)) ;
		CommonTokenStream cts = new CommonTokenStream(pl);
		ProgramParser pp = new ProgramParser(cts);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrProgramListener apl = new AntlrProgramListener();
		walker.walk(apl, pp.program());
	}

}

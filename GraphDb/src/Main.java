import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramLexer pl= new ProgramLexer(new ANTLRInputStream("CREATE (a)<-[c : fgb]-(b)")) ;
		CommonTokenStream cts = new CommonTokenStream(pl);
		ProgramParser pp = new ProgramParser(cts);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrProgramListener apl = new AntlrProgramListener();
		walker.walk(apl, pp.program());
	}

}

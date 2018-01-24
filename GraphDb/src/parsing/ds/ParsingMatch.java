package parsing.ds;

import java.util.ArrayList;

public class ParsingMatch implements Parser{
	private ParsingReturn pr;
	private ParsingLeftHand plh;
	
	public ParsingMatch(ParsingLeftHand plh, ParsingReturn pr) {
		this.plh = plh;
		this.pr = pr;
	}
	
	public ParsingLeftHand getLeftHand() {
		return plh;
	}
	
	public ParsingReturn getReturn() {
		return pr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Matching List:\n" + plh.toString() + "\nReturning:\n" + pr.toString();
	}
}

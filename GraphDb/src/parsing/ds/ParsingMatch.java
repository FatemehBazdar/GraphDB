package parsing.ds;

import java.util.ArrayList;

public class ParsingMatch {
	private ParsingReturn pr;
	private ParsingLeftHand plh;
	
	public ParsingMatch(ParsingLeftHand plh, ParsingReturn pr) {
		this.plh = plh;
		this.pr = pr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Matching List:\n" + plh.toString() + "\nReturning:\n" + pr.toString();
	}
}

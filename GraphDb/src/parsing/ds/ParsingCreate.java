package parsing.ds;

import java.util.ArrayList;

public class ParsingCreate implements Parser{
	private ParsingLeftHand plh;
	private ParsingReturn pr;
	
	public ParsingCreate(ParsingLeftHand plh, ParsingReturn pr) {
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
		return "Creating List:\n" + plh.toString() + "\nReturning: \n"+ pr.toString();
	}
}

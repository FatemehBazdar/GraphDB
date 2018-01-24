package parsing.ds;

import java.util.ArrayList;

public class ParsingCreate {
	private ParsingLeftHand plh;
	private ParsingReturn pr;
	
	public ParsingCreate(ParsingLeftHand plh, ParsingReturn pr) {
		this.plh = plh;
		this.pr = pr;
	}
	
	public void setLeftHand(ParsingLeftHand plh) {
		this.plh = plh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Creating List:\n" + plh.toString() + "\nReturning: \n"+ pr.toString();
	}
}

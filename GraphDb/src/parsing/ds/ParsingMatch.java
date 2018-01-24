package parsing.ds;

public class ParsingMatch implements Parser {
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
		return "Matching List:\n" + plh.toString() + "\nReturning:\n" + pr.toString();
	}
}

package problem.five;

public class King extends Piece{

	public King(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(Math.abs(a.getNumber() - b.getNumber()) <= 1 && Math.abs(a.getNumericValue() - b.getNumericValue()) <= 1) {
			setPosition(b);
			return true;
		}
		return false;
	}

}

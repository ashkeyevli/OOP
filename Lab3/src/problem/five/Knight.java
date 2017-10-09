package problem.five;

public class Knight extends Piece{

	public Knight(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {		
		if(Math.abs(a.getNumber() - b.getNumber()) * Math.abs(a.getNumericValue() - b.getNumericValue()) == 2) {
			setPosition(b);
			return true;
		}
		return false;
	}

}

package problem.five;

public class Pawn extends Piece{

	public Pawn(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(a.getNumber() < 2 || b.getNumber() < 2) 
			return false;
		
		if(a.getNumber() == 2 && a.getLetter() == b.getLetter() && b.getNumber() - a.getNumber() == 2) {
			setPosition(b);
			return true;
		}
		
		if(b.getNumber() - a.getNumber() == 1 && (a.getLetter() == b.getLetter() 
				|| Math.abs(a.getNumericValue() - b.getNumericValue()) == 1)) {
			setPosition(b);
			return true;
		}
		return false;
	}

}

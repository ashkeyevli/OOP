package problem.five;

public class Bishop extends Piece{

	public Bishop(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(isLegalMove(a, b)) {
			setPosition(b);
			return true;
		}
		return false;
	}
	
	public static boolean isLegalMove(Position a, Position b) {
		return Math.abs(a.getNumber() - b.getNumber()) == Math.abs(a.getNumericValue() - b.getNumericValue());
	}
}

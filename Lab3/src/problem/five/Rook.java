package problem.five;

public class Rook extends Piece{

	public Rook(Position a) {
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
		return a.getNumber() == b.getNumber() || a.getLetter() == b.getLetter();
	}

}

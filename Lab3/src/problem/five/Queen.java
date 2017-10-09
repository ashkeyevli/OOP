package problem.five;

public class Queen extends Piece{
	
	public Queen(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		return Rook.isLegalMove(a, b) || Bishop.isLegalMove(a, b);
	}

}

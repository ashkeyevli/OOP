package problem.five;

public abstract class Piece {	
	protected Position a;
	
	public Piece(Position a) {
		this.a = a;
	}
	
	public void setPosition(Position a) {
		this.a = a;
	}
	
	public abstract boolean isLegalMove(Position b);
}

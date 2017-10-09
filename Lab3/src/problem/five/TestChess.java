package problem.five;

import problem.five.Position.Letter;

public class TestChess {

	public static void main(String[] args) {
		Position a = new Position(Letter.A, 2);
		Pawn pawn = new Pawn(a);		
		Position b = new Position(Letter.B, 4);
		System.out.println(pawn.isLegalMove(b));
		
		Knight knight = new Knight(a);
		System.out.println(knight.isLegalMove(b));
	}

}

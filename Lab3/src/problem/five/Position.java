package problem.five;

public class Position {
	enum Letter {A, B, C, D, E, F, G, H};
	private Letter letter;
	private int number;
	
	public Position(Letter letter, int number) {
		this.letter = letter;
		if(number < 8 && number > 1)
			this.number = number;
	}

	public String getLetter() {
		return letter.toString();
	}

	public void setLetter(Letter letter) {
		this.letter = letter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}	
	
	public int getNumericValue() {
		return letter.ordinal();
	}
}

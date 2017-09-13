package problem.three;

class Person {
	public enum Gender {B, G};
	
	private Gender gender;
	
	public Person(char gender) {
		if (gender == 'G') this.gender = Gender.G;
		else this.gender = Gender.B;
	}
	
	public String toString() {
		return String.valueOf(gender);
	}
}

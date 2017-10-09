package problem.four;

class Student extends Person{
	int yearOfStudy = 1;

	public Student(String name) {
		super(name);
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	@Override
	public String getName() {
		return "Student's name is " + name;
	}

}

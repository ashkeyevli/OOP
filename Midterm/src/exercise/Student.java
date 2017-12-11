package exercise;

import java.util.Objects;
import java.util.Vector;

public class Student extends User {
	private double gpa;
	Vector<Integer> marks = new Vector<>();
	
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void addMark(int mark) {
		marks.addElement(mark);
	}
	
	public boolean equals(Object o) {		
		Student student = (Student) o;
				
		return super.equals(o) && gpa == student.getGpa() && marks.equals(student.marks);
	}
	
	public String toString() {
		return String.format("%s My GPA: %f. My marks: %s", super.toString(), gpa, marks.toString());
	}

	@Override
	public int compareTo(Object o) {
		if (super.compareTo(o) == 0) {
			Student student = (Student) o;
			if(gpa > student.getGpa()) return 1;
			if(gpa < student.getGpa()) return -1;
			return 0;
		}
		return super.compareTo(o);
	}
	
	public int hashcode() {
		int result = Objects.hash(Objects.hash(gpa)) + super.hashcode();
		return result;
	}
	
}

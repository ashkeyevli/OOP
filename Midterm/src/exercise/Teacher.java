package exercise;

import java.util.Objects;
import java.util.Vector;

class Teacher extends User implements Comparable<Object>{
	private double salary;
	Vector<Student> students = new Vector<>();
	
	public Teacher(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public boolean equals(Object o) {
		Teacher teacher = (Teacher) o;
			
		return super.equals(o) && salary == teacher.getSalary() && students.equals(teacher.students);
	}
	
	public String toString() {
		return String.format("%s My salary: %f. My students: %s.", super.toString(), salary, students.toString());
	}

	public int compareTo(Object o) {
		if (super.compareTo(o) == 0) {
			Teacher teacher = (Teacher) o;
			if(salary > teacher.getSalary()) return 1;
			if(salary < teacher.getSalary()) return -1;
			return 0;
		}
		return super.compareTo(o);
	}	
	
	public int hashcode() {
		int result = Objects.hash(Objects.hash(salary)) + super.hashcode();
		return result;
	}
}

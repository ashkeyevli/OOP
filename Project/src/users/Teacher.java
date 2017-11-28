package users;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

import course.Course;
import enums.Degree;
import enums.Position;
import interfaces.Orderable;
import posted.Order;

public class Teacher extends Employee implements Orderable, Serializable {
	private static final long serialVersionUID = -3122006531541383471L;
	private Position position;
	private Degree degree;
	private HashMap<Course, Vector<Student>> journal;
	public Position getPosition() {
	    return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Degree getDegree() {
	    return degree;
	}
	
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	
	@Override
	public void makeOrder(Order o) {
		if (orders.contains(o)) System.out.println("Order already exists.");
		else {
			orders.add(o);
			System.out.println("Order was sent.");
		}
	}
	
	public void addStudentToCourse(Course c, Student s) {
		journal.get(c).add(s);
		System.out.println("Student was added.");
	}
	
	public void addCourse(Course c) {
		journal.put(c, new Vector<>());
	}
	
	@Override
	public String toString() {		 
		return String.format("%s\nPosition: %s. Degree: %s.", super.toString(), position, degree);
	}
	
	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher) obj;
		return super.equals(obj) && teacher.getDegree() == degree && teacher.getPosition().equals(position);
	}
}


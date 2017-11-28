package users;

import java.io.Serializable;

import course.Course;
import interfaces.Orderable;
import posted.Order;
import storage.Storage;

public class Admin extends Employee implements Orderable, Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8775321862651644254L;

	public void deleteUser(User u) {
		if(u instanceof Teacher) Storage.teachers.remove(u);
		if(u instanceof Student) Storage.students.remove(u);
		if(u instanceof Executor) Storage.executors.remove(u);
		if(u instanceof Manager) Storage.managers.remove(u);
		if(u instanceof Admin) Storage.admins.remove(u);
		System.out.println("User was succesfully removed.");
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String username, int password) {
		this.username = username;
		this.password = password;
	}
	
	public void addUser(User u) {
		if(u instanceof Teacher) {
			if(Storage.teachers.contains(u)) System.out.println("Teacher already exists.");
			else {
				Storage.teachers.add((Teacher) u);
				return;
			}
		}
		
		if(u instanceof Student) {
			if(Storage.students.contains(u)) System.out.println("Student already exists.");
			else {
				Storage.students.add((Student) u);
				System.out.println("Studen was added successfully.");
				return;
			}
		}
		
		if(u instanceof Executor) {
			if(Storage.students.contains(u)) System.out.println("Student already exists.");
			else {
				Storage.executors.add((Executor) u);
				return;
			}
		}
		
		if(u instanceof Manager) {
			if(Storage.managers.contains(u)) System.out.println("Student already exists.");
			else {
				Storage.managers.add((Manager) u);
				return;
			}
		}
		
		if(u instanceof Admin) {
			if(Storage.admins.contains(u)) System.out.println("Student already exists.");
			else {
				Storage.admins.add((Admin) u);
				return;
			}
		}
	}
	
	public String generateUserName(User u) { 
		if(u instanceof Teacher) { 
			return "TE" + Storage.teachers.size(); 
		} 
		if(u instanceof Student) { 
			return "ST" + Storage.students.size(); 
		} 
		if(u instanceof Executor) { 
			return "EX" + Storage.executors.size(); 
		} 
		if(u instanceof Manager) { 
			return "MN" + Storage.managers.size(); 
		} 
		return "AD" + Storage.admins.size(); 
	}
	
	public void addCourse(Course c) {
		if(Storage.cources.contains(c)) System.out.println("Course already exists.");
		else Storage.cources.addElement(c);
	}
	
	public void deleteCourse(Course c) {
		Storage.cources.remove(c);
	}
	
	@Override
	public void makeOrder(Order o) {
		if (orders.contains(o)) System.out.println("Order already exists.");
		else {
			orders.add(o);
			System.out.println("Order was sent.");
		}
	}
	
	public boolean equals(Object obj) { 
		Admin user = (Admin) obj;
	    return user.getUsername().equals(this.username) && user.getPassword() == this.password;
	}
}


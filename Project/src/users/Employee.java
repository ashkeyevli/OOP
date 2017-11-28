package users;

import java.io.Serializable;
import java.util.Vector;

import posted.Order;

public abstract class Employee extends User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String email;
	protected double salary;
	protected static Vector<Order> orders;

	public double getSalary() {
	    return salary;
	}
	
	public String getEmail() {
	    return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {		 
		return String.format("%s\nSalary: %s. Email: %s.", super.toString(), salary, email);
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return super.equals(obj) && employee.getSalary() == salary && employee.getEmail().equals(email);
	}
	
	public int compareTo(User u) {
	    if(super.compareTo(u) == 0) {
	    	Employee employee = (Employee) u;
	    	if(employee.getSalary() > salary) return -1;
	    	if(employee.getSalary() < salary) return 1;
	    	return 0;
	    }
	    return super.compareTo(u);
	}
}


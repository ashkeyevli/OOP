package second;

import java.io.Serializable;

class Instructor implements Serializable, Cloneable {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	
	public Instructor(String firstName, String lastName, String department, String email) {
		this.setEmail(email);
		this.setDepartment(department);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("My name is %s %s. I'm from %s department. My email: %s", firstName, lastName, department, email);
	}
	
	@Override
	public boolean equals(Object obj) {
		Instructor i = (Instructor) obj;
		return i.getFirstName().equals(firstName) && i.getLastName().equals(lastName) && i.getDepartment().equals(department) && i.getEmail().equals(email);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

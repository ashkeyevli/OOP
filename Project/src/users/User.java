package users;

import java.io.Serializable;

public abstract class User implements Comparable<User>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3233399307920639837L;
	protected String username;
	protected int password;
	private String name;
	private String lastName;
	
	public User() {}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
	    return username;
	}
	
	public int getPassword() {
	    return password;
	}

	public String getName() {
	    return name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
	    return lastName;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean equals(Object obj) { 
		User user = (User) obj;
	    return user.getUsername().equals(this.username) && user.getPassword() == this.password;
	}

	public int hashcode() {
	    return super.hashCode();
	}
	
	public String toString() {
	    return String.format("Name: %s. Lastname: %s. Username: %s.", name, lastName, username);
	}

	public int compareTo(User u) {
	    return u.getName().compareTo(this.name);
	}
}


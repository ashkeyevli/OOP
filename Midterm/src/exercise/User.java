package exercise;

import java.util.Objects;

class User implements Comparable<Object>{
	protected String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof User)) return false;
		
		return this.name.equals(((User)o).getName());
	}
	
	public String toString() {
		return String.format("My name is %s.", name);
	}

	@Override
	public int compareTo(Object o) {
		User user = (User) o;
		return name.compareTo(user.getName());
	}
	
	public int hashcode() {	
		return Objects.hash(Objects.hash(name));
	}
}

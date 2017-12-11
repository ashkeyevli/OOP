package problem.three;

import java.util.Objects;

class Person implements Cloneable {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("My name is %s.", name);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean equals(Person p) {
		return name.equals(p.name);
	}
	
	public int hashcode() {
		int result = Objects.hash(Objects.hash(name));
		return result;
	}
	
	public Person clone() {
		try {
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package problem.three;

class Person {
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
}

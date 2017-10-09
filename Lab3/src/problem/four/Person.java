package problem.four;

abstract class Person {
	protected String name;
	public Person(String name) {
		this.name = name;
	}
	
	public abstract String getName();
	
	public static String printInformation(Person p) {
		return p.getName();
	}
}

package problem.four;

public class Employee extends Person{

	public Employee(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Employee's name is " + name;
	}
	
}

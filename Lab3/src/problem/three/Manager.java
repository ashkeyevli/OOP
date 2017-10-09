package problem.three;

import java.util.Vector;

class Manager extends Employee{
	private Vector<Employee> employees = new Vector<Employee>();
	
	public Manager(String name, double salary, int year, String insuranceNumber) {
		super(name, salary, year, insuranceNumber);
	};
	
	public String toString() {
		String info = "";
		for(Employee employee : employees) {
			info += employee.toString() + "\n";
		}
		return String.format("%s My employees: \n %s",super.toString(), info);
	}
	
	public boolean equals(Manager m) {
		return super.equals(m) && employees.equals(m.employees);
	}	
	
	public void addEmployee(Employee e) {
		employees.addElement(e);
		super.setSalary(10);
	}
}

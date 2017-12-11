package problem.three;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

class Manager extends Employee implements Cloneable{
	protected int bonus;
	private Vector<Employee> employees = new Vector<Employee>();
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
	};
	
	public String toString() {
		return String.format("%s My employees: \n %s",super.toString(), employees.toString());
	}
	
	public boolean equals(Manager m) {
		return super.equals(m) && employees.equals(m.employees);
	}	
	
	public int hashcode() {
		int result = Objects.hash(Objects.hash(bonus)) + super.hashcode();
		return result;
	}
	
	public void addEmployee(Employee e) {
		employees.addElement(e);
		super.setSalary(10);
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
		salary += bonus;
	}
	
	public int compareTo(Employee o) {
		if(super.compareTo(o) == 0) {
			Manager manager = (Manager) o;
			if(manager.bonus < bonus) return 1;
			if(manager.bonus > bonus) return -1;
			return 0;		
		}
		return super.compareTo(o);
	}
	
	public Manager clone() {
		return (Manager) super.clone();
	}
}

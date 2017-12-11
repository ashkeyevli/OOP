package problem.three;

import java.util.Date;
import java.util.Objects;

class Employee extends Person implements Comparable<Employee>, Cloneable{
	protected double salary;
	protected Date hireDate;
	protected String insuranceNumber;

	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
		this.hireDate = hireDate;
		
	}
	
	public Date getYear() {
		return hireDate;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
		
	public String toString() {
		return String.format("%s I earn %f dollars. My insurance number: %s.", super.toString(), salary, insuranceNumber);
	}
	
	public boolean equals(Employee e) {
		return super.equals(e) && salary == e.salary && hireDate.equals(e.hireDate) && insuranceNumber.equals(e.insuranceNumber);
	}
	
	public int hashcode() {
		int result = Objects.hash(Objects.hash(salary)) + super.hashcode();
		return result;
	}

	@Override
	public int compareTo(Employee o) {
		if(o.getSalary() < salary) return 1;
		if(o.getSalary() > salary) return -1;
		return 0;		
	}
	
	public Employee clone() {
		Employee cloned = (Employee) super.clone();
		cloned.hireDate = (Date) hireDate.clone();
		return cloned;
	}
}

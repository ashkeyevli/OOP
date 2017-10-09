package problem.three;

class Employee extends Person{
	protected double salary;
	protected int year;
	protected String insuranceNumber;

	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setSalary(int bonus) {
		salary = ((100 + bonus) * salary)/100;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
		
	public String toString() {
		return String.format("%s I earn %f dollars. I got work in %d. My insurance number: %s.", super.toString(), salary, year, insuranceNumber);
	}
	
	public boolean equals(Employee e) {
		return super.equals(e) && salary == e.salary && year == e.year && insuranceNumber.equals(e.insuranceNumber);
	}
}

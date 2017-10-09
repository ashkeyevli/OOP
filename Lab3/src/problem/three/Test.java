package problem.three;

class Test {

	public static void main(String[] args) {
		Manager adam = new Manager("Adam", 7000, 2010, "16jskl");
		Employee john = new Employee("John", 4000, 2017, "45jflsa");
		System.out.println(adam.equals(john));
		System.out.println(adam.getSalary());
		adam.addEmployee(john);
		System.out.println(adam.getSalary());
		System.out.println(adam.toString());
	}

}

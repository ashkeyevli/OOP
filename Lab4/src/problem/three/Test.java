package problem.three;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

class Test {

	public static void main(String[] args) {
		Manager adam = new Manager("Adam", 7000, new Date(), "16jskl");
		Manager john = new Manager("John", 4000, new Date(), "45jflsa");
		Manager james = new Manager("James", 4000, new Date(), "67fsjl");
		james.setBonus(500);
		Vector<Manager> managers = new Vector<>();
		managers.add(adam);
		managers.add(john);
		managers.add(james);
		Collections.sort(managers);
		System.out.println(managers.toString());
		
		Manager johnson = james.clone();
		johnson.setSalary(9000);
		System.out.println(johnson.toString());
	}

}

package exercise;

import java.util.Collections;
import java.util.Vector;

class Test {

	public static void main(String[] args) {
		User user = new User("Aig");
		User user2 = new Student("Aid", 3.9);
		User user3 = new Student("Aid", 3.9);
		User teacher = new Teacher("John", 20000);
		User teacher2 = new Teacher("John", 20000);
		
		((Teacher)teacher).addStudent((Student) user2);
		((Teacher)teacher2).addStudent((Student) user2);
		System.out.println(teacher.equals(teacher2));
		
		Vector<User> users = new Vector<>();
		users.add(user);
		users.add(user2);
		users.add(user3);
		Collections.sort(users);
		System.out.println(users.toString());
		
	}

}

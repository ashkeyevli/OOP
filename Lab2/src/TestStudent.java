import java.util.Scanner;

class TestStudent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String id = in.next();
		in.close();
		Student student = new Student(name, id);
		System.out.println(student.getName());
		System.out.println(student.getId());
		student.incrementYear();
	}
	
}

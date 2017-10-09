package problem.four;

class Test {

	public static void main(String[] args) {
		Student student = new Student("Aiganym");
		Employee employee = new Employee("Aiganymka");
		System.out.println(Person.printInformation(student));
		System.out.println(Person.printInformation(employee));
		
		Person person = new Student("Bobik");
		System.out.println(person.getName());	
		if(person instanceof Student) {
			Student student2 = (Student) person;
			System.out.println(student2.getYearOfStudy());
		}
		
		person = employee;
		System.out.println(person.getName());
		Employee employee2 = (Employee) person;
		System.out.println(employee2.getName());
	}

}

class DragonLaunch {	
	static void kidnap(Student p) {
		Student.students.add(p);
	}

	static boolean willDragonEatOrNot() {
		return !Student.students.isEmpty();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Student aiganym = new Student("Aiganym", 65);
		Student john = new Student("John", 70);
		Student anna = new Student("Anna", 56);
		
		DragonLaunch.kidnap(aiganym);
		DragonLaunch.kidnap(john);	
		DragonLaunch.kidnap(anna);
		
		aiganym.setName("aiganym");
		john.setName("john");
		anna.setName("anna");	
		
		for (int i = 0; i < 3; i++) {
			Student.students.get(i).start();
		}
		
		for (int i = 0; i < Student.students.size(); i++) {
			Student.students.get(i).join();			
		}		
		
		System.out.println(willDragonEatOrNot());
		
	}

}

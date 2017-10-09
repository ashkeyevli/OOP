package problem.one;

class Test {

	public static void main(String[] args) {
		Cat kitten = new Cat();
		
		System.out.println(kitten.run(2, 10));
		System.out.println(kitten.run(3, 9, 4));
		
		
		
		System.out.println(kitten.hungry());
		System.out.println(kitten.hungry("milk"));
	}

}

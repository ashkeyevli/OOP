package problem.two;

class TestVector {

	public static void main(String[] args) {
		MyVector vector = new MyVector();
		for(int i = 0; i < 10; i++)
			vector.add(i);
		vector.add(2);
		vector.add(4, 67);
		vector.sort();
		System.out.println(vector.toString());
//		vector.reverse();
		vector.remove(2);
		vector.add(45);
		System.out.println(vector.toString());
	}

}

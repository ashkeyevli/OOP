package problem.first;

class Test {

	public static void main(String[] args) {
		Temperature temperature = new Temperature(40, 'C');
		System.out.println(temperature.degreesF());
		temperature.setScale('F');
		System.out.println(temperature.getScale());
		System.out.println(temperature.degreesC());
	}

}

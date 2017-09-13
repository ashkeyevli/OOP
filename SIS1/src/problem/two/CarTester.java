package problem.two;

class CarTester {

	public static void main(String[] args) {
		Car myCar = new Car(40);
		myCar.addGas(20);
		System.out.println(myCar.getGasInTank());
		myCar.drive(230);
		System.out.println(myCar.getGasInTank());
	}

}

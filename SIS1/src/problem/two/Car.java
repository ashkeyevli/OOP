package problem.two;

class Car {
	private double efficiency;
	private double fuel = 0;
	
	public Car(double efficiency) {
		this.efficiency = efficiency;
	}
	
	public void drive(double distance) {
		fuel -= distance/efficiency;
	}
	
	public double getGasInTank() {
		return fuel;
	}
	
	public void addGas(double gas) {
		fuel += gas;
	}
}

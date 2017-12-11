package problem.two;

class Car implements Refillable{
	private double petrol;

	@Override
	public void fillTank(double petrol) {
		this.petrol += petrol;		
	}

}

package problem.two;

class Lighter implements Refillable{
	private double gas;

	@Override
	public void fillTank(double petrol) {
		gas += petrol;		
	}

}

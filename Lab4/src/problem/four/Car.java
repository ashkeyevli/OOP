package problem.four;

public class Car implements Drivable{
	private double petrol = 1000;
	private int x;

	@Override
	public void move(double distance) {
		x += distance;
		drive(distance);		
	}

	@Override
	public void drive(double distance) {
		petrol -= distance/1000 * 10;		
	}

}

package problem.four;

class Penguin implements Movable{
	private int x;

	@Override
	public void move(double distance) {
		x += distance;		
	}	
	
}

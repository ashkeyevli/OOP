package problem.one;

public class Cube implements Shape{
	private int edge;
	
	public Cube(int edge) {
		this.edge = edge;
	}	

	@Override
	public double volume() {
		return Math.pow(edge, 3);
	}

	@Override
	public double surfaceArea() {
		return Math.pow(edge, 2) * 6;
	}

}

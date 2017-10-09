package problem.two;

class Cube extends Shape {
	private int edge = 1;
	
	public Cube() { }
	
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

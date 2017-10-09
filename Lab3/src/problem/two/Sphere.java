package problem.two;

class Sphere extends Shape {
	private int radius = 1;
	
	public Sphere() { }
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double volume() {
		return 4/3 * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}

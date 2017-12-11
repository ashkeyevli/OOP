package problem.one;

class Sphere implements Shape{
	private int radius; 
	
	public Sphere(int radius) {
		this.radius = radius;
	}

	@Override
	public double volume() {
		return 4 * Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public double surfaceArea() {
		return 4/3 * Math.PI * Math.pow(radius, 3);
	}

}

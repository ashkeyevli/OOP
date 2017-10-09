package problem.two;

class Cylinder extends Shape{
	private int radius = 1; 
	private int height = 1;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public Cylinder() {}
	

	@Override
	public double volume() {
		return Math.pow(radius, 2) * height * Math.PI;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}

}

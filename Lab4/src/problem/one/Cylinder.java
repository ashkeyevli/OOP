package problem.one;

class Cylinder implements Shape{
	private int radius; 
	private int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double volume() {
		return 2 * Math.PI * (Math.pow(radius, 2) + radius * height); 
	}

	@Override
	public double surfaceArea() {
		return height * Math.PI * Math.pow(radius, 2);
	}

}

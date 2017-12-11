package problem.one;

class Point implements Shape{
	private int x, y, z;
	
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double surfaceArea() {
		return 0;
	}
}

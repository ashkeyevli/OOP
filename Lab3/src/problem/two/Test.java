package problem.two;

class Test {

	public static void main(String[] args) {
		Cube cube = new Cube(5);
		System.out.println(cube.surfaceArea());
		
		Cylinder cylinder = new Cylinder(8, 5);
		System.out.println(cylinder.volume());
		
		Sphere sphere = new Sphere(7);
		System.out.println(sphere.surfaceArea());
	}

}

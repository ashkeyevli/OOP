package problem.two;

class StarTriangle {
	private int width;
	private String result = "";
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= i; j++) {
				result += "[*]";
			}
			result += "\n";
		}
		return result;
	}
}

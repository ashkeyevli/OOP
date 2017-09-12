package problem.three;

class Data {
	private double maxValue = 0, sumOfValues = 0;
	private int numberOfValues = 0;
	
	public void addValue(double value) {
		numberOfValues++;
		sumOfValues += value;
		if (value >= maxValue) maxValue = value;
	}
	
	public double getAverage() {
		if (numberOfValues == 0) return 0;
		return sumOfValues/numberOfValues;
	}
	
	public double maxValue() {
		return maxValue;
	}
} 

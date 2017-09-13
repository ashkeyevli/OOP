package problem.first;

class Temperature {
	private double temperature = 0;
	private char scale = 'C';
	
	public Temperature() {}
	
	public Temperature(char scale) {
		this.scale = scale;	
	}
	
	public Temperature(double temperature) {
		this.temperature = temperature;		
	}
	
	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public double degreesC() {
		if(scale == 'F') return 5*(temperature - 32)/9;
		return temperature;
	}
	
	public double degreesF() {
		if(scale == 'C') return 9*(temperature/5) + 32;
		return temperature;		
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void setParams(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public char getScale() {
		return scale;
	}
}














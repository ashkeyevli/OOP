package problem.one;

class Cat extends Animal{
	public int run(int time, int speed, int acceleration) {
		return (int) ((Math.pow(speed, 2))/(2 * time * acceleration));		
	}
	
	public int run(int time, int speed) {
		return (super.run(time, speed))/2;
	}
	
	public String hungry(String food) {
		return String.format("%s thanks for %s", super.hungry(), food);
	}
	
	public String hungry() {
		return String.format("%s meow!", super.hungry());
	}
}

package problem.four;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		if (hour <= 24 && minute <= 60 && second <= 60 && hour >= 0 && minute >=0 && second >= 0) {		
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} 
	}
	
	public void add(Time time) {
		hour = (time.hour + hour) % 24;
		minute = (time.minute + minute) % 60;
		second = (time.second + second) % 60;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public String toStandart() {
		if (hour > 12) return String.format("%02d:%02d:%02d %s", hour - 12, minute, second, "PM");
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}		
}











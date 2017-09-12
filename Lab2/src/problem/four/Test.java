package problem.four;

class Test {

	public static void main(String[] args) {
		Time time  = new Time(23, 5, 6);
		System.out.println(time.toUniversal());
		System.out.println(time.toStandart());
		Time time2 = new Time(4, 24, 33);
		time.add(time2);
		System.out.println(time.toStandart());
	}

}

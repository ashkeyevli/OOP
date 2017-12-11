package eating;

class Test {

	public static void main(String[] args) {
		EatingThread m = new EatingThread(6);
		EatingThread m2 = new EatingThread(4);
		m.setName("Zhora");
		m2.setName("Elibay");
		m2.setPriority(Thread.MAX_PRIORITY);
		m.start();
		m2.start();
	}

}

class PotionThread extends Thread {
	static double potion = 1200;
	public Student s;
	
	public PotionThread(Student student) {
		s = student;
	}
	
	static synchronized void drink(){
		if(potion <= 0) {
			System.exit(0);
		}
		potion -= 100;
		
		System.out.println(Thread.currentThread().getName() + " drank " + potion);
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
				drink();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

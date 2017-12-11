package print;

class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PrintThread pt = new PrintThread("pt");
	    pt.setPriority(Thread.MIN_PRIORITY);//the same as thread.setPriority(1);
		pt.start();
		pt.join();
		PrintThreadR ptr= new PrintThreadR("ptr");
		Thread thread = new Thread(ptr);
		System.out.println(thread.getPriority()); // will be 5, because by default Thread.NORM_Priority is set, which is 5
		thread.setPriority(10); //the same as thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
	}

}

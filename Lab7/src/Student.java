import java.util.Vector;

public class Student extends Thread {
	public String name;
	int weight;
	double drank = 0;
	static double potion = 1700;
	
	public static Vector<Student> students = new Vector<Student>();
	
	public Student(String name, int w) {
		this.name = name;
		weight = w;
	}
	
	@Override
	public boolean equals(Object o) {
		return ((Student) o).name.equals(name) && ((Student) o).weight == weight;
	}

	@SuppressWarnings("deprecation")
	synchronized void drink() {
		if(potion <= 0) {
			System.out.println("no potion " + potion);
			this.stop();
		}
		else {
			potion -= 100;
			this.drank += 100;
			
			if(this.drank >= this.weight * 10) {
				System.out.println(name + " disappeared");
				students.remove(this);
				this.stop();
			}
			
			System.out.println(name + " drank " + drank + " potion left " + potion);
		}
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep(1000);
				drink();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

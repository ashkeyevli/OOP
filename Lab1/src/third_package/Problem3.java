package third_package;
import java.util.Scanner;

public class Problem3 {
	public int balance = 1000;
	public int interest;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int interest = in.nextInt();
		in.close();
		Problem3 problem3 = new Problem3();
		problem3.interest = interest;
		problem3.balance = ((100 + interest) * problem3.balance)/100;
		System.out.println(problem3.balance);
	}
	
}

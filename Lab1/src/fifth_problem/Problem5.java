package fifth_problem;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		System.out.println("Area: " + a * a);
		System.out.println("Perimeter: " + a * 4);
		System.out.println("Diagonal: " + Math.sqrt(2) * a);
	}

}

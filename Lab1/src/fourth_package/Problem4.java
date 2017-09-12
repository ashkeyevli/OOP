package fourth_package;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();	
		double d = b * b - 4 * a * c;
		if (d < 0) {
			System.out.println("error");
		} else if (d == 0) {
			System.out.println(-b/(2*a));
		} else {
			System.out.println((-b + Math.sqrt(d))/(2*a));
			System.out.println((-b - Math.sqrt(d))/(2*a));
		}
	}

}
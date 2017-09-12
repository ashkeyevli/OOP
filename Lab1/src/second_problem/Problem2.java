package second_problem;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double grade = in.nextDouble();
		in.close();	
		if(grade >= 95 && grade <= 100) 
			System.out.println("A+");
	 else if (grade >= 90 && grade < 95) {
			System.out.println("A-");
		} else if (grade < 90 && grade >= 85) {
			System.out.println("B+");
		} else if (grade < 85 && grade >= 80) {
			System.out.println("B");
		} else if (grade < 80 && grade >= 75) {
			System.out.println("B-");
		} else if (grade < 75 && grade >= 70) {
			System.out.println("C+");
		} else if (grade >= 65 && grade < 70) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 65) {
			System.out.println("C-");
		} else if (grade >= 55 && grade < 60) {
			System.out.println("D+");
		} else if (grade >= 50 && grade < 55) {
			System.out.println("D");
		} else if (grade >= 0 && grade < 50) {
			System.out.println("F");
		} else {
			System.out.println("incorrect grade");
		}	
	}
}

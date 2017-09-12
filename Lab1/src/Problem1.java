import java.util.Scanner;

public class Problem1 {
	public void border(String name) {
		System.out.print("+");
		for(int i = 0; i < name.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();	
		Problem1 problem1 = new Problem1();
		problem1.border(name);
		System.out.println("|" + name + "|");
		problem1.border(name);			
	}
}

package problem.three;

import java.util.Scanner;

class Analyzer {

	public static void main(String[] args) {
		Data data = new Data();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String qString = in.nextLine();
			if(qString.equals("Q")) {
				break;
			}
			double number = Double.parseDouble(qString);
			data.addValue(number);			
		}
		in.close();
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.maxValue());
	}

}

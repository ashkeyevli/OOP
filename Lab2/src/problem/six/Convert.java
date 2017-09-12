package problem.six;

public class Convert {

	private static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	private static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static String convertNumber(int n) {
		if (n < 20) {
			return units[n];
		}

		else if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		else if (n < 1000) {
			return units[n / 100] + " hundred and" + ((n % 100 != 0) ? " " : "") + convertNumber(n % 100);
		}

		return convertNumber(n / 1000) + " thousand" + ((n % 10000 != 0) ? " " : "") + convertNumber(n % 1000);
	}

	public static void main(final String[] args) {
		int n = 135;
		System.out.println(convertNumber(n));
	}
}
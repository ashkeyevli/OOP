package problem.five;

import problem.five.MinMax.Value;

class Test {

	public static void main(String[] args) {
		int[] arr = {0, 8, -3, 20};
		Value values = MinMax.minmax(arr);
		System.out.println(values.maxValue);
		System.out.println(values.minValue);
	}

}

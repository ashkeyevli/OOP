package problem.five;

class Test {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3};
		int[] newArr = CloneArray.doubleArray(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
}

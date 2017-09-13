package problem.five;

class CloneArray {
	public static int[] doubleArray(int[] arr) {
		int [] newArr = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i * 2] = arr[i];
			newArr[i * 2 + 1] = arr[i];
		}
		return newArr;
	}
}

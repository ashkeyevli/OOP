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
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3};
		int[] newArr = doubleArray(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
}

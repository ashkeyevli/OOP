package problem.two;

class MergeSort {
	public static void mergeSort(int start, int end, int[] arr) {
		if (start >= end) return;
		
		int mid = (start + end)/2;
		mergeSort(start, mid, arr);
		mergeSort(mid + 1, end, arr);
		merge(start, mid, end, arr);
	}
	
	private static void merge(int start, int mid, int end, int[] arr) {
		int n = end - start + 1;
		int left = start;
		int right = mid + 1;
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			if(left > mid) {
				temp[i] = arr[right];
				right++;
			}
			else if(right > end) {
				temp[i] = arr[left];
				left++;
			}
			else if(arr[left] >= arr[right]) {
				temp[i] = arr[right];
				right++;
			} else {
				temp[i] = arr[left];
				left++;
			}
		}
		for(int i = 0; i < n; i++) {
			arr[i + start] = temp[i];
		}
	}
}

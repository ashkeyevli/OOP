package problem.five;

class MinMax {
	static class Value {
		int minValue;
		int maxValue;
		public Value(int minValue, int maxValue) {
			this.maxValue = maxValue;
			this.minValue = minValue;
		}
	}
	
	static Value minmax(int[] arr) {
		int minValue = arr[0];
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < minValue)
				minValue = arr[i];
			if(arr[i] > maxValue)
				maxValue = arr[i];
		}		
		return new Value(minValue, maxValue);	
	}

}

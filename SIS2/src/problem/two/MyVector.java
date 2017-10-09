package problem.two;

class MyVector implements MyCollection{
	private int initialSize = 10000;
	private int[] arr;
	private int size = 0;
	
	public MyVector() {
		arr = new int[initialSize];
	}

	@Override
	public void add(int element) {
		add(size, element);
	}
	
	private void increaseArray() {
		initialSize *= 2;
		int[] temp = new int[initialSize];
		for(int i = 0; i < initialSize/2; i++)
			temp[i] = arr[i];
		arr = temp;
	}

	@Override
	public void add(int index, int element) {
		if (index < 0 || index > size) return;
		if(size == initialSize) increaseArray(); 
		
		for(int i = size - 1; i >= index; i--)
			arr[i + 1] = arr[i];
		arr[index] = element;
		size++;
	}

	@Override
	public void clear() {
		arr = null;	
		size = 0;
	}

	@Override
	public boolean contains(int element) {
		return indexOf(element) != 1;
	}

	@Override
	public int get(int index) {
		if (index < 0 || index >= size) return -1;
		
		return arr[index];
	}

	@Override
	public int indexOf(int element) {
		for(int i = 0; i < size; i++) 
			if(arr[i] == element)
				return i;
		return -1;
	}

	@Override
	public void insertElementAt(int element, int index) {
		add(index, element);		
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void removeAt(int index) {
		if (index < 0 || index >= size) return;
		
		for(int i = index; i < size; i++)
			arr[i] = arr[i + 1];
		size--;
	}

	@Override
	public void remove(int element) {
		int index = indexOf(element);
		if(index != -1)
			removeAt(index);
	}

	@Override
	public void removeAll(int element) {
		for(int i = 0; i < size; i++) {
			if (arr[i] == element) {
				removeAt(i);
				i--;
			}
		}		
	}

	@Override
	public void reverse() {
		int temp;
		int cur = size - 1;
		for(int i = 0; i < size/2; i++) {
			temp = arr[i];
			arr[i] = arr[cur];
			arr[cur] = temp;
			cur--;
		}
	}

	@Override
	public void set(int index, int element) {
		if (index < 0 || index >= size) return;
		
		arr[index] = element;		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void sort() {
		MergeSort.mergeSort(0, size - 1, arr);
	}

	@Override
	public int[] toArray() {
		int[] temp = new int[size];
		for (int i = 0; i < size; i++)
			temp[i] = arr[i];
		return temp;
	}
	
	public String toString() {
		String string = "";
		for (int i = 0; i < size; i++)
			string += arr[i] + " ";
		return string;
	}
	
}

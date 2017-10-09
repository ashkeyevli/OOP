package problem.two;

interface MyCollection {
	void add(int element);
	void add(int index, int element);
	void clear();
	boolean contains(int element);
	int get(int index);
	int indexOf(int element);
	void insertElementAt(int element, int index);
	boolean isEmpty();
	void removeAt(int index);
	void remove(int element);
	void removeAll(int element);
	void reverse();
	void set(int index, int element);
	int size();
	void sort();
	int[] toArray();
	String toString();
}

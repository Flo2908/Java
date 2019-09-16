package Uebungen;

public class MyArrayList<T> {

	private static final int extendenSize = 50;
	private T[] myArrayList;
	private int nextFreeIndex = 0;

	public MyArrayList(T t) {
		this.myArrayList = (T[]) new Object[extendenSize];
	}

	public int size() {
		return this.myArrayList.length;
	}

	public boolean add(T t) {
		if (t == null) {
			throw new IllegalArgumentException("Object t darf nicht null sein von add");
		}
		if (size() == nextFreeIndex) {
			extendetArray();
		}
		myArrayList[nextFreeIndex++] = t;
		return false;
	}

	public void extendetArray() {
		T[] array = (T[]) new Object[myArrayList.length + extendenSize];
		System.arraycopy(myArrayList, 0, array, 0, size());
		myArrayList = array;
	}

	public boolean remove(T t) {
		if (t == null)
			throw new NullPointerException("Object ist null von remove");
		for (int i = 0; i < size(); i++) {
			if (myArrayList[i].equals(t)) {
				shiftElements(i);
				nextFreeIndex--;
				return true;
			}
		}
		return false;
	}

	public T remove(int i) {
		if (i < 0 || i >= size())
			throw new IllegalArgumentException("Auserhald der grösse von remove");
		T removed = myArrayList[i];
		shiftElements(i);
		nextFreeIndex--;
		return removed;
	}

	private void shiftElements(int i) {
		for (; i < size() - 1; i++) {
			myArrayList[i] = myArrayList[i + 1];
		}
	}

	public T get(int i) {
		if (i < 0 || i >= size())
			throw new IllegalArgumentException("Auserhald der grösse von get");
		return myArrayList[i];
	}

	public void clear() {
		shiftElements(0);
		nextFreeIndex = 0;
	}

	public boolean isEmpty() {
		if (nextFreeIndex == 0 && myArrayList[nextFreeIndex] == null)
			return true;
		return false;
	}

	public T getMyArrayList() {
		return (T) myArrayList;
	}

	public void setMyArrayList(T myArrayList) {
		this.myArrayList = (T[]) myArrayList;
	}

	public boolean contains(T t) {
		for (int i = 0; i < size(); i++) {
			if (myArrayList[i] == null) {
				break;
			} else if (myArrayList[i].equals(t))
				return true;
		}

		return false;
	}

}

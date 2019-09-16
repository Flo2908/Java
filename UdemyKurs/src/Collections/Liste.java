package Collections;

public class Liste <T> {

	private T[] array;
	private int nextFreeSlot = 0;
	
	public Liste (int capacity) {
		array = (T[])new Object[capacity];
	}
	public void add(T o) {
		if(nextFreeSlot == array.length) {
			throw new IllegalStateException("Liste ist voll");
		}
		array[nextFreeSlot] = o;
		nextFreeSlot++;
	}
	public T get(int index) {
		if(index > this.getCapacity() || index < 0) {
			throw new ArrayIndexOutOfBoundsException("auserhalb des Array bereiches");
		}
		return array[index];
	}
	public int getCapacity() {
		// TODO Auto-generated method stub
		return array.length;
	}
	public int getElementCount() {
		return nextFreeSlot;
	}
	
}

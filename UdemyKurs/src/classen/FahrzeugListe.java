package classen;

import java.util.Iterator;

import Interfaces.Verkaeuflich;

public class FahrzeugListe<T extends Verkaeuflich>  {

	private Object[] array;
	private int nextFreeSlot = 0;
	

	public FahrzeugListe(int capacity) {
		array = new Object[capacity];

	}

	public void add(T o) {
		if (nextFreeSlot == array.length) {
			throw new IllegalStateException("Liste ist voll");
		}
		array[nextFreeSlot] = o;
		nextFreeSlot++;
	}

	public T get(int index) {
		if (index > this.getCapacity() || index < 0) {
			throw new ArrayIndexOutOfBoundsException("auserhalb des Array bereiches");
		}
		return (T) array[index];
	}

	public int getCapacity() {

		return array.length;
	}

	public int getElementCount() {
		return nextFreeSlot;
	}
//	public int berechenSumme() {
//		int summe = 0;
//		array = (T)array;
//		for(T t : (T)array) {
//			summe += t.getPreis();
//		}
//		return summe;
//	}


//	@Override
//	public T next() {
//		// TODO Auto-generated method stub
//		T data = current.get();
//		current = current.getNext();
//		return data;
//	}

}

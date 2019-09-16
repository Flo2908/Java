package EqualsHashClone;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashPerformanceDemo {

	public static void main(String[] args) {

		HashTestElements[] elements = new HashTestElements[100000];
		Random rnd = new Random();
		for (int i = 0; i < elements.length; i++) {
			int x = rnd.nextInt();
			int y = rnd.nextInt();
			int z = -(x + y);

			if (x + y + z != 0) {
				throw new IllegalStateException();
			}
			elements[i] = new HashTestElements(x, y, z);
		}

		Set<HashTestElements> set = new HashSet<HashTestElements>();

		long start = System.currentTimeMillis();
		for (HashTestElements e : elements) {
			set.add(e);
		}

		for (HashTestElements e : elements) {
			set.contains(e);
		}

		for(HashTestElements e : elements) {
			set.remove(e);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Benötigte Zeit : " + (end -start) / 1000.0 + " Sekunden");
	}
}

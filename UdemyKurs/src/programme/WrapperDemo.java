package programme;

import java.math.BigDecimal;

import Collections.Liste;

public class WrapperDemo {

	public static void main(String[] args) {

		// Integer, Charecter, Byte, Short, Long, Float, Double, Boolean

		Integer integer = new Integer("100");
		int i = integer.intValue();

		Liste<Integer> liste = new Liste<Integer>(100);
		liste.add(26);
		i = liste.get(0);

		Double d1 = new Double(2.3);
		Double d2 = new Double(2.4);
		Double d3 = d1 + d2;
		System.out.println(d3);

		Integer i3 = 50;
		Integer i4 = 50;
		System.out.println(i3 == i4);

		Integer i1 = new Integer(50);
		Integer i2 = new Integer(50);
		System.out.println(i1 == i2);

		Integer i5 = new Integer(200);
		Integer i6 = new Integer(200);
		System.out.println(i5 == i6);

		// BigInteger , BigDecimal

		for (double d = 0; d < 1.0; d += 0.1) {
			System.out.println(d);
		}
		
	}
}

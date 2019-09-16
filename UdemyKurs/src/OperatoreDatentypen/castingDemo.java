package OperatoreDatentypen;

public class castingDemo {
	public static void main(String[] args) {

		// Implizierter Cast
		long l = 50; // cast in int
		double d = 2; // cast in int

		// Explizieter Cast
		byte b = 12;
		int i = 1000;
		byte x = (byte) i;
		System.out.println(x);

		double d1 = 2.45;
		int i1 = (int) d1;
		System.out.println(i1);

		// Casting von Komplexen Datentypen

		// implizit -- upcast
		String s = "....";
		Object o = s;

		// explizit -- downcast
		s = (String) o;
		
		if(o instanceof String) {
			System.out.println("Geht");
		}
		;
	}
}

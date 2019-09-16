package OperatoreDatentypen;

import java.awt.Color;

import classen.Auto;

public class datentypenDemo {

	public static void main(String[] args) {

		// primitive Datentypen
		int i = 25;
		System.out.println(Integer.MAX_VALUE);
		
		long l = 5000000000000000L;
		System.out.println(Long.MIN_VALUE);
		short s = 16;
		System.out.println(Short.MAX_VALUE);
		byte b = 20;

		double d = 2.3;
		float f = 2.F;

		char c = 'A';
		char c1 = 65;

		boolean bool = true; // false
		
		// komplexe Datentypen
		Auto a = new Auto("Audi");
		String str = "Hallo";
		Color color = new Color(255,0,0);
		
	}
}

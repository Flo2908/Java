package EqualsHashClone;

import classen.Fahrzeug;
import classen.PKW;

public class EqualsDemo {

	public static void main(String[] args) {
		
		Fahrzeug p2 = new PKW("BMW", 120, 3,3);
		Fahrzeug p1 = new PKW("BMW", 120,2,2);

		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}

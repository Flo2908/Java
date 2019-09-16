package OperatoreDatentypen;

import classen.Fahrzeug;
import classen.PKW;

public class toStringDemo {

	public static void main(String[] args) {
		Fahrzeug f = new PKW("....");
		System.out.println(f.toString());
		System.out.println(f);
	}
}

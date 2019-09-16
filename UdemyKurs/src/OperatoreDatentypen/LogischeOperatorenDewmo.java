package OperatoreDatentypen;

import classen.Auto;

public class LogischeOperatorenDewmo {
	public static void main(String[] args) {

		// ! (Nicht) ---> boolsche nagation
		boolean b = true;
		System.out.println(!b);

		// & (Und)
		boolean b2 = false;
		System.out.println(b & b2);

		// | (oder)
		System.out.println(b | b2);

		// ^ (exklusives oder)
		System.out.println(b ^ b2);

		Auto bmw = new Auto("BMW", 200);
		Auto audi = new Auto("Audi", 120);

		if (Auto.erstellteAutos == 2 &
				(audi.getLeistung() <= 100 |
				audi.getLeistung() < bmw.getLeistung())) {

			System.out.println(audi.getLeistung());
			audi.tunen();
			System.out.println(audi.getLeistung() + " Vom logischen Operator");
		}
		
		// && <--- und ---> || 	Short Circut Evaluation
	}
}

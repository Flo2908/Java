package programme;

import classen.Fahrzeug;
import classen.PKW;

public class FahrzeugDemo {

	public static void main(String[] args) {

		Fahrzeug f = new PKW("Audi", 100, 4712398, 3);
		PKW p = new PKW("Bmw", 100, 2139743, 5);
		
			f.tunen(-80);
			
		
		//p.tunen(54);
		
		System.out.println(f.getLeistung());
		System.out.println(p.getLeistung());

		System.out.println(PKW.SUPER_LEISTUNG);
	}
}

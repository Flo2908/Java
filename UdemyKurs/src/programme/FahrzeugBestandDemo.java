package programme;

import classen.Fahrzeugbestand;
import classen.LKW;
import classen.Motorrad;
import classen.PKW;

public class FahrzeugBestandDemo {
	
	public static void main(String[] args) {

		PKW pkw1 = new PKW("BMW", 100, 132897,2);
		pkw1.setPreis(14900);
		PKW pkw2 = new PKW("Ferrari", 320,233847,2);
		pkw2.setPreis(12450);
		PKW pkw3 = new PKW("Golf", 120,23987,5);
		pkw3.setPreis(12369);
		
		LKW lkw1 = new LKW("MAN", 310, 432098);
		lkw1.setPreis(13570);
		LKW lkw2 = new LKW("Mercedes" , 439, 432198);
		lkw2.setPreis(19825);
		
		Motorrad m1 = new Motorrad("Ducatti", 290, 1243289);
		m1.setPreis(14569);
		Motorrad m2 = new Motorrad("Suzuki", 423, 214324);
		m2.setPreis(25789);
		
		Fahrzeugbestand.hinzufuegen(pkw1);
		Fahrzeugbestand.hinzufuegen(pkw2);
		Fahrzeugbestand.hinzufuegen(pkw3);
		Fahrzeugbestand.hinzufuegen(lkw1);
		Fahrzeugbestand.hinzufuegen(lkw2);
		Fahrzeugbestand.hinzufuegen(m1);
		Fahrzeugbestand.hinzufuegen(m2);
	
		System.out.println("Gesamt Bestand der Fahrtzeuge = " +  Fahrzeugbestand.getAnzahlFahrzeuge()+
				" ergibt Gesamteinnahmen von : " + Fahrzeugbestand.berechneGesamtEinnahmen());
		
		System.out.println("Anzahl der Pkw's sind : " + Fahrzeugbestand.getAnzahlPkws());
		
	}
}

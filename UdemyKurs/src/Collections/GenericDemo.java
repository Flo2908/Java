package Collections;

import org.w3c.dom.ls.LSInput;

import Interfaces.Verkaeuflich;
import classen.Dackel;
import classen.Fahrzeug;
import classen.FahrzeugListe;
import classen.LKW;
import classen.Motorrad;
import classen.PKW;

public class GenericDemo {

	public static void main(String[] args) {
		
		//_____________FahrzeugListe_______________
		
		Liste <Fahrzeug> fahrzeugListe = new Liste<Fahrzeug>(100);
		
		fahrzeugListe.add( new PKW ("BMW", 100, 132897,2 )) ;
		fahrzeugListe.add( new PKW("Ferrari", 320,233847,2)) ;
		fahrzeugListe.add(new PKW("Golf", 120,23987,5));
		fahrzeugListe.add(new LKW("MAN", 310, 432098));
		
		System.out.println("Fahrzeuge in der Liste : " + fahrzeugListe.getElementCount());
		
		Fahrzeug f = fahrzeugListe.get(1);
		System.out.println(f);
		
		
		
		
		// _____________StringListe_______________
		
		Liste <String> herstellerListe = new Liste<String>(100);
		
		herstellerListe.add("BMW");
		herstellerListe.add("Ferrari");
		herstellerListe.add("Opel");
		
		System.out.println("Hersteller in Liste : " +
		herstellerListe.getElementCount());
		
		String hersteller = herstellerListe.get(1);
		System.out.println(hersteller);
		
		// Mapping
		Map <String, String> map = new Map<String ,String>();
		
		Liste<String> liste = ArrayUtils.<String>makeListe(new String[] {"Hallo", "Test"});
		
		
		
		
		
		
		// Fahrzeug summe aus generischer Liste
		
		FahrzeugListe<Verkaeuflich> liste2 = new FahrzeugListe<Verkaeuflich>(100);
		
		
		liste2.add(new PKW("BMW", 2,2,2));
		liste2.add(new Dackel(200));
		Verkaeuflich t = liste2.get(0);
		System.out.println(t.getPreis());
		
//		int summe = 0;
//		for(Verkaeuflich v : liste2) {
//			summe += v.getPreis();
//			System.out.println(v.toString());
//		}
//		System.out.println(summe);
//	
	}
	
}

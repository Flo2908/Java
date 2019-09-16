package EqualsHashClone;

import classen.Motorrad;
import classen.Spielstand;

public class CloneDemo {

	static Spielstand aktuellerSpielstand;
	static Spielstand gesicherterSpielstand;
	
	public static void main(String[] args) {
		
		aktuellerSpielstand = new Spielstand();
		aktuellerSpielstand.punkte = 1000;
		aktuellerSpielstand.fahrzeug =  new Motorrad("Ducatti", 120,93247);
		
		// ... Spieler spielt ...
		sichereSpielstand();
		zeigeSpielstaende();
		
		aktuellerSpielstand.punkte = 1500;
		aktuellerSpielstand.fahrzeug.tunen(250);
		
		zeigeSpielstaende();
	}

	private static void sichereSpielstand() {
		// TODO Auto-generated method stub
		Spielstand clon = aktuellerSpielstand.clone();
		gesicherterSpielstand = clon;
		
	}
	
	static void ladeSpielstande() {
		aktuellerSpielstand = gesicherterSpielstand;
	}
	static void zeigeSpielstaende() {
		System.out.println("Aktuell: " + aktuellerSpielstand);
		System.out.println("Gesichert: " + gesicherterSpielstand);
	}
}

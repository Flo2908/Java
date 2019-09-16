package classen;

public class Fahrzeugbestand {

	private static Fahrzeug[] fahrzeuge = new Fahrzeug[100];
	private static int fCounter = 0;


	public static void hinzufuegen(Fahrzeug f) {
		if (fCounter < fahrzeuge.length) {
			fahrzeuge[fCounter++] = f;
		}
	}
	public static int getAnzahlPkws() {
		int anzahl = 0;
		for (Fahrzeug f: fahrzeuge) {
			if(f instanceof PKW) {
				anzahl++;
			}
		}
		return anzahl;
	}

	public static int getAnzahlFahrzeuge() {
		return fCounter;
	}
	
	public static int berechneGesamtEinnahmen() {
		int total = 0;
		for (Fahrzeug f : fahrzeuge) {
			if (f == null) {
				break;
			}
			total += f.getPreis();
		}
		return total;
	}
//	
//	private static PKW[] pkws = new PKW[100];
//	private static LKW[] lkws = new LKW[100];
//	private static Motorrad[] motoraeder = new Motorrad[100];
//
//	private static int pkwCounter = 0;
//	private static int lkwCounter = 0;
//	private static int motoradCounter = 0;
//	public static void hinzufuegen(PKW pkw) {
//		if (pkwCounter < pkws.length) {
//			pkws[pkwCounter++] = pkw;
//		}
//	}
//
//	public static void hinzufuegen(LKW lkw) {
//		if (lkwCounter < lkws.length) {
//			lkws[lkwCounter++] = lkw;
//		}
//	}
//
//	public static void hinzufuegen(Motorrad m) {
//		if (motoradCounter < motoraeder.length) {
//			motoraeder[motoradCounter++] = m;
//		}
//	}


//	public static int berechneGesamtEinnahmen() {
//		int total = 0;
//		for (LKW lkw : lkws) {
//			if(lkw == null) {
//				break;
//			}
//			total += lkw.getPreis();
//		}
//		for (PKW pkw : pkws) {
//			if(pkw == null) {
//				break;
//			}
//			total += pkw.getPreis();
//		}
//		for (Motorrad m : motoraeder) {
//			if(m == null) {
//				break;
//			}
//			total += m.getPreis();
//		}
//		return total;
//	}
}

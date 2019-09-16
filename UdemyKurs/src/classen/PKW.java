package classen;

import java.util.Iterator;

public class PKW extends Fahrzeug {

	private int anzahlTüren;

	public PKW(String derHersteller, int dieLeistung, int preis, int anzahlTüren) {
		super(derHersteller, dieLeistung, preis);
		setAnzahlTüren ( anzahlTüren);
	}

	public PKW(String hersteller) {
		super(hersteller);

	}

	public int getAnzahlTüren() {
		return anzahlTüren;
	}

	public void setAnzahlTüren(int anzahlTüren) {
		this.anzahlTüren = anzahlTüren;
	}
//	@Override
//	public void tunen() {
//		
//	}
	@Override
	public String toString() {
		return super.toString() + " Die Anzahl der Türen : " + anzahlTüren;
	}

	@Override
	public void chrashTest() {
		// TODO Auto-generated method stub
		
	}

}

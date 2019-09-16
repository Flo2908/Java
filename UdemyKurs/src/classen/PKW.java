package classen;

import java.util.Iterator;

public class PKW extends Fahrzeug {

	private int anzahlT�ren;

	public PKW(String derHersteller, int dieLeistung, int preis, int anzahlT�ren) {
		super(derHersteller, dieLeistung, preis);
		setAnzahlT�ren ( anzahlT�ren);
	}

	public PKW(String hersteller) {
		super(hersteller);

	}

	public int getAnzahlT�ren() {
		return anzahlT�ren;
	}

	public void setAnzahlT�ren(int anzahlT�ren) {
		this.anzahlT�ren = anzahlT�ren;
	}
//	@Override
//	public void tunen() {
//		
//	}
	@Override
	public String toString() {
		return super.toString() + " Die Anzahl der T�ren : " + anzahlT�ren;
	}

	@Override
	public void chrashTest() {
		// TODO Auto-generated method stub
		
	}

}

package classen;

import javax.management.RuntimeErrorException;

import Interfaces.Verkaeuflich;
import programme.TuneException;

public abstract class Fahrzeug implements Verkaeuflich, Cloneable {

	public static int erstellteFahrzeuge;
	public static final int SUPER_LEISTUNG = 350;

	private int leistung;
	private String hersteller;
	private int preis;

	public Fahrzeug(String derHersteller, int dieLeistung, int preis) {

		setLeistung(dieLeistung);
		setHersteller(derHersteller);
		setPreis(preis);
		erstellteFahrzeuge = erstellteFahrzeuge + 1;
		System.out.println("es wurde so eben das " + erstellteFahrzeuge + ". Fahrzeug erstellt");

	}

	public Fahrzeug(String hersteller) {
		this(hersteller, 100, 0);
	}

	public void tunen(int tuneWert) {
		if (tuneWert <= 0) {
			throw new TuneException("Der tune wert darf nicht negativ sein");
		}
		setLeistung(getLeistung() + tuneWert);

	}

	public void tunen() {

		tunen(SUPER_LEISTUNG);

	}

	public int getLeistung() {
		return leistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	private void setLeistung(int leistung) {

		if (leistung >= 0) {
			this.leistung = leistung;
		} else {
			System.out.println("Ungültiger Wert");
			System.exit(-1);
		}

	}

	private void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public static void printInfos(Auto auto) {
		System.out.println(
				auto.getHersteller() + " ist der Hersteller --- und er hat " + auto.getLeistung() + " PS Leistung");
	}

	public String toString() {
		return getHersteller() + " ist der Hersteller --- und er hat " + getLeistung() + " PS Leistung";
	}

	@Override
	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public abstract void chrashTest();

	@Override
	public Fahrzeug clone() {
		Fahrzeug f = null;
		try {
			f = (Fahrzeug) super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		}

		return f;

	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Fahrzeug)) {
			return false;
		}
		Fahrzeug t = (Fahrzeug) o;
		if (this.hersteller.equalsIgnoreCase(t.hersteller) && this.leistung == t.leistung) {

			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		if(this instanceof PKW) {
			PKW p = (PKW)this;
			return p.getLeistung() * 11 + p.getHersteller().hashCode() *11 +new Integer( p.getAnzahlTüren() * 11).hashCode();
		}if(this instanceof Motorrad) {
			Motorrad m = (Motorrad)this;
			return m.getLeistung() * 11 + m.getHersteller().hashCode() *11;
		}if(this instanceof LKW ) {
			LKW l = (LKW)this;
			return l.getLeistung() * 11 + l.getHersteller().hashCode() *11 ;
		}
		return 0;
		
	}

}

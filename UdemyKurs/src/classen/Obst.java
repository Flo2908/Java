package classen;

public class Obst {

	private String bezeichnung;
	private int einkaufspreis;
	private int verkaufspreis;
	private int naehrwert;

	public Obst(String dieBezeichnung, int derEinkaufspreis, int derNaehrwert) {
		setBezeichnung(dieBezeichnung);
		setEinkaufspreis(derEinkaufspreis);
		setVerkaufspreis(derEinkaufspreis + derEinkaufspreis);
		setNaehrwert(derNaehrwert);
	}

	public void aufpeppen(int neuerNaehrwert, int neuerVerkaufspreis) {
		setVerkaufspreis(getVerkaufspreis() + neuerVerkaufspreis);
		setNaehrwert(getNaehrwert() + neuerNaehrwert);
	}

	private void setNaehrwert(int derNaehrwert) {
		naehrwert = derNaehrwert;

	}

	private void setEinkaufspreis(int derEinkaufspreis) {
		einkaufspreis = derEinkaufspreis;

	}

	private void setBezeichnung(String dieBezeichnung) {
		bezeichnung = dieBezeichnung;

	}

	private void setVerkaufspreis(int neuerVerkaufspreis) {
		verkaufspreis = neuerVerkaufspreis;

	}

	public int getNaehrwert() {

		return this.naehrwert;
	}

	public int getVerkaufspreis() {

		return this.verkaufspreis;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public int getEinkaufspreis() {
		return einkaufspreis;
	}
}

package classen;

// Class Name in CapitalCamelCase
// Beispiel ->	AutoTeile
public class Auto {

	public static int erstellteAutos;
	public static final int SUPER_LEISTUNG = 350; // constante
	private final int megaLeistung;

	static {
		System.out.println("Auto inizialisiert");
		System.out.println(erstellteAutos);
	}

	// Instanz Variablen (Attribute , Meembers)
	// <Datentyp> <name> [<zuweisung>];
	// lowerCamelCase Beispiel -> dieLeistung
	// int leistung = 100; // 100 ist das Literal // PS
	private int leistung; // default Wert = 0
	private String hersteller; // default Wert = null
	// String hersteller = "BMW";

	// InizialisierungBlock (nicht statische )
	{
		setLeistung(50);
	}

	// Instanz Methoden
	// <RückgabeDatentyp> <name> (<Parameterliste>){ Rumpf (Logik)}
	public void tunen(int tuneWert) {
		setLeistung(getLeistung() + tuneWert);
		// leistung += tuneWert;
	}

	public void tunen() {
		tunen(SUPER_LEISTUNG); // Magic N8umber vermeiden
// leistung += tuneWert;
	}

	// Konstruktoren StandartMässig ist immer ein deafault Konstruktor da
	// <ClassenName> (<ParameterListe){ Rumpf (Logik) }
	public Auto(String derHersteller, int dieLeistung) {
		megaLeistung = dieLeistung;
		setLeistung(dieLeistung);
		setHersteller(derHersteller);
		erstellteAutos++;
		System.out.println("es wurde so eben das " + erstellteAutos + ". Auto erstellt");
		System.out.println(leistung + " <---> leistung ohne shadowing");
		int leistung = 500;
		System.out.println(leistung + "  <--->  Leistung shadowing");
		;
	}

	public Auto(String hersteller) {
		this(hersteller, 100);
	}

	// Getter -> get + Insatnzvariable = Name
	public int getLeistung() {
		return leistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	// Setter -> set + Instanzvariable = Name
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
}

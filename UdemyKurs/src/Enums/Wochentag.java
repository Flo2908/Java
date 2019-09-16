package Enums;

public enum Wochentag {

	MONTAG("Monday"), DIENSTAG, MITTWOCH("Wensday"), DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

	private final String inEnglish;

	private Wochentag(String inEnglish) {
		this.inEnglish = inEnglish;
	}

	private Wochentag() {
		this("Not defined");
	}

	public String getEnglish() {
		return inEnglish;
	}
}

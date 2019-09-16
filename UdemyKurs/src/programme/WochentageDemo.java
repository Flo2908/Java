package programme;

import javax.swing.text.html.HTML.Tag;

import Enums.Wochentag;

public class WochentageDemo {

	public static void main(String[] args) {

		Wochentag montag = Wochentag.MONTAG;
		System.out.println(montag.ordinal());
		Wochentag freitag = Wochentag.FREITAG;
		Wochentag mittwoch = Wochentag.MITTWOCH;

		anlaysiereWochentage(montag);
		anlaysiereWochentage(freitag);
		anlaysiereWochentage(mittwoch);

		analysiereWochentagSwitch(montag);
		analysiereWochentagSwitch(freitag);
		analysiereWochentagSwitch(mittwoch);
	}

	private static void anlaysiereWochentage(Wochentag t) {
		System.out.print(t.toString() + " ist : ");
		if (t.toString().equalsIgnoreCase("montag")) {
			System.out.println("Schlimm");
		} else if (t.toString().equalsIgnoreCase("" + "Freitag")) {
			System.out.println("Toll");
		} else if (t.toString().equalsIgnoreCase("Samstag")) {
			System.out.println("Super");
		} else if (t.toString().equalsIgnoreCase("sonntag")) {
			System.out.println("Sehr geil");
		} else {
			System.out.println("So la la....");
		}
	}

	private static void analysiereWochentagSwitch(Wochentag t) {
		t.ordinal(); // --> Intern ruf der Switch Case den zurück gegeben int auf
		System.out.print(t.toString() + " ist : ");
		switch (t) {
		case MONTAG:
			System.out.println("Schlimm");
			break;
		case FREITAG:
			System.out.println("Toll");
			break;
		default:
			System.out.println("So la la....");
		}

	}
}

package programme;

public class SwitchDemo {
	public static void main(String[] args) {
		/*
		 * 1 = kaugummi kaufen 
		 * 2 = geld wurde eingworfen 
		 * 3 = Kaugummi wird ausgeworfen
		 * 4 = Automat leer
		 * 5 = Systemfehler
		 */
		int status = 4;
		switch (status) {
		case 1:
			System.out.println("Kaugummi gekauft");
			break;
		case 2:
			System.out.println("Geld eingeworfen");
			break;
		case 3:
			System.out.println("Kaugummi kommt");
			break;
		case 4:
			System.out.println("Automat leer");
			break;
		case 5:
			System.out.println("Systemfehler");
		default:
			System.out.println("keinen Case getroffen");
			break;
		}
	}
}

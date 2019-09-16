package Collections;

import java.util.Random;

public class SchleifenDemo {

	public static void main(String[] args) {

		// for -Schleife
		int max = 20;
		for (int i = 1; i <= max; i++) {
			System.out.println(i + ". Schleifendurchlauf");
		}
		int zahlArray[] = new int[20];
		for (int i = 1; i <= zahlArray.length; i++) {
			int zahl = (int) Math.pow(2, i);
			zahlArray[i - 1] = zahl;
			System.out.println(zahl);
		}
		
		// ForEach Schleife
		for (int i : zahlArray) {
			
		}
		// While Schliefe
		
		Random rnd = new Random();
		rnd.nextInt(6);
		int zahl = 0;
		while(zahl != 6) {
			zahl = rnd.nextInt(6 +1);
			System.out.println(zahl + "   From While");
		}
		// do While
		int zahl1 = 0;
		do {
			zahl1 = rnd.nextInt(6) +1;
			System.out.println(zahl1 + "   From Do While");
		}while(zahl1 != 6);
	}
}

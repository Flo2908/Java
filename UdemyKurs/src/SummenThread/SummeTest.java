package SummenThread;

import java.math.BigInteger;

public class SummeTest {

	private static final int MY_CORES = 10;

	public static void main(String[] args) {

		long zahl = 100L;
		for (int loop = 1; loop <= 10; loop++) {
			for (int threads = 1; threads <= MY_CORES; threads++) {
				test(zahl, threads);
			}
			System.out.println();
			
		}
	}

	private static void test(long zahl, int threads) {
		long start = System.currentTimeMillis();

		BigInteger ergebnis = BigIntegerSum.berechneSumme(zahl, threads);

		long stop = System.currentTimeMillis();
		double zeit = (stop - start) / 1000.;

		System.out.println("Summe von " + zahl + " ist: " + ergebnis + " (berechnet in " + zeit + " Sekunden von "
				+ threads + " Thread(s))");
	}
}

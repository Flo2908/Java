package SummenThread;

import java.math.BigInteger;

public class BigIntegerSum implements Runnable {

	private long von;
	private long bis;

	private BigInteger ergebnis = BigInteger.ZERO;
	private boolean fertig = false;

	public BigIntegerSum(long von, long bis) {
		this.von = von;
		this.bis = bis;
	}

	@Override
	public void run() {
		while (von >= bis) {
			ergebnis = ergebnis.add(new BigInteger(von + ""));
			von--;
		}
		fertig = true;
		synchronized (this) {
			notifyAll();
		}
	}

	public boolean isFertig() {
		return fertig;
	}

	public BigInteger getErgebnis() {
		return ergebnis;
	}

	public static BigInteger berechneSumme(long zahl, int threads) {
		if (zahl < 1) {
			throw new IllegalArgumentException("Ungültige Zahl: " + zahl);
		}
		if (threads < 1) {
			throw new IllegalArgumentException("Ungültige Thread-Anzahl: " + threads);
		}
		if (threads > zahl) {
			throw new IllegalArgumentException("Anzahl der Threads übersteigt den Wert der Zahl!");
		}
		long intervall = zahl / threads;
		long rest = zahl % threads;
		BigIntegerSum[] threadArray = new BigIntegerSum[threads];
		
		long von = 0;
		long bis = 0;
		
		for (int i = 0; i < threads; i++) {
			if (i == 0) {
				von = zahl;
				bis = zahl - intervall + 1;
				bis -= rest;
			} else {
				von = bis - 1;
				bis = von - intervall + 1;
			}
			BigIntegerSum sum = new BigIntegerSum(von, bis);
			threadArray[i] = sum;
		}
		for (BigIntegerSum sum : threadArray) {
			new Thread(sum).start();
		}
		for (BigIntegerSum sum : threadArray) {
			synchronized (sum) {
				while (!sum.isFertig()) {
					try {
						sum.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		BigInteger endErgebnis = BigInteger.ZERO;
		for (BigIntegerSum sum : threadArray) {
			endErgebnis = endErgebnis.add(sum.getErgebnis());
			System.out.println("ZwischenErgebniss : " +endErgebnis );
		}
		return endErgebnis;
	}
}

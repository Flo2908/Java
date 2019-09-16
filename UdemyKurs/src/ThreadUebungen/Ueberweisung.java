package ThreadUebungen;

import java.util.ArrayList;

public class Ueberweisung implements Runnable {
	private static long idCounter = 0;
	private static final ArrayList<Konto> lookedKonto = new ArrayList<Konto>();

	private final long id;
	private final Konto absender;
	private final Konto empfaenger;
	private final int betrag;

	public Ueberweisung(Konto absender, Konto empfaenger, int betrag) {
		this.id = ++idCounter;
		this.absender = absender;
		this.empfaenger = empfaenger;
		this.betrag = betrag;
	}

	@Override
	public synchronized void run() {

		System.out.println("Starte Überweisung " + id + "... \n\n");
		
		synchronized (lookedKonto) {
			while (lookedKonto.contains(absender) || lookedKonto.contains(empfaenger)) {
				try {
					lookedKonto.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lookedKonto.add(absender);
			lookedKonto.add(empfaenger);
		}
		int empKntstandDavor = 0;
		int absKntstandDavor = 0;
		int absDanach = 0;
		int empDanach = 0;
		synchronized (absender) {

			absKntstandDavor = absender.getKtoStand();

			synchronized (empfaenger) {
				empKntstandDavor = empfaenger.getKtoStand();

				absender.setKtoStand(absender.getKtoStand() - betrag);
				absDanach = absender.getKtoStand();

				empfaenger.setKtoStand(empfaenger.getKtoStand() + betrag);
				empDanach = empfaenger.getKtoStand();
				
				System.out.println("Überweisung " + id + " durchgeführt.\nALT : \n   Konto " + absender.getKtoNr()
						+ " (" + absKntstandDavor + " €) --> Betrag " + betrag + " € <-- an Konto "
						+ empfaenger.getKtoNr() + " (" + empKntstandDavor + " €) \nNEU:\n " + "  Konto "
						+ absender.getKtoNr() + " (" + absDanach + " €)	      		     Konto " + empfaenger.getKtoNr()
						+ " (" + empDanach + " €)\n-------------------------------------------");
				
				synchronized (lookedKonto) {
					lookedKonto.remove(absender);
					lookedKonto.remove(empfaenger);
					lookedKonto.notifyAll();
				}
			}

		}
	}

}

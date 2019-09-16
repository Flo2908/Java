package ThreadUebungen;

public class BankCluster {

	public static void main(String[] args) {

		Konto k1 = new Konto(1, 1000);
		Konto k2 = new Konto(2, 2000);
		Konto k3 = new Konto(3, 3000);
		Konto k4 = new Konto(4, 4000);
		Konto k5 = new Konto(5, 5000);

		Ueberweisung u1 = new Ueberweisung(k4, k5, 1000);

		Ueberweisung u2 = new Ueberweisung(k3, k2, 1000);

		Ueberweisung u3 = new Ueberweisung(k1, k5, 1000);

		Ueberweisung u4 = new Ueberweisung(k1, k3, 2000);

		Ueberweisung u5 = new Ueberweisung(k3, k1, 2000);

		Ueberweisung u6 = new Ueberweisung(k3, k5, 1000);

		Ueberweisung u7 = new Ueberweisung(k4, k3, k4.getKtoStand());

		new Thread(u1).start();
		new Thread(u2).start();
		new Thread(u3).start();
		new Thread(u4).start();
		new Thread(u5).start();
		new Thread(u6).start();
		new Thread(u7).start();

		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		System.out.println(k5);

	}

}

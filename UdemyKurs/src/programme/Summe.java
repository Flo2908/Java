package programme;

public class Summe {
	public static void main(String[] args) {
		String zahl = args[0];
		int z = Integer.parseInt(zahl);
		long sum = GetSumFor(z);
		long sum2 = GetSumRekursion(z);
		System.out.println("Von Schleife ist die Summe von " + z + " = " + sum  +"\n" +
				"Von Rekursion ist die Summe von " + z + " = " + sum2);
	}

	private static long GetSumRekursion(int z) {
		// TODO Auto-generated method stub
		if(z == 1) {
			return 1;
		}
		return z + GetSumRekursion(z -1);
	}

	static long GetSumFor(int zahl) {
		int r = 0;
		for (int i = 0; i <= zahl; i++) {
			r += i;
		}
		return r;
	}
}

package programme;

public class VarArgs {

	public static void main(String[] args) {
		
		System.out.println(addiere( 2,3,4,6,5));
	}
	static int addiere (int zahl , int zahl2, int... weiterZahlen) {
		int ergebniss = 0 ;
		for (int i : weiterZahlen) {
			ergebniss += i;
		}
		return ergebniss + zahl + zahl2;
	}
}

import java.util.Scanner;

import EulerTerms.Die10001Primezahl;
import EulerTerms.Fibonacci;
import EulerTerms.Gr��tesProduktineinerReihe;
import EulerTerms.KleinstesVielfaches;
import EulerTerms.NatrualNumbers;
import EulerTerms.Palindrom;
import EulerTerms.PrimeFactor;
import EulerTerms.Quadrat_Differenz;

public class Euler {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * Nat�rlich Zahlen
		 * 
		 * Nat�rliche Zahlen NatrualNumbers test = new NatrualNumbers();
		 * System.out.println("Bitte Gib eine Nat�rliche Zahl ein"); int antrualNumber =
		 * scanner.nextInt();
		 * 
		 * System.out.println("Bitte gib die H�he der Zahl ein"); int range =
		 * scanner.nextInt();
		 * 
		 * String result = test.GetSumFromNatrualNumbers(antrualNumber, range);
		 * System.out.println(result);
		 * 
		 * Fibonaci
		 * 
		 * Fibonacci Fibonacci test = new Fibonacci();
		 * System.out.println("Bitte gib die H�he der Fibonacci Reihe ein ein"); int
		 * range = scanner.nextInt(); test.FibonaciReihe(range);
		 *
		 * Primefactor
		 * 
		 * PrimeFactor PrimeFactor test = new PrimeFactor();
		 * System.out.println("Bitte gib die H�he der Zahl ein"); long range =
		 * scanner.nextLong(); test.GetPrimeFactor(range); Palindrom Palindrom test =
		 * new Palindrom(); System.out.println("Bitte gib die L�nge der Zahln ein"); int
		 * range = scanner.nextInt(); test.GetBigestPalindrom(range);
		 * 
		 * KleinstesVielfaches
		 * 
		 * KleinstesVielfaches tets = new KleinstesVielfaches();
		 * System.out.println("Bitte gib die erste zahl von ein"); int start =
		 * scanner.nextInt(); System.out.println("Bitte gib die zahl bis ein"); int end
		 * = scanner.nextInt(); tets.GetSmallestNumber(start,end);
		 * 
		 * Quadrat_differenz
		 * 
		 * Quadrat_Differenz test = new Quadrat_Differenz();
		 * System.out.println("Bitte gib die erste zahl von ein"); int start =
		 * scanner.nextInt(); System.out.println("Bitte gib die zahl bis ein"); int end
		 * = scanner.nextInt(); test.GetQuadrattSummenDifferenz(start,end);
		 * 
		 * 10001Primezahl
		 * 
		 * Die10001Primezahl tets = new Die10001Primezahl();
		 * System.out.println("Bitte gib die Primezahl ein"); int count =
		 * scanner.nextInt(); tets.PrimezahlCounter( count);
		 *
		 *Gr�sstesProduktEinerReihe
		 *
		 */
		Gr��tesProduktineinerReihe tets  =new Gr��tesProduktineinerReihe();
		System.out.println("Gib die range ein");
		int range = scanner.nextInt();
		tets.GetRangeString(range);

		
	}
}

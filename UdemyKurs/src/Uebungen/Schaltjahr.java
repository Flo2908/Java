package Uebungen;

import java.io.Console;
import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		System.out.println("Gib eine Jahres Zahl ein");
		Scanner sc = new Scanner(System.in);
		int jahr = sc.nextInt();
		Schaltjahr.IstSchaltjahr(jahr);
		;
	}

	private static void IstSchaltjahr(int jahr) {
		// TODO Auto-generated method stub
	
		System.out.println(jahr % 4 == 0 ? "Ja....Schaltjahr" : "nein...Kein Schaltjahr");
		
	}
}

package OperatoreDatentypen;

public class StringDemo {

	public static void main(String[] args) {
		
		String hersteller = "BMW";
		String hersteller2 = new String("BMW");
		
		System.out.println(hersteller == hersteller2);
		System.out.println(hersteller.equals(hersteller2));
		
		String s = "test";
		String t = s.replace("s", "x");
		
		
	}
}

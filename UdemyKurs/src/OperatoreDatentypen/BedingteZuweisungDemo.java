package OperatoreDatentypen;

public class BedingteZuweisungDemo {
public static void main(String[] args) {
	
	String s;
	int j = 10;
	if(j % 2 == 0) {
		s = "Zahl gerade";
	}else {
		s = "Zahl ungerade";
	}
	s = j % 2 == 0 ? ":)" : ":(";
	System.out.println(s);
	System.out.println(j % 2 == 0 ? ":)" : ":(");
}
}

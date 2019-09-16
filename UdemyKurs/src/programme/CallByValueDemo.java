package programme;

import classen.Auto;

public class CallByValueDemo {
	
	public static void main(String[] args) {
	
		int i = 10;
		doStuff(i);
		System.out.println(i);
		
		Auto auto = new Auto("BMW" , 100);
	Auto b = doStuff(auto);
		auto = doStuff(auto);
	
		System.out.println(auto.getLeistung());
		
		doOtherStuff(auto);
		System.out.println(auto.getLeistung());
		
	}

	static void doStuff(int i) {
		i *= 2;
		System.out.println(i);
	}
	static Auto doStuff(Auto a) {
		a = new Auto("BMW", 200);
		return a;
	}
	static void doOtherStuff(Auto a ) {
		a.tunen(500);
	}

	
}

package Lokale_InnereKlassen;

public class OuterClass {

	class InnerClass {

	}

	static class StaticInnerClass {

	}

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		outer.new InnerClass();
		
		new StaticInnerClass();
	
	
	}

}

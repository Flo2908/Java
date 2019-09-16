package Lokale_InnereKlassen;

public class ZugriffAufLokaleKlassen {

	
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.new InnerClass();
		//outer.new StaticInnerClass();
	}
}

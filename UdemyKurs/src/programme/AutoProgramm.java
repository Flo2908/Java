package programme;

import classen.Auto;

class AutoProgramm {
	 
	 static String bmw  ="BMW";
	 public static void main(String[] args) {
	
		 System.out.println("Programm gestartet");
		 Auto bmw;
		 Auto audi;
		 
		 bmw = new Auto("BMW", 100);
		 System.out.println(bmw.getHersteller() +" hat " + bmw.getLeistung()+ "PS");
		 
		 audi = new Auto("Audi", 200);
		 System.out.println(audi.getHersteller() +" hat " + audi.getLeistung()+ "PS");
		 
		 // Punkt notation
		 audi.tunen();
		 
		 Auto.printInfos(audi);
		 System.out.println(audi.getHersteller() +" hat  " + audi.getLeistung() + "PS"); 
		 
		
	}
	 
}

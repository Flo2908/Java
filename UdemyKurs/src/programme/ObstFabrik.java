package programme;
import classen.Obst;

public class ObstFabrik {

	public static void main(String[] args) {
		Obst apfel = new Obst("Apfel",  3, 350);
		
		apfel.aufpeppen(200 , 2);
		System.out.println(apfel.getNaehrwert() + " naehrwert---" +  apfel.getVerkaufspreis() + " Preis");
		
		Obst birne = new Obst("Birne", 3, 250);
		birne.aufpeppen(200, 3);
		System.out.println(birne.getBezeichnung() + " name---" + birne.getNaehrwert() + " naehrwert" );
		
		
		System.out.println(new Obst("E", 3, 3).getBezeichnung() );
	}
}

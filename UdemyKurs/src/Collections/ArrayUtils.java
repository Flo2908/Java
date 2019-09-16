package Collections;

public class ArrayUtils {

	public static<X> Liste<X> makeListe(X[] array){
		Liste<X>liste = new Liste<X>(100);
		for(X x : array) {
			liste.add(x);
		}
		return liste;
	}
	
	// Wildcard
	public static int getRemainingSlots(Liste<?> liste) {
		return liste.getCapacity() - liste.getElementCount();
	}
}

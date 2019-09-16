package EulerTerms;

public class Die10001Primezahl {

	public void PrimezahlCounter(int count) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int i = 0;;i++) {
			if(CheckPrimzahl(i)) {
				counter++;
				if(counter == count) {
					System.out.println(i);
					break;
				}
				
			}
		}
	}
	public boolean CheckPrimzahl(int number) {
		if (number < 2) {
			return (number == 2);
		}
		for (long i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

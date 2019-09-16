package EulerTerms;

public class PrimeFactor {

	public void GetPrimeFactor(long input) {
		long result = 0;
		for (int i = 1; i < input; i++) {

			if (CheckPrimzahl(i) && i <= input) {
				result = i;
				
			}
			
		}
		System.out.println(result);
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

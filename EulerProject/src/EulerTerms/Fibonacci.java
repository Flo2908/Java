package EulerTerms;

public class Fibonacci {

	public void FibonaciReihe(int range) {
		int result = 0;
		int curr = 0;
		int curr2 = 1;
		int curr3 = 0;
		while (curr3 <= range) {
			curr3 = curr + curr2;
			curr = curr2;
			curr2 = curr3;
			if (curr3 % 2 == 0) {
				result += curr3;
				/* System.out.println(result); */
			}
			System.out.println(curr3);
		}
	}
}

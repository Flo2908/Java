package EulerTerms;

public class KleinstesVielfaches {

	public void GetSmallestNumber(int start, int end) {
		// TODO Auto-generated method stub
		int[] numbers = new int[end];
		int number = end;
		boolean check = true;

		for (int i = 0; i <= end - start; i++) {
			numbers[i] = start + i;
		}
		do {
			check  =true;
			for (int e : numbers) {
				if (number % e == 0) {
					continue;
				} else {
					number++;
					check = false;
					break;
				}
			}
		} while (!check);
		System.out.println(number);

	}

	private boolean GetNumber(int number) {
		// TODO Auto-generated method stub

		return false;
	}

}

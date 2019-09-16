package EulerTerms;

public class NatrualNumbers {

	public String GetSumFromNatrualNumbers(int number, int range) {
		int sum = 0;
		String output = "";
		if (number == 0) {
			output += NoAllowedInput();
		} else {
			for (int i = 0; i <= range; ) {
				sum += i;
				i += number;
			}
			output += String.valueOf(sum);
		}
		return output;
	}

	public String NoAllowedInput() {
		return "0 ... this is no natrual Number";
	}
}

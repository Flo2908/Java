package EulerTerms;

public class Palindrom {

	public boolean CheckPalindrom(long range) {
		String input = Long.toString(range);

		if (input.equals(new StringBuilder(input).reverse().toString())) {
			return true;
		}
		return false;
	}

	public void GetBigestPalindrom(int range) {
		String number = "";
		int result = 0;
		for (int i = 1; i <= range; i++) {
			number += "9";
		}
		int numberLength = Integer.valueOf(number);

		for (int i = numberLength; i >= 1;) {
			for (int i2 = numberLength; i >= 1;) {
				if (CheckPalindrom(i * i2)) {
					if (i * i2 > result) {
						result = i * i2;
					}
					break;
				} else {
					--i2;
					if (CheckPalindrom(i * i2)) {
						if (i * i2 > result) {
							result = i * i2;
						}
						break;
					}
				}
			}
			--i;
		}
		System.out.println(result);
	}
}

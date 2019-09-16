package programme;

public class CodeLabelDemo {

	public static void main(String[] args) {

		meinLabel: {

			System.out.println("Test");
			int i = 1;
			if (i == 1) {
				break meinLabel;
			}
			System.out.println("Test 2");
		}
		meinLabel2: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Test");

				if (i == 5 && j == 5) {
					break meinLabel2;
				}
				System.out.println("Test 2");
			}
		}

	}
}

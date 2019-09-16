package Collections;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] intArray = new int[3];
		int[] intArray2 = new int[] { 2, 1, 3, };
		intArray[0] = 5;
		intArray[1] = 4;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray2[i] = i;
		}
		for (int i : intArray) {
			if (i == 0) {
				
			}
		}
		
		String [][]zweiDimArray = new String[6][];
		zweiDimArray[0] = new String[3];
		zweiDimArray[0][0] = "Hans";
		
	}
}

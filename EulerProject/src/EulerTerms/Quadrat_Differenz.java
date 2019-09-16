package EulerTerms;

public class Quadrat_Differenz {

	public void GetQuadrattSummenDifferenz(int start, int end) {
		double result2 = GetSumOfQuadratt(start, end);
		double result = 0;
		for (; start <= end; start++) {
			result += start;
		}
		result = Math.pow(result, 2);
		System.out.println(result - result2);
	}

	private double GetSumOfQuadratt(int start, int end) {
		// TODO Auto-generated method stub
		double result = 0;
		for (; start <= end; start++) {
			result += Math.pow(start, 2);
		}
		return result;
	}

}

package Uebungen;

public class CallByReferenc {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		initializeXY(x, y);
		System.out.println("x=" + x + ", y=" + y);
	}

	private static void initializeXY(int x, int y) {
		x = 5;
		y = 8;
	}
	
	
}

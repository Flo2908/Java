package Uebungen;

public class ProzentRechnung {

	private int wert;
	
	public ProzentRechnung(int i) {
		// TODO Auto-generated constructor stub
		this.setWert(i);
	}

	public double wertZuProzent(int i) {
		// TODO Auto-generated method stub
	
			return( (double)i / wert) * 100;
			
	}

	public double prozentZuWert(int i) {
		// TODO Auto-generated method stub
		return ((double)wert / 100) * i;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

}

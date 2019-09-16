package classen;

import java.util.Iterator;

import Interfaces.Verkaeuflich;

public class Dackel  extends Hund implements Verkaeuflich {

	
	private int preis;
	
	public Dackel(int preis) {
		this.preis = preis;
	}
	
	@Override
	public int getPreis() {
		// TODO Auto-generated method stub
		return preis;
	}

	


}

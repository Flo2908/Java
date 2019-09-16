package Uebungen;
import java.awt.Color;
import java.awt.color.*;

public enum SpielsteinFarbe {

	RED(Color.RED), GREEN(Color.GREEN), BLUE(Color.BLUE), YELLOW(Color.YELLOW);
	
	private final Color color;

	SpielsteinFarbe(Color c) {
		this.color = c;
	}
	public Color getColor() {
		return color;
	}
}

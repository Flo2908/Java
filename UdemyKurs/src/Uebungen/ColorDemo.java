package Uebungen;

import java.awt.Color;

public class ColorDemo {

	public static void main(String[] args) {
		
		Color colorGelb = new Color(0, 255, 0);
		
		System.out.println("<"+ colorGelb.getRed()+"> - "+
				"<"+ colorGelb.getGreen()+"> - "+
				"<"+ colorGelb.getBlue()+">");
		
		colorGelb = makeDarker(colorGelb);
		
		System.out.println("<"+ colorGelb.getRed()+"> - "+
				"<"+ colorGelb.getGreen()+"> - "+
				"<"+ colorGelb.getBlue()+">");
	}
	static Color makeDarker(Color c) {
		return c.darker();
	}
}

package Gui.classes;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Wollen sie wirklich schliessen?");
		System.exit(0);
	}
}

package Gui.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFahrzeugaction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand()+ " Wurde geclickt");
	}

}

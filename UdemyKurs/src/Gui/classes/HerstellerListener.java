package Gui.classes;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class HerstellerListener implements CaretListener{

	JButton btn = new JButton();
	
	public HerstellerListener(JButton btn) {
		this.btn = btn;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void caretUpdate(CaretEvent e) {
		// TODO Auto-generated method stub
		JTextField field = (JTextField)e.getSource();
		btn.setEnabled(!field.getText().trim().isEmpty());
	}

}

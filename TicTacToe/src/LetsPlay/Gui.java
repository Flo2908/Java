package LetsPlay;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui {

	JFrame jF;
	Draw draw;
	
	static JButton btn[] = new JButton[9];
	static int[] state = new int[9];
	static int player = 0;
	static int winner = 0;
	static JButton btnReset;
	static JTextField textField;
	static JDialog JdAlertbox;
	static JButton button1;

	public Gui() {

		
		jF = new JFrame();
		jF.setSize(800, 600);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setLocationRelativeTo(null);
		jF.setResizable(false);
		jF.setTitle("TicTacToe");

		for (int i = 0; i < state.length; i++) {
			state[i] = 2;
		}

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setVisible(true);
			btn[i].addActionListener(new ActionHandler());
			btn[i].setFocusPainted(false);
			btn[i].setContentAreaFilled(false);
			btn[i].setBorder(null);

			jF.add(btn[i]);
		}

		ButtonPlace.place();

		btnReset = new JButton("Reset");
		btnReset.setBounds(600, 500, 100, 40);
		btnReset.setBackground(Color.GREEN);
		btnReset.setForeground(Color.WHITE);
		btnReset.setVisible(true);
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Funktion.reset();

			}
		});
		
		JdAlertbox = new JDialog(jF,Dialog.ModalityType.DOCUMENT_MODAL);
		JdAlertbox.setSize(300, 150);
		JdAlertbox.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		JdAlertbox.setLocationRelativeTo(null);
		JdAlertbox.setTitle("Alert");
		JdAlertbox.setResizable(false);
		JdAlertbox.setLayout(null);

		textField = new JTextField();
		textField.setBounds(5, 5, 280, 50);
		textField.setForeground(Color.RED);
		textField.setDragEnabled(true);
		textField.setText("This is not Possible");
		textField.setEditable(false);
		textField.setVisible(false);

		button1 = new JButton("Go Back");
		button1.setBounds(5, 60, 280, 50);

		button1.setBackground(Color.RED);
		button1.setForeground(Color.BLACK);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Funktion.close();

			}
		});
		JdAlertbox.setVisible(false);

		jF.add(btnReset);

		draw = new Draw();
		draw.setBounds(0, 0, 600, 800);
		draw.setVisible(true);
		jF.add(draw);
		jF.setVisible(true);

	}

}

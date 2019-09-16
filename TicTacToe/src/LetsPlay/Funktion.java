package LetsPlay;

import javax.swing.JButton;

public class Funktion {

	public static void reset() {
		for (int i = 0; i < Gui.state.length; i++) {
			Gui.state[i] = 2;
		}
		Gui.player = 0;
		Gui.winner = 0;
	}

	public static void close() {
		// TODO Auto-generated method stub
		Gui.btnReset.setEnabled(true);
		for (JButton b : Gui.btn) {
			b.setEnabled(true);
		}
		Gui.JdAlertbox.dispose();
	}

	public static void notAllow() {
		// TODO Auto-generated method stub
		Gui.btnReset.setEnabled(false);
		for (JButton b : Gui.btn) {
			b.setEnabled(false);
		}
		Gui.textField.setVisible(true);
		Gui.button1.setVisible(true);
		Gui.JdAlertbox.getModalExclusionType();
		Gui.JdAlertbox.add(Gui.textField);
		Gui.JdAlertbox.add(Gui.button1);
		Gui.JdAlertbox.setVisible(true);

	}

	public static boolean checkWin(int state) {

		if ((drawWinnerLine(Gui.state[0], Gui.state[1], Gui.state[2], state))
				|| (drawWinnerLine(Gui.state[3], Gui.state[4], Gui.state[5], state))
				|| (drawWinnerLine(Gui.state[6], Gui.state[7], Gui.state[8], state))
				|| (drawWinnerLine(Gui.state[0], Gui.state[3], Gui.state[6], state))
				|| (drawWinnerLine(Gui.state[1], Gui.state[4], Gui.state[7], state))
				|| (drawWinnerLine(Gui.state[2], Gui.state[5], Gui.state[8], state))
				|| (drawWinnerLine(Gui.state[2], Gui.state[4], Gui.state[6], state))
				|| (drawWinnerLine(Gui.state[0], Gui.state[4], Gui.state[8], state))) {

			Gui.btnReset.setEnabled(false);
			for (JButton b : Gui.btn) {
				b.setEnabled(false);
			}
			Gui.textField.setText("Player " + (state + 1) + " hat gewonnen");
			Gui.textField.setVisible(true);
			Gui.button1.setText("Restart");
			Gui.button1.setVisible(true);

			Gui.JdAlertbox.getModalExclusionType();
			Gui.JdAlertbox.add(Gui.textField);
			Gui.JdAlertbox.add(Gui.button1);
			Gui.JdAlertbox.setVisible(true);

			return true;
		}
		return false;
	}
	static boolean drawWinnerLine(int state1, int state2, int state3, int state) {
		if (Gui.state[state1] == state && Gui.state[state2] == state && Gui.state[state3] == state) {
			Draw.winnerState = new int[] {state1, state2, state3};
			Draw.winner = true;
			return true;
		}
		return false;
	}
}

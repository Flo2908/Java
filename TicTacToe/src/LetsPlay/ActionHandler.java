package LetsPlay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	public ActionHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (Gui.winner == 0) {

			for (int i = 0; i < Gui.btn.length; i++) {

				if (e.getSource() == Gui.btn[i]) {

					if (Gui.state[i] == 1 || Gui.state[i] == 0) {
						Funktion.notAllow();
					}
					if (Gui.state[i] == 2 && Gui.player == 0) {

						Gui.state[i] = 0;
						if (Funktion.checkWin(0)) {
							Funktion.reset();
						}
						Gui.player = 1;

					} else if (Gui.state[i] == 2 && Gui.player == 1) {

						Gui.state[i] = 1;
						if (Funktion.checkWin(1)) {
							Funktion.reset();
						}
						Gui.player = 0;
					}
				}
			}
		}
	}
}

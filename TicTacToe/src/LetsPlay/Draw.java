package LetsPlay;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {
	static boolean winner;
	static int[] winnerState;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// Draw is possible

		g.setColor(Color.magenta);

		// Vertical
		g.drawLine(325, 50, 325, 500);
		g.drawLine(475, 50, 475, 500);
		// Horizontal
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);

		// Reihe eins
		if (Gui.state[0] == 0) {
			g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);

		} else if (Gui.state[0] == 1) {
			g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);

		}
		if (Gui.state[1] == 0) {
			g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
		} else if (Gui.state[1] == 1) {
			g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);

		}
		if (Gui.state[2] == 0) {
			g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
		} else if (Gui.state[2] == 1) {
			g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);

		}

		// Reihe zwei
		if (Gui.state[3] == 0) {
			g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
		} else if (Gui.state[3] == 1) {
			g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);

		}
		if (Gui.state[4] == 0) {
			g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
		} else if (Gui.state[4] == 1) {
			g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);

		}
		if (Gui.state[5] == 0) {
			g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
		} else if (Gui.state[5] == 1) {
			g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);

		}

		// Reihe drei
		if (Gui.state[6] == 0) {
			g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
		} else if (Gui.state[6] == 1) {
			g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);

		}
		if (Gui.state[7] == 0) {
			g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
		} else if (Gui.state[7] == 1) {
			g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);

		}
		if (Gui.state[8] == 0) {
			g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
		} else if (Gui.state[8] == 1) {
			g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);

		}
		if(winner == true) {
			g.setColor(Color.RED);
		
			for(int i : winnerState) {
				if(i == Gui.state[0]) {
					g.drawLine(175 , 125, 325, 125);
				}if(i == Gui.state[1]) {
					g.drawLine(325, 125, 475, 125);
				}if(i == Gui.state[2]) {
					g.drawLine(475,125,600,125);
				}
			}
			repaint();
			winner= false;
			
			
		}
		repaint();
	}

	

}

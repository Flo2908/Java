package Gui.classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class FMFrame extends JFrame {

	private JLabel lblheader;
	private JTable jTable;
	private JScrollPane scrollTable;
	private JProgressBar progBar;
	private JButton btnInfo;
	private JButton btnAdd;
	private JLabel lblHersteller, lblLeistung, lblPreis, lblTyp;
	private JSpinner spinLeistung, spinPreis;
	private JTextField textHersteller;
	private JComboBox combTyp;
	private JPanel addPanal;
	private JPanel panelLeft;

	public FMFrame() {
		setTitle("Fahrzeug Manager");

		// Ohne MyWindoListener so schliessen
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Mit MyWindowListener
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		createWidgets();
		setupInteraction();
		addWidgets();

		pack();
		setLocationRelativeTo(null);

		addWindowListener(new MyWindowListener());
	}

	private void createWidgets() {
		// TODO Auto-generated method stub
		lblheader = new JLabel("Fahrzeug Manager");
		lblheader.setFont(lblheader.getFont().deriveFont(Font.BOLD + Font.ITALIC, 30));
		lblheader.setForeground(Color.magenta);
		lblheader.setOpaque(true);
		lblheader.setBackground(Color.black);
		lblheader.setHorizontalAlignment(SwingConstants.CENTER);

		progBar = new JProgressBar(0, 100);
		progBar.setPreferredSize(new Dimension(0, 30));

		jTable = new JTable(100, 4);
		scrollTable = new JScrollPane(jTable);
		btnInfo = new JButton("Information...");
		btnInfo.setAlignmentX(LEFT_ALIGNMENT);

		addPanal = new JPanel();
		addPanal.setLayout(new GridLayout(0, 2, 5, 5));

		lblHersteller = new JLabel("Hersteller");
		// lblHersteller.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeistung = new JLabel("Leistung");
		// lblLeistung.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreis = new JLabel("Preis");
		// lblPreis.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyp = new JLabel("Typ");
		// lblTyp.setHorizontalAlignment(SwingConstants.CENTER);

		textHersteller = new JTextField();
		combTyp = new JComboBox(new Object[] { "PKW", "LKW", "Motorrad" });
		spinLeistung = new JSpinner(new SpinnerNumberModel(100, 5, 1000, 5));
		spinPreis = new JSpinner(new SpinnerNumberModel(5000, 500, 10000000, 100));

		btnAdd = new JButton("Hinzufügen");
		btnAdd.setEnabled(false);

		panelLeft = new JPanel();
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.PAGE_AXIS));
	}

	private class HerstellerListener implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent e) {
			// TODO Auto-generated method stub
			JTextField field = (JTextField) e.getSource();
			btnAdd.setEnabled(!field.getText().trim().isEmpty());
		}

	}

	private void setupInteraction() {

		btnAdd.addActionListener(new AddFahrzeugaction());
		textHersteller.addCaretListener(new HerstellerListener());
	}

	private void addWidgets() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(new BorderLayout(5, 5));
		getContentPane().add(BorderLayout.NORTH, lblheader);
		getContentPane().add(progBar, BorderLayout.SOUTH);
		getContentPane().add(scrollTable, BorderLayout.CENTER);
		getContentPane().add(panelLeft, BorderLayout.WEST);

		addPanal.add(lblHersteller);
		addPanal.add(textHersteller);

		addPanal.add(lblLeistung);
		addPanal.add(spinLeistung);

		addPanal.add(lblPreis);
		addPanal.add(spinPreis);

		addPanal.add(lblTyp);
		addPanal.add(combTyp);

		addPanal.add(Box.createVerticalGlue());
		addPanal.add(btnAdd);

		addPanal.setMaximumSize(addPanal.getPreferredSize());
		addPanal.setAlignmentX(LEFT_ALIGNMENT);

		panelLeft.add(addPanal);
		panelLeft.add(Box.createVerticalGlue());
		panelLeft.add(btnInfo);

		panelLeft.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

	}
}

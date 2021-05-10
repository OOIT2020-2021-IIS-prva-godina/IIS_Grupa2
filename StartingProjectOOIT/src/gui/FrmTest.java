package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup prvaButtonGrupa = new ButtonGroup();
	private DefaultListModel<String> dlmBoje = new DefaultListModel<String>();
	private JLabel lblCrvena;
	private JLabel lblPlava;
	private JLabel lblZuta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		//centralni panel
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_pnlCenter.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pnlCenter.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlCenter.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		pnlCenter.setLayout(gbl_pnlCenter);

		JToggleButton tglbtnCrvena = new JToggleButton("Crvena boja");
		tglbtnCrvena.setPreferredSize(new Dimension(120, 25));
		tglbtnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmBoje.addElement(lblCrvena.getText());

				if (tglbtnCrvena.isSelected()) {
					lblZuta.setForeground(Color.black);
					lblPlava.setForeground(Color.black);
					lblCrvena.setForeground(Color.red);
				}
			}
		});

		prvaButtonGrupa.add(tglbtnCrvena);
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 0;
		pnlCenter.add(tglbtnCrvena, gbc_tglbtnCrvena);

		lblCrvena = new JLabel("Crvena");
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.anchor = GridBagConstraints.WEST;
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 0;
		pnlCenter.add(lblCrvena, gbc_lblCrvena);

		JToggleButton tglbtnPlava = new JToggleButton("Plava boja");
		tglbtnPlava.setPreferredSize(new Dimension(120, 25));
		tglbtnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmBoje.addElement(lblPlava.getText());

				if (tglbtnPlava.isSelected()) {
					lblZuta.setForeground(Color.black);
					lblPlava.setForeground(Color.red);
					lblCrvena.setForeground(Color.black);
				}
			}
		});

		prvaButtonGrupa.add(tglbtnPlava);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 1;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);

		lblPlava = new JLabel("Plava");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.anchor = GridBagConstraints.WEST;
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 1;
		pnlCenter.add(lblPlava, gbc_lblPlava);

		JToggleButton tglbtnZuta = new JToggleButton("Zuta boja");
		tglbtnZuta.setPreferredSize(new Dimension(120, 25));
		tglbtnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmBoje.addElement(lblZuta.getText());

				if (tglbtnZuta.isSelected()) {
					lblZuta.setForeground(Color.red);
					lblPlava.setForeground(Color.black);
					lblCrvena.setForeground(Color.black);
				}
			}
		});
		prvaButtonGrupa.add(tglbtnZuta);
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 2;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);

		lblZuta = new JLabel("Zuta");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.anchor = GridBagConstraints.WEST;
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 2;
		pnlCenter.add(lblZuta, gbc_lblZuta);

		//scroll i lista
		JScrollPane scrollPaneBoje = new JScrollPane();
		GridBagConstraints gbc_scrollPaneBoje = new GridBagConstraints();
		gbc_scrollPaneBoje.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneBoje.gridx = 4;
		gbc_scrollPaneBoje.gridy = 3;
		pnlCenter.add(scrollPaneBoje, gbc_scrollPaneBoje);

		JList lstBoje = new JList();
		scrollPaneBoje.setViewportView(lstBoje);
		lstBoje.setModel(dlmBoje);
		
		//gornji panel
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlSouth = new GridBagLayout();
		gbl_pnlSouth.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlSouth.rowHeights = new int[]{0, 0, 0};
		gbl_pnlSouth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlSouth.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlSouth.setLayout(gbl_pnlSouth);
		
		JButton btnIspis = new JButton("Klikni me");
		btnIspis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ovo je antistres dugme :)","Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GridBagConstraints gbc_btnIspis = new GridBagConstraints();
		gbc_btnIspis.gridwidth = 0;
		gbc_btnIspis.gridheight = 0;
		gbc_btnIspis.gridx = 7;
		gbc_btnIspis.gridy = 1;
		pnlSouth.add(btnIspis, gbc_btnIspis);
		
		//donji panel
		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNorth = new GridBagLayout();
		gbl_pnlNorth.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlNorth.rowHeights = new int[]{31, 0};
		gbl_pnlNorth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNorth.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlNorth.setLayout(gbl_pnlNorth);
		
		JLabel lblNaziv = new JLabel("Zadatak 1");
		lblNaziv.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNaziv = new GridBagConstraints();
		gbc_lblNaziv.gridwidth = 0;
		gbc_lblNaziv.gridheight = 0;
		gbc_lblNaziv.gridx = 9;
		gbc_lblNaziv.gridy = 0;
		pnlNorth.add(lblNaziv, gbc_lblNaziv);
		pnlNorth.setBackground(Color.green);
	}

}

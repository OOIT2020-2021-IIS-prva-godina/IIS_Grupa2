package vezbe11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.DlgTest;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DefaultListModel<String> dlmIgraci=new DefaultListModel<String>();
	private JLabel lblMatic;
	private JLabel lblIvanovic;
	private JLabel lblKolarov;
	private JTextField txtUnetiIgrac;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
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
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.setBackground(new Color(220, 20, 60));
		setTitle("Igraci");
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(Color.YELLOW);
		pnlCenter.setSize(150,100);
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{116, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 32, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		lblKolarov = new JLabel("Aleksandar Kolarov");
		GridBagConstraints gbc_lblKolarov = new GridBagConstraints();
		gbc_lblKolarov.anchor = GridBagConstraints.EAST;
		gbc_lblKolarov.insets = new Insets(0, 0, 5, 5);
		gbc_lblKolarov.gridx = 0;
		gbc_lblKolarov.gridy = 0;
		pnlCenter.add(lblKolarov, gbc_lblKolarov);
		
		JToggleButton tglbtnKolarov = new JToggleButton("Kolarov");
		tglbtnKolarov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmIgraci.addElement(lblKolarov.getText());
				if (tglbtnKolarov.isSelected()) {
					lblIvanovic.setForeground(Color.black);
					lblKolarov.setForeground(Color.blue);
					lblMatic.setForeground(Color.black);
				}
			}
		});
		buttonGroup.add(tglbtnKolarov);
		GridBagConstraints gbc_tglbtnKolarov = new GridBagConstraints();
		gbc_tglbtnKolarov.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnKolarov.gridx = 1;
		gbc_tglbtnKolarov.gridy = 0;
		pnlCenter.add(tglbtnKolarov, gbc_tglbtnKolarov);
		tglbtnKolarov.setPreferredSize(new Dimension(100,25));
		
		lblMatic = new JLabel("Nemanja Matic");
		GridBagConstraints gbc_lblMatic = new GridBagConstraints();
		gbc_lblMatic.anchor = GridBagConstraints.EAST;
		gbc_lblMatic.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatic.gridx = 0;
		gbc_lblMatic.gridy = 1;
		pnlCenter.add(lblMatic, gbc_lblMatic);
		
		JToggleButton tglbtnMatic = new JToggleButton("Matic");
		tglbtnMatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmIgraci.addElement(lblMatic.getText());
				if (tglbtnMatic.isSelected()) {
					lblIvanovic.setForeground(Color.black);
					lblKolarov.setForeground(Color.black);
					lblMatic.setForeground(Color.blue);
				}
			}
		});
		buttonGroup.add(tglbtnMatic);
		GridBagConstraints gbc_tglbtnMatic = new GridBagConstraints();
		gbc_tglbtnMatic.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMatic.gridx = 1;
		gbc_tglbtnMatic.gridy = 1;
		pnlCenter.add(tglbtnMatic, gbc_tglbtnMatic);
		tglbtnMatic.setPreferredSize(new Dimension(100,25));
		
		lblIvanovic = new JLabel("Branisav Ivanovic");
		GridBagConstraints gbc_lblIvanovic = new GridBagConstraints();
		gbc_lblIvanovic.anchor = GridBagConstraints.EAST;
		gbc_lblIvanovic.insets = new Insets(0, 0, 5, 5);
		gbc_lblIvanovic.gridx = 0;
		gbc_lblIvanovic.gridy = 2;
		pnlCenter.add(lblIvanovic, gbc_lblIvanovic);
		
		JToggleButton tglbtnIvanovic = new JToggleButton("Ivanovic");
		tglbtnIvanovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmIgraci.addElement(lblIvanovic.getText());
				
				if (tglbtnIvanovic.isSelected()) {
					lblIvanovic.setForeground(Color.blue);
					lblKolarov.setForeground(Color.black);
					lblMatic.setForeground(Color.black);
				}
			}
		});
		buttonGroup.add(tglbtnIvanovic);
		GridBagConstraints gbc_tglbtnIvanovic = new GridBagConstraints();
		gbc_tglbtnIvanovic.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnIvanovic.gridx = 1;
		gbc_tglbtnIvanovic.gridy = 2;
		pnlCenter.add(tglbtnIvanovic, gbc_tglbtnIvanovic);
		tglbtnIvanovic.setPreferredSize(new Dimension(100,25));
		
		JCheckBox chckbxUnesiIgraca = new JCheckBox("Unesi igraca");
		chckbxUnesiIgraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxUnesiIgraca.isSelected()) {
					txtUnetiIgrac.setEnabled(true);
				}else {
					txtUnetiIgrac.setText("");
					txtUnetiIgrac.setEnabled(false);
				}
			}
		});
		chckbxUnesiIgraca.setBackground(new Color(255, 255, 0));
		GridBagConstraints gbc_chckbxUnesiIgraca = new GridBagConstraints();
		gbc_chckbxUnesiIgraca.anchor = GridBagConstraints.EAST;
		gbc_chckbxUnesiIgraca.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUnesiIgraca.gridx = 0;
		gbc_chckbxUnesiIgraca.gridy = 3;
		pnlCenter.add(chckbxUnesiIgraca, gbc_chckbxUnesiIgraca);
		
		txtUnetiIgrac = new JTextField();
		txtUnetiIgrac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlmIgraci.addElement(txtUnetiIgrac.getText());
					txtUnetiIgrac.setText("");
				}
			}
		});
		txtUnetiIgrac.setEnabled(false);
		GridBagConstraints gbc_txtUnetiIgrac = new GridBagConstraints();
		gbc_txtUnetiIgrac.insets = new Insets(0, 0, 5, 5);
		gbc_txtUnetiIgrac.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUnetiIgrac.gridx = 1;
		gbc_txtUnetiIgrac.gridy = 3;
		pnlCenter.add(txtUnetiIgrac, gbc_txtUnetiIgrac);
		txtUnetiIgrac.setColumns(10);
		
		JLabel lblIgraci = new JLabel("Igraci:");
		GridBagConstraints gbc_lblIgraci = new GridBagConstraints();
		gbc_lblIgraci.anchor = GridBagConstraints.EAST;
		gbc_lblIgraci.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgraci.gridx = 0;
		gbc_lblIgraci.gridy = 4;
		pnlCenter.add(lblIgraci, gbc_lblIgraci);
		
		JComboBox<String> cbxIgraci = new JComboBox<String> ();
		cbxIgraci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmIgraci.addElement(cbxIgraci.getSelectedItem().toString());
			}
		});
		cbxIgraci.setModel(new DefaultComboBoxModel<String> (new String[] {"Kolarov", "Matic", "Ivanovic", "Nikolic", "Peric", "Markovic"}));
		GridBagConstraints gbc_cbxIgraci = new GridBagConstraints();
		gbc_cbxIgraci.insets = new Insets(0, 0, 5, 5);
		gbc_cbxIgraci.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxIgraci.gridx = 1;
		gbc_cbxIgraci.gridy = 4;
		pnlCenter.add(cbxIgraci, gbc_cbxIgraci);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 5;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList<String> lstIgraci = new JList<String>();
		scrollPane.setViewportView(lstIgraci);
		lstIgraci.setModel(dlmIgraci);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(220, 20, 60));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Forma za unos igraca");
		pnlNorth.add(lblNaslov);
		lblNaslov.setForeground(Color.white);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(new Color(220, 20, 60));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JButton btnDodajIgraca = new JButton("Dodaj igraca");
		btnDodajIgraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DlgIgrac dlgIgrac=new DlgIgrac(); 
				dlgIgrac.setVisible(true);
				
				if(dlgIgrac.isOk) {
					dlmIgraci.addElement(dlgIgrac.txtIme.getText()+" "+dlgIgrac.txtPrezime.getText());
				}
			}
		});
		pnlSouth.add(btnDodajIgraca);
		
		JButton btnModifikujIgraca = new JButton("Modifikuj igraca");
		btnModifikujIgraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgIgrac dlgIzmena = new DlgIgrac();
				try {
					String[] split = dlmIgraci.getElementAt(lstIgraci.getSelectedIndex()).toString().split(" ");
					dlgIzmena.txtIme.setText(split[0]);
					dlgIzmena.txtPrezime.setText(split[1]);
					dlgIzmena.setVisible(true);
					if (dlgIzmena.isOk) {
						int index = lstIgraci.getSelectedIndex();
						dlmIgraci.removeElementAt(index);
						dlmIgraci.add(index,dlgIzmena.txtIme.getText() + " " + dlgIzmena.txtPrezime.getText());		
				
					}
				}  catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Morate selektovati igraca kojem je uneto i ime i prezime");
				}
			}
		});
		pnlSouth.add(btnModifikujIgraca);
		
	}

}

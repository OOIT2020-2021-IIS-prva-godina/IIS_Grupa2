package vezbe11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgIgrac extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected JTextField txtIme;
	protected JTextField txtPrezime;
	protected boolean isOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIgrac dialog = new DlgIgrac();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIgrac() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		setTitle("Unesite igraca");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(220, 20, 60));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblIme = new JLabel("Ime igraca:");
			lblIme.setForeground(new Color(255, 250, 250));
			GridBagConstraints gbc_lblIme = new GridBagConstraints();
			gbc_lblIme.insets = new Insets(0, 0, 5, 5);
			gbc_lblIme.anchor = GridBagConstraints.EAST;
			gbc_lblIme.gridx = 0;
			gbc_lblIme.gridy = 0;
			contentPanel.add(lblIme, gbc_lblIme);
		}
		{
			txtIme = new JTextField();
			GridBagConstraints gbc_txtIme = new GridBagConstraints();
			gbc_txtIme.insets = new Insets(0, 0, 5, 5);
			gbc_txtIme.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtIme.gridx = 1;
			gbc_txtIme.gridy = 0;
			contentPanel.add(txtIme, gbc_txtIme);
			txtIme.setColumns(10);
		}
		{
			JLabel lblPrezime = new JLabel("Prezime igraca:");
			lblPrezime.setForeground(new Color(255, 250, 240));
			GridBagConstraints gbc_lblPrezime = new GridBagConstraints();
			gbc_lblPrezime.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrezime.anchor = GridBagConstraints.EAST;
			gbc_lblPrezime.gridx = 2;
			gbc_lblPrezime.gridy = 0;
			contentPanel.add(lblPrezime, gbc_lblPrezime);
		}
		{
			txtPrezime = new JTextField();
			GridBagConstraints gbc_txtPrezime = new GridBagConstraints();
			gbc_txtPrezime.insets = new Insets(0, 0, 5, 5);
			gbc_txtPrezime.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPrezime.gridx = 3;
			gbc_txtPrezime.gridy = 0;
			contentPanel.add(txtPrezime, gbc_txtPrezime);
			txtPrezime.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
											
						if (txtIme.getText().isEmpty() || txtPrezime.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Morate uneti i ime i prezime igraca");
						}
						else {

							isOk=true;
							setVisible(false);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						isOk=false;
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

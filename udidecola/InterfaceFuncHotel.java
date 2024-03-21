package tcd;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceFuncHotel extends JFrame {
	private JTextField txtMenuDoFuncHotel;

	public InterfaceFuncHotel() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 49, 81, 124, 48, 75, 0 };
		gbl_panel.rowHeights = new int[] { 44, 20, 53, 23, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		txtMenuDoFuncHotel = new JTextField();
		txtMenuDoFuncHotel.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuDoFuncHotel.setText("Menu do Funcionario Especial");
		GridBagConstraints gbc_txtMenuDoFuncHotel = new GridBagConstraints();
		gbc_txtMenuDoFuncHotel.anchor = GridBagConstraints.NORTH;
		gbc_txtMenuDoFuncHotel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMenuDoFuncHotel.insets = new Insets(0, 0, 5, 0);
		gbc_txtMenuDoFuncHotel.gridwidth = 4;
		gbc_txtMenuDoFuncHotel.gridx = 1;
		gbc_txtMenuDoFuncHotel.gridy = 1;
		panel.add(txtMenuDoFuncHotel, gbc_txtMenuDoFuncHotel);
		txtMenuDoFuncHotel.setColumns(10);

		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnCadastro = new GridBagConstraints();
		gbc_btnCadastro.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnCadastro.insets = new Insets(0, 0, 0, 5);
		gbc_btnCadastro.gridx = 2;
		gbc_btnCadastro.gridy = 3;
		panel.add(btnCadastro, gbc_btnCadastro);
	}
}

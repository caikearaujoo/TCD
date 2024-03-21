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

public class InterfaceFuncionario extends JFrame {
	private JTextField txtMenuDoFuncionario;

	public InterfaceFuncionario() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 49, 81, 124, 48, 75, 0 };
		gbl_panel.rowHeights = new int[] { 44, 20, 53, 23, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		txtMenuDoFuncionario = new JTextField();
		txtMenuDoFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuDoFuncionario.setText("Menu do Funcionario");
		GridBagConstraints gbc_txtMenuDoFuncionario = new GridBagConstraints();
		gbc_txtMenuDoFuncionario.anchor = GridBagConstraints.NORTH;
		gbc_txtMenuDoFuncionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMenuDoFuncionario.insets = new Insets(0, 0, 5, 0);
		gbc_txtMenuDoFuncionario.gridwidth = 4;
		gbc_txtMenuDoFuncionario.gridx = 1;
		gbc_txtMenuDoFuncionario.gridy = 1;
		panel.add(txtMenuDoFuncionario, gbc_txtMenuDoFuncionario);
		txtMenuDoFuncionario.setColumns(10);

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

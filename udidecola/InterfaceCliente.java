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

public class InterfaceCliente extends JFrame {
	private JTextField txtMenuDoCliente;
	public InterfaceCliente() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{49, 81, 124, 48, 75, 0};
		gbl_panel.rowHeights = new int[]{44, 20, 53, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtMenuDoCliente = new JTextField();
		txtMenuDoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuDoCliente.setText("Menu do Cliente");
		GridBagConstraints gbc_txtMenuDoCliente = new GridBagConstraints();
		gbc_txtMenuDoCliente.anchor = GridBagConstraints.NORTH;
		gbc_txtMenuDoCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMenuDoCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtMenuDoCliente.gridwidth = 4;
		gbc_txtMenuDoCliente.gridx = 1;
		gbc_txtMenuDoCliente.gridy = 1;
		panel.add(txtMenuDoCliente, gbc_txtMenuDoCliente);
		txtMenuDoCliente.setColumns(10);
		
		JButton btnCadastro = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastro = new GridBagConstraints();
		gbc_btnCadastro.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCadastro.insets = new Insets(0, 0, 0, 5);
		gbc_btnCadastro.gridx = 1;
		gbc_btnCadastro.gridy = 3;
		panel.add(btnCadastro, gbc_btnCadastro);
		
		JButton btnConsulta = new JButton("Consultar");
		GridBagConstraints gbc_btnConsulta = new GridBagConstraints();
		gbc_btnConsulta.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnConsulta.insets = new Insets(0, 0, 0, 5);
		gbc_btnConsulta.gridx = 2;
		gbc_btnConsulta.gridy = 3;
		panel.add(btnConsulta, gbc_btnConsulta);
		
		JButton btnRemove = new JButton("Remover");
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRemove.gridx = 4;
		gbc_btnRemove.gridy = 3;
		panel.add(btnRemove, gbc_btnRemove);
	}
	
}

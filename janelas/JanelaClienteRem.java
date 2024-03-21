package janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JanelaClienteRem extends JFrame {
	private JTextField textFieldNome;

	public JanelaClienteRem() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Remover cliente");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblCpf = new JLabel("Digite o CPF do cliente:");
		lblCpf.setBounds(24, 48, 138, 14);
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblCpf);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(143, 45, 267, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 84, 89, 23);
		panel.add(btnFinalizar);
	}
}

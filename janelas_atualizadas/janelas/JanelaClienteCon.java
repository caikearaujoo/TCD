package janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import tratadores.TrataBotaoClienteCon;

import javax.swing.JLabel;
import javax.swing.JButton;

public class JanelaClienteCon extends JFrame {
	private JTextField textFieldNome;

	public JanelaClienteCon() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Buscar cliente");
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
		TrataBotaoClienteCon tratador = new TrataBotaoClienteCon(btnFinalizar, this);
		btnFinalizar.addActionListener(tratador);
		btnFinalizar.setBounds(321, 85, 89, 23);
		btnFinalizar.addActionListener(tratador);
		panel.add(btnFinalizar);
	}
}
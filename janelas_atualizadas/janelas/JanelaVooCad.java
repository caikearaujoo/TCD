package janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JanelaVooCad extends JFrame {
	private JTextField textFieldCheg;
	private JTextField textFieldVaga;
	private JTextField textFieldPreco;
	private JTextField textFieldSaida;
	private JTextField textFieldData;

	public JanelaVooCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações do Voo");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblData = new JLabel("Data do voo:");
		lblData.setBounds(24, 48, 77, 14);
		lblData.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblData);

		JLabel lblCheg = new JLabel("Horário de chegada:");
		lblCheg.setBounds(24, 98, 104, 14);
		panel.add(lblCheg);

		textFieldCheg = new JTextField();
		textFieldCheg.setBounds(127, 95, 89, 20);
		panel.add(textFieldCheg);
		textFieldCheg.setColumns(10);

		textFieldVaga = new JTextField();
		textFieldVaga.setBounds(164, 120, 54, 20);
		panel.add(textFieldVaga);
		textFieldVaga.setColumns(10);

		JLabel lblVaga = new JLabel("Nº de assentos disponíveis:");
		lblVaga.setBounds(24, 123, 137, 14);
		panel.add(lblVaga);

		JLabel lblPreco = new JLabel("Valor da passagem:");
		lblPreco.setBounds(24, 148, 104, 14);
		panel.add(lblPreco);

		textFieldPreco = new JTextField();
		textFieldPreco.setColumns(10);
		textFieldPreco.setBounds(127, 145, 77, 20);
		panel.add(textFieldPreco);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 226, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel lblSaida = new JLabel("Horário de saída:");
		lblSaida.setHorizontalAlignment(SwingConstants.LEFT);
		lblSaida.setBounds(24, 73, 104, 14);
		panel.add(lblSaida);
		
		textFieldSaida = new JTextField();
		textFieldSaida.setColumns(10);
		textFieldSaida.setBounds(115, 70, 89, 20);
		panel.add(textFieldSaida);
		
		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(94, 45, 89, 20);
		panel.add(textFieldData);
	}
}
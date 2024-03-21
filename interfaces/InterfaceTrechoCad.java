package interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class InterfaceTrechoCad extends JFrame {
	private JTextField textFieldCod;
	private JTextField textFieldDest;
	private JTextField textFieldSaida;
	private JTextField textFieldComp;
	private JTextField textFieldCheg;
	private JTextField textFieldOrigem;

	public InterfaceTrechoCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações do Trecho");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblCod = new JLabel("Código do trecho:");
		lblCod.setBounds(24, 48, 89, 14);
		lblCod.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblCod);

		textFieldCod = new JTextField();
		textFieldCod.setBounds(118, 45, 98, 20);
		panel.add(textFieldCod);
		textFieldCod.setColumns(10);

		JLabel lblDest = new JLabel("Destino:");
		lblDest.setBounds(237, 73, 59, 14);
		panel.add(lblDest);

		textFieldDest = new JTextField();
		textFieldDest.setBounds(285, 70, 125, 20);
		panel.add(textFieldDest);
		textFieldDest.setColumns(10);

		textFieldSaida = new JTextField();
		textFieldSaida.setBounds(116, 95, 90, 20);
		panel.add(textFieldSaida);
		textFieldSaida.setColumns(10);

		JLabel lblSaida = new JLabel("Horário de saída:");
		lblSaida.setBounds(24, 98, 82, 14);
		panel.add(lblSaida);

		JLabel lblCheg = new JLabel("Horário de chegada:");
		lblCheg.setBounds(216, 98, 98, 14);
		panel.add(lblCheg);

		JLabel lblComp = new JLabel("Companhia aérea:");
		lblComp.setBounds(24, 123, 89, 14);
		panel.add(lblComp);

		textFieldComp = new JTextField();
		textFieldComp.setBounds(118, 120, 191, 20);
		panel.add(textFieldComp);
		textFieldComp.setColumns(10);

		textFieldCheg = new JTextField();
		textFieldCheg.setColumns(10);
		textFieldCheg.setBounds(320, 95, 90, 20);
		panel.add(textFieldCheg);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 159, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel lblOrigem = new JLabel("Origem:");
		lblOrigem.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrigem.setBounds(24, 73, 41, 14);
		panel.add(lblOrigem);
		
		textFieldOrigem = new JTextField();
		textFieldOrigem.setColumns(10);
		textFieldOrigem.setBounds(71, 70, 125, 20);
		panel.add(textFieldOrigem);
	}
}

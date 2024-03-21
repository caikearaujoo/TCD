package janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class JanelaQuartoCad extends JFrame {
	private JTextField textFieldDiariaSemDes;
	private JTextField textFieldDes;
	private JTextField textFieldQnt;

	public JanelaQuartoCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações do Quarto");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblDiariaSemDes = new JLabel("Valor da diária:");
		lblDiariaSemDes.setBounds(24, 48, 77, 14);
		lblDiariaSemDes.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblDiariaSemDes);

		textFieldDiariaSemDes = new JTextField();
		textFieldDiariaSemDes.setBounds(106, 45, 77, 20);
		panel.add(textFieldDiariaSemDes);
		textFieldDiariaSemDes.setColumns(10);

		JLabel lblQnt = new JLabel("Quantidade:");
		lblQnt.setHorizontalAlignment(SwingConstants.LEFT);
		lblQnt.setBounds(24, 98, 66, 14);
		panel.add(lblQnt);

		JLabel lblTipo = new JLabel("Tipo de quarto:");
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipo.setBounds(24, 123, 77, 14);
		panel.add(lblTipo);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 226, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel lblDes = new JLabel("Valor do desconto:");
		lblDes.setHorizontalAlignment(SwingConstants.LEFT);
		lblDes.setBounds(24, 73, 96, 14);
		panel.add(lblDes);
		
		textFieldDes = new JTextField();
		textFieldDes.setColumns(10);
		textFieldDes.setBounds(126, 70, 77, 20);
		panel.add(textFieldDes);
		
		textFieldQnt = new JTextField();
		textFieldQnt.setColumns(10);
		textFieldQnt.setBounds(93, 95, 77, 20);
		panel.add(textFieldQnt);
		
		// não sei como tirar os warnings dessa parte
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(103, 119, 100, 22);
		panel.add(comboBox);
		comboBox.addItem("Single");
		comboBox.addItem("Duplo");
		comboBox.addItem("Triplo");
		comboBox.addItem("Luxo");
		
	}
}

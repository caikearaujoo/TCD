package interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class InterfaceCompanhiaAereaCad extends JFrame {
	private JTextField textFieldNomeOf;
	private JTextField textFieldLog;
	private JTextField textFieldBar;
	private JTextField textFieldNum;
	private JTextField textFieldUf;
	private JTextField textFieldNasc;
	private JTextField textFieldCid;
	private JTextField textFieldCep;
	private JTextField textFieldNomeDiv;
	private JTextField textFieldCnpj;

	public InterfaceCompanhiaAereaCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações da Companhia Aérea");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblNomeOf = new JLabel("Nome oficial:");
		lblNomeOf.setBounds(24, 48, 77, 14);
		lblNomeOf.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNomeOf);

		textFieldNomeOf = new JTextField();
		textFieldNomeOf.setBounds(93, 45, 317, 20);
		panel.add(textFieldNomeOf);
		textFieldNomeOf.setColumns(10);

		JLabel lblLog = new JLabel("Logradouro:");
		lblLog.setBounds(24, 98, 59, 14);
		panel.add(lblLog);

		textFieldLog = new JTextField();
		textFieldLog.setBounds(93, 95, 215, 20);
		panel.add(textFieldLog);
		textFieldLog.setColumns(10);

		JLabel lblNum = new JLabel("Número:");
		lblNum.setBounds(319, 98, 41, 14);
		panel.add(lblNum);

		textFieldBar = new JTextField();
		textFieldBar.setBounds(66, 120, 104, 20);
		panel.add(textFieldBar);
		textFieldBar.setColumns(10);

		JLabel lblBar = new JLabel("Bairro:");
		lblBar.setBounds(24, 123, 32, 14);
		panel.add(lblBar);

		JLabel lblCid = new JLabel("Cidade:");
		lblCid.setBounds(179, 123, 37, 14);
		panel.add(lblCid);

		textFieldNum = new JTextField();
		textFieldNum.setBounds(369, 95, 41, 20);
		panel.add(textFieldNum);
		textFieldNum.setColumns(10);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(343, 123, 17, 14);
		panel.add(lblUf);

		textFieldUf = new JTextField();
		textFieldUf.setBounds(369, 120, 41, 20);
		panel.add(textFieldUf);
		textFieldUf.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(24, 148, 23, 14);
		panel.add(lblCep);

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(171, 148, 32, 14);
		panel.add(lblCnpj);

		JLabel lblCria = new JLabel("Data de criação:");
		lblCria.setBounds(24, 173, 89, 14);
		panel.add(lblCria);

		textFieldNasc = new JTextField();
		textFieldNasc.setBounds(110, 170, 104, 20);
		panel.add(textFieldNasc);
		textFieldNasc.setColumns(10);

		textFieldCid = new JTextField();
		textFieldCid.setColumns(10);
		textFieldCid.setBounds(226, 120, 107, 20);
		panel.add(textFieldCid);

		textFieldCep = new JTextField();
		textFieldCep.setColumns(10);
		textFieldCep.setBounds(57, 145, 104, 20);
		panel.add(textFieldCep);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 226, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel lblNomeDiv = new JLabel("Nome de divulgação:");
		lblNomeDiv.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDiv.setBounds(24, 73, 104, 14);
		panel.add(lblNomeDiv);
		
		textFieldNomeDiv = new JTextField();
		textFieldNomeDiv.setColumns(10);
		textFieldNomeDiv.setBounds(133, 70, 277, 20);
		panel.add(textFieldNomeDiv);
		
		textFieldCnpj = new JTextField();
		textFieldCnpj.setColumns(10);
		textFieldCnpj.setBounds(204, 145, 104, 20);
		panel.add(textFieldCnpj);
	}
}

package janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JanelaFuncHotelCad extends JFrame {
	private JTextField textFieldNome;
	private JTextField textFieldLog;
	private JTextField textFieldBar;
	private JTextField textFieldNum;
	private JTextField textFieldUf;
	private JTextField textFieldNasc;
	private JTextField textFieldCid;
	private JTextField textFieldCep;
	private JTextField textFieldCpf;
	private JTextField textFieldTrab;
	private JTextField textFieldBonus;

	public JanelaFuncHotelCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações pessoais");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(24, 11, 386, 26);
		panel.add(lblInfo);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(24, 48, 31, 14);
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNome);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(65, 45, 345, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblLog = new JLabel("Logradouro:");
		lblLog.setBounds(24, 73, 59, 14);
		panel.add(lblLog);

		textFieldLog = new JTextField();
		textFieldLog.setBounds(93, 70, 215, 20);
		panel.add(textFieldLog);
		textFieldLog.setColumns(10);

		JLabel lblNum = new JLabel("Número:");
		lblNum.setBounds(318, 73, 41, 14);
		panel.add(lblNum);

		textFieldBar = new JTextField();
		textFieldBar.setBounds(65, 95, 104, 20);
		panel.add(textFieldBar);
		textFieldBar.setColumns(10);

		JLabel lblBar = new JLabel("Bairro:");
		lblBar.setBounds(24, 98, 32, 14);
		panel.add(lblBar);

		JLabel lblCid = new JLabel("Cidade:");
		lblCid.setBounds(179, 98, 37, 14);
		panel.add(lblCid);

		textFieldNum = new JTextField();
		textFieldNum.setBounds(369, 70, 41, 20);
		panel.add(textFieldNum);
		textFieldNum.setColumns(10);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(343, 98, 17, 14);
		panel.add(lblUf);

		textFieldUf = new JTextField();
		textFieldUf.setBounds(369, 95, 41, 20);
		panel.add(textFieldUf);
		textFieldUf.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(24, 123, 23, 14);
		panel.add(lblCep);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(171, 123, 23, 14);
		panel.add(lblCpf);

		JLabel lblNasc = new JLabel("Data de nascimento:");
		lblNasc.setBounds(24, 148, 99, 14);
		panel.add(lblNasc);

		textFieldNasc = new JTextField();
		textFieldNasc.setBounds(133, 145, 104, 20);
		panel.add(textFieldNasc);
		textFieldNasc.setColumns(10);

		textFieldCid = new JTextField();
		textFieldCid.setColumns(10);
		textFieldCid.setBounds(226, 95, 107, 20);
		panel.add(textFieldCid);

		textFieldCep = new JTextField();
		textFieldCep.setColumns(10);
		textFieldCep.setBounds(57, 120, 104, 20);
		panel.add(textFieldCep);

		textFieldCpf = new JTextField();
		textFieldCpf.setColumns(10);
		textFieldCpf.setBounds(204, 120, 104, 20);
		panel.add(textFieldCpf);

		JButton btnFinalizar = new JButton("Concluído");
		btnFinalizar.setBounds(321, 226, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel lblTrab = new JLabel("Carteira de trabalho:");
		lblTrab.setBounds(24, 173, 104, 14);
		panel.add(lblTrab);
		
		textFieldTrab = new JTextField();
		textFieldTrab.setColumns(10);
		textFieldTrab.setBounds(133, 170, 104, 20);
		panel.add(textFieldTrab);
		
		JLabel lblBonus = new JLabel("Bônus salarial:");
		lblBonus.setBounds(24, 198, 69, 14);
		panel.add(lblBonus);
		
		textFieldBonus = new JTextField();
		textFieldBonus.setColumns(10);
		textFieldBonus.setBounds(99, 195, 62, 20);
		panel.add(textFieldBonus);
	}
}

package janelas;

import tratadores.TrataBotaoHotelCad;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import tratadores.TrataBotaoHotel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class JanelaHotelCad extends JFrame {
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
	private JTextField textFieldEst;
	private JTextField textFieldQuarto;
	private JTextField textFieldCin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public JanelaHotelCad() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblInfo = new JLabel("Informações do Hotel");
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
		TrataBotaoHotelCad tratador = new TrataBotaoHotelCad(btnFinalizar, this);
		btnFinalizar.addActionListener(tratador);
		btnFinalizar.setBounds(321, 283, 89, 23);
		btnFinalizar.addActionListener(tratador);
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
		
		JLabel lblEstrelas = new JLabel("Estrelas:");
		lblEstrelas.setBounds(224, 173, 46, 14);
		panel.add(lblEstrelas);
		
		textFieldEst = new JTextField();
		textFieldEst.setBounds(274, 170, 32, 20);
		panel.add(textFieldEst);
		textFieldEst.setColumns(10);
		
		JLabel lblQuarto = new JLabel("Nº Quartos:");
		lblQuarto.setBounds(316, 173, 67, 14);
		panel.add(lblQuarto);
		
		textFieldQuarto = new JTextField();
		textFieldQuarto.setColumns(10);
		textFieldQuarto.setBounds(378, 170, 32, 20);
		panel.add(textFieldQuarto);
		
		JLabel lblCin = new JLabel("Check-In:");
		lblCin.setBounds(24, 198, 52, 14);
		panel.add(lblCin);
		
		textFieldCin = new JTextField();
		textFieldCin.setColumns(10);
		textFieldCin.setBounds(75, 195, 52, 20);
		panel.add(textFieldCin);
		
		JLabel lblCout = new JLabel("Check-Out:");
		lblCout.setBounds(133, 198, 59, 14);
		panel.add(lblCout);
		
		JCheckBox chckbxAcePet = new JCheckBox("Hotel Pet Friendly");
		chckbxAcePet.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxAcePet.setBounds(264, 194, 146, 23);
		panel.add(chckbxAcePet);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(192, 195, 52, 20);
		panel.add(textField);
		
		JLabel lblDiv = new JLabel("Mensagem de divulgação:");
		lblDiv.setBounds(24, 223, 124, 14);
		panel.add(lblDiv);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 220, 252, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDesc = new JLabel("Descrição:");
		lblDesc.setBounds(24, 248, 52, 14);
		panel.add(lblDesc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 245, 326, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
package janelas;

import tratadores.TrataBotaoFuncionario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class JanelaFuncionario extends JFrame {
	public JanelaFuncionario() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu do Funcionario");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(10, 30, 414, 33);
		panel.add(lblMenu);
		
		JanelaFuncionarioCad janelaFuncionarioCad = new JanelaFuncionarioCad();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		TrataBotaoFuncionario tratador = new TrataBotaoFuncionario(btnCadastrar, janelaFuncionarioCad, this);
		btnCadastrar.addActionListener(tratador);
		btnCadastrar.setBounds(175, 107, 81, 23);
		btnCadastrar.addActionListener(tratador);
		panel.add(btnCadastrar);
	}
	
}
package janelas;

import tratadores.TrataBotaoTrecho;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class JanelaTrecho extends JFrame {
	public JanelaTrecho() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu do Trecho");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(10, 30, 414, 33);
		panel.add(lblMenu);
		
		JanelaTrechoCad janelaTrechoCad = new JanelaTrechoCad();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		TrataBotaoTrecho tratador = new TrataBotaoTrecho(btnCadastrar, janelaTrechoCad, this);
		btnCadastrar.addActionListener(tratador);
		btnCadastrar.setBounds(175, 107, 81, 23);
		btnCadastrar.addActionListener(tratador);
		panel.add(btnCadastrar);
	}
	
}
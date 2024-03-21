package janelas;

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
		
		JLabel lblMenu = new JLabel("Menu de Trecho");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(10, 30, 414, 33);
		panel.add(lblMenu);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(175, 107, 81, 23);
		panel.add(btnCadastrar);
	}
}

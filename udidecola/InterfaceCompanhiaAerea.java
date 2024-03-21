
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class InterfaceCompanhiaAerea extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtMenuDoHotel;
	public InterfaceCompanhiaAerea() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{49, 81, 124, 48, 75, 0};
		gbl_panel.rowHeights = new int[]{44, 20, 53, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtMenuDoHotel = new JTextField();
		txtMenuDoHotel.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuDoHotel.setText("Menu do Hotel");
		GridBagConstraints gbc_txtMenuDoHotel = new GridBagConstraints();
		gbc_txtMenuDoHotel.anchor = GridBagConstraints.NORTH;
		gbc_txtMenuDoHotel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMenuDoHotel.insets = new Insets(0, 0, 5, 0);
		gbc_txtMenuDoHotel.gridwidth = 4;
		gbc_txtMenuDoHotel.gridx = 1;
		gbc_txtMenuDoHotel.gridy = 1;
		panel.add(txtMenuDoHotel, gbc_txtMenuDoHotel);
		txtMenuDoHotel.setColumns(10);
		
		JButton btnCadastro = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastro = new GridBagConstraints();
		gbc_btnCadastro.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCadastro.insets = new Insets(0, 0, 0, 5);
		gbc_btnCadastro.gridx = 1;
		gbc_btnCadastro.gridy = 3;
		panel.add(btnCadastro, gbc_btnCadastro);
		
		JButton btnConsulta = new JButton("Consultar");
		GridBagConstraints gbc_btnConsulta = new GridBagConstraints();
		gbc_btnConsulta.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnConsulta.insets = new Insets(0, 0, 0, 5);
		gbc_btnConsulta.gridx = 2;
		gbc_btnConsulta.gridy = 3;
		panel.add(btnConsulta, gbc_btnConsulta);
		
		JButton btnRemove = new JButton("Remover");
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRemove.gridx = 4;
		gbc_btnRemove.gridy = 3;
		panel.add(btnRemove, gbc_btnRemove);
	}
	
}

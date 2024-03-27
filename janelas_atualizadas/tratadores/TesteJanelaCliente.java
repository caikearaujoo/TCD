package tratadores;

import javax.swing.JFrame;
import janelas.JanelaCliente;
import janelas.JanelaClienteCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaCliente {
    public static void main(String[] args) {
        // Crie uma instância da JanelaCliente
        JanelaCliente janelaCliente = new JanelaCliente();

        // Configurar a janela
        janelaCliente.setTitle("Teste da Janela do Cliente");
        janelaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaCliente.setSize(450, 350);
        janelaCliente.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaCliente.setVisible(true); // Exibir a janela
    }
}
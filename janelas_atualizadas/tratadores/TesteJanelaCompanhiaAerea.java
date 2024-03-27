package tratadores;

import javax.swing.JFrame;
import janelas.JanelaCompanhiaAerea;
import janelas.JanelaCompanhiaAereaCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaCompanhiaAerea {
    public static void main(String[] args) {
        // Crie uma instância da JanelaCompanhiaAerea
        JanelaCompanhiaAerea janelaCompanhiaAerea = new JanelaCompanhiaAerea();

        // Configurar a janela
        janelaCompanhiaAerea.setTitle("Teste da Janela do CompanhiaAerea");
        janelaCompanhiaAerea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaCompanhiaAerea.setSize(450, 350);
        janelaCompanhiaAerea.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaCompanhiaAerea.setVisible(true); // Exibir a janela
    }
}
package tratadores;

import javax.swing.JFrame;
import janelas.JanelaVoo;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaVoo {
    public static void main(String[] args) {
        // Crie uma instância da JanelaHotel
        JanelaVoo JanelaVoo = new JanelaVoo();

        // Configurar a janela
        JanelaVoo.setTitle("Teste da Janela do Hotel");
        JanelaVoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JanelaVoo.setSize(450, 350);
        JanelaVoo.setLocationRelativeTo(null); // Centraliza a janela na tela
        JanelaVoo.setVisible(true); // Exibir a janela
    }
}
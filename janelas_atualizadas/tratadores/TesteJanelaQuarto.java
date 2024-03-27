package tratadores;

import javax.swing.JFrame;
import janelas.JanelaQuarto;
import janelas.JanelaQuartoCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaQuarto {
    public static void main(String[] args) {
        // Crie uma instância da JanelaQuarto
        JanelaQuarto janelaQuarto = new JanelaQuarto();

        // Configurar a janela
        janelaQuarto.setTitle("Teste da Janela do Quarto");
        janelaQuarto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaQuarto.setSize(450, 350);
        janelaQuarto.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaQuarto.setVisible(true); // Exibir a janela
    }
}
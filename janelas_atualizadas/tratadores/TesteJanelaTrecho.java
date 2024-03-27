package tratadores;

import javax.swing.JFrame;
import janelas.JanelaTrecho;
import janelas.JanelaTrechoCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaTrecho {
    public static void main(String[] args) {
        // Crie uma instância da JanelaTrecho
        JanelaTrecho janelaTrecho = new JanelaTrecho();

        // Configurar a janela
        janelaTrecho.setTitle("Teste da Janela do Trecho");
        janelaTrecho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaTrecho.setSize(450, 350);
        janelaTrecho.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaTrecho.setVisible(true); // Exibir a janela
    }
}
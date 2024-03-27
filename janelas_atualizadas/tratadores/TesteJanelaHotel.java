package tratadores;

import javax.swing.JFrame;
import janelas.JanelaHotel;
import janelas.JanelaHotelCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaHotel {
    public static void main(String[] args) {
        // Crie uma instância da JanelaHotel
        JanelaHotel janelaHotel = new JanelaHotel();

        // Configurar a janela
        janelaHotel.setTitle("Teste da Janela do Hotel");
        janelaHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaHotel.setSize(450, 350);
        janelaHotel.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaHotel.setVisible(true); // Exibir a janela
    }
}
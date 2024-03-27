package tratadores;

import javax.swing.JFrame;
import janelas.JanelaFuncHotel;
import janelas.JanelaFuncHotelCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaFuncHotel {
    public static void main(String[] args) {
        // Crie uma instância da JanelaFuncHotel
        JanelaFuncHotel janelaFuncHotel = new JanelaFuncHotel();

        // Configurar a janela
        janelaFuncHotel.setTitle("Teste da Janela do FuncHotel");
        janelaFuncHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFuncHotel.setSize(450, 350);
        janelaFuncHotel.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaFuncHotel.setVisible(true); // Exibir a janela
    }
}
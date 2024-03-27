package tratadores;

import javax.swing.JFrame;
import janelas.JanelaFuncionario;
import janelas.JanelaFuncionarioCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TesteJanelaFuncionario {
    public static void main(String[] args) {
        // Crie uma instância da JanelaFuncionario
        JanelaFuncionario janelaFuncionario = new JanelaFuncionario();

        // Configurar a janela
        janelaFuncionario.setTitle("Teste da Janela do Funcionario");
        janelaFuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFuncionario.setSize(450, 350);
        janelaFuncionario.setLocationRelativeTo(null); // Centraliza a janela na tela
        janelaFuncionario.setVisible(true); // Exibir a janela
    }
}
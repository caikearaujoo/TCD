package tratadores;

import janelas.JanelaCliente;
import janelas.JanelaClienteCad;
import janelas.JanelaClienteRem;
import janelas.JanelaClienteCon;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoCliente implements ActionListener{
    private JanelaClienteCad janelaClienteCad;
    private JanelaCliente janelaCliente;
    private JanelaClienteCon janelaClienteCon;
    private JanelaClienteRem janelaClienteRem;
    private JButton botao1;
    private JLabel label;
    public TrataBotaoCliente(JButton botao1, JanelaClienteCad janelaClienteCad, JanelaCliente janelaCliente,JanelaClienteCon janelaClienteCon, JanelaClienteRem janelaClienteRem ) {
        this.botao1 = botao1;
        this.janelaClienteCad = janelaClienteCad;
        this.janelaCliente = janelaCliente;
        this.janelaClienteCon = janelaClienteCon;
        this.janelaClienteRem = janelaClienteRem;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaClienteCad.setSize(450, 350);
            janelaClienteCad.setLocationRelativeTo(null); // Centraliza a janela na tela
            janelaClienteCad.setVisible(true);
            janelaCliente.dispose();
        }
    }
}
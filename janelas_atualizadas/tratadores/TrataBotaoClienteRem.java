package tratadores;

import janelas.JanelaClienteRem;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoClienteRem implements ActionListener{
    private JanelaClienteRem janelaClienteRem;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoClienteRem(JButton botao1, JanelaClienteRem janelaClienteRem) {
        this.botao1 = botao1;
        this.janelaClienteRem = janelaClienteRem;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaClienteRem.dispose();
        }
    }
}
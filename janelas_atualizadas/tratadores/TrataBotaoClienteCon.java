package tratadores;

import janelas.JanelaClienteCon;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoClienteCon implements ActionListener{
    private JanelaClienteCon janelaClienteCon;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoClienteCon(JButton botao1, JanelaClienteCon janelaClienteCon) {
        this.botao1 = botao1;
        this.janelaClienteCon = janelaClienteCon;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaClienteCon.dispose();
        }
    }
}
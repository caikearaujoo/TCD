package tratadores;

import janelas.JanelaClienteCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoClienteCad implements ActionListener{
    private JanelaClienteCad janelaClienteCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoClienteCad(JButton botao1, JanelaClienteCad janelaClienteCad) {
        this.botao1 = botao1;
        this.janelaClienteCad = janelaClienteCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaClienteCad.dispose();
        }
    }
}
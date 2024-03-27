package tratadores;

import janelas.JanelaQuartoCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoQuartoCad implements ActionListener{
    private JanelaQuartoCad janelaQuartoCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoQuartoCad(JButton botao1, JanelaQuartoCad janelaQuartoCad) {
        this.botao1 = botao1;
        this.janelaQuartoCad = janelaQuartoCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaQuartoCad.dispose();
        }
    }
}
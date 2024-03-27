package tratadores;

import janelas.JanelaVooCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoVooCad implements ActionListener{
    private JanelaVooCad janelaVooCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoVooCad(JButton botao1, JanelaVooCad janelaVooCad) {
        this.botao1 = botao1;
        this.janelaVooCad = janelaVooCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaVooCad.dispose();
        }
    }
}
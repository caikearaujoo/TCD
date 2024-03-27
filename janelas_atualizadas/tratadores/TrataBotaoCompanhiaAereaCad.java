package tratadores;

import janelas.JanelaCompanhiaAereaCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoCompanhiaAereaCad implements ActionListener{
    private JanelaCompanhiaAereaCad janelaCompanhiaAereaCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoCompanhiaAereaCad(JButton botao1, JanelaCompanhiaAereaCad janelaCompanhiaAereaCad) {
        this.botao1 = botao1;
        this.janelaCompanhiaAereaCad = janelaCompanhiaAereaCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaCompanhiaAereaCad.dispose();
        }
    }
}
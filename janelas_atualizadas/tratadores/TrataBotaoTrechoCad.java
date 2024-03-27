package tratadores;

import janelas.JanelaTrechoCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoTrechoCad implements ActionListener{
    private JanelaTrechoCad janelaTrechoCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoTrechoCad(JButton botao1, JanelaTrechoCad janelaTrechoCad) {
        this.botao1 = botao1;
        this.janelaTrechoCad = janelaTrechoCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaTrechoCad.dispose();
        }
    }
}
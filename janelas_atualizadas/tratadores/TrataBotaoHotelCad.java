package tratadores;

import janelas.JanelaHotelCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoHotelCad implements ActionListener{
    private JanelaHotelCad janelaHotelCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoHotelCad(JButton botao1, JanelaHotelCad janelaHotelCad) {
        this.botao1 = botao1;
        this.janelaHotelCad = janelaHotelCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaHotelCad.dispose();
        }
    }
}
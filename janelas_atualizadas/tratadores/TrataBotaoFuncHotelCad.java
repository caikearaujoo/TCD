package tratadores;

import janelas.JanelaFuncHotelCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoFuncHotelCad implements ActionListener{
    private JanelaFuncHotelCad janelaFuncHotelCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoFuncHotelCad(JButton botao1, JanelaFuncHotelCad janelaFuncHotelCad) {
        this.botao1 = botao1;
        this.janelaFuncHotelCad = janelaFuncHotelCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaFuncHotelCad.dispose();
        }
    }
}
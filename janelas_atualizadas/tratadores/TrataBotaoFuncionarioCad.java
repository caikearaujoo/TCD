package tratadores;

import janelas.JanelaFuncionarioCad;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TrataBotaoFuncionarioCad implements ActionListener{
    private JanelaFuncionarioCad janelaFuncionarioCad;
    private JButton botao1;
    private JLabel label;
    
    public TrataBotaoFuncionarioCad(JButton botao1, JanelaFuncionarioCad janelaFuncionarioCad) {
        this.botao1 = botao1;
        this.janelaFuncionarioCad = janelaFuncionarioCad;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            janelaFuncionarioCad.dispose();
        }
    }
}
package view;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {
    public Botao(String texto, Color cor){
        setText(texto);
        setFont(new Font("courier",Font.PLAIN,25));
        setOpaque(true);
        setBackground(cor); // Cor do botão
        setForeground(Color.WHITE);// Cor da Fonte
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Cor da borda
    }
}

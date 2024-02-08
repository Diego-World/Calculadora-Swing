package view;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private JLabel label;

    public Display(){
        setBackground(new Color(46,49,50));
        label = new JLabel("123");
        label.setForeground(Color.WHITE); // Cor do text label
        label.setFont(new Font("courier",Font.PLAIN,25));
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));

        add(label);
    }
}

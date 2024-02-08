package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora(){

        organizarLayout();
        setSize(245,349);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

    }

    private void organizarLayout() {
        setLayout(new BorderLayout());
        Display display = new Display();
        display.setPreferredSize(new Dimension(245,60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}

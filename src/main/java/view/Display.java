package view;

import model.Memoria;
import model.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private JLabel label;

    public Display(){
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46,49,50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE); // Cor do text label
        label.setFont(new Font("courier",Font.PLAIN,25));
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}

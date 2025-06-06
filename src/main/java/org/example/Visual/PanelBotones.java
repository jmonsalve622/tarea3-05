package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel implements ActionListener {
    private JButton button6;

    public PanelBotones(){
        setPreferredSize(new Dimension(1200, 100));
        setBackground(Color.GREEN);
        setLayout(null);

        button6 = new JButton("6");
        button6.setBounds(50, 500, 100, 50);
        button6.addActionListener(this);

        this.add(button6);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button6) {
            System.out.println("Botón 6 presionado");
        }
    }
}

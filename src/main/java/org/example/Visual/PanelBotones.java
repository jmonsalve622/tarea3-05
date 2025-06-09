package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel {

    /*
    Este panel solamente crea una zona verde donde se podra dejar posicionados los botones.
     */
    public PanelBotones(){
        setPreferredSize(new Dimension(1200, 100));
        setBackground(Color.GREEN);
        setLayout(null);

    }

}

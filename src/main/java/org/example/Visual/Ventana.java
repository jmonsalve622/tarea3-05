package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/*
Aca es donde se crea la ventana con los paneles que se agregaron anteriormente en el PanelPrincipal.
 */
public class Ventana extends JFrame {
    private PanelPrincipal dp;

    public Ventana() {
        super();
        dp = new PanelPrincipal();

        this.setTitle("Simulador de Expendedor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        this.add(dp);
        this.pack();
        this.setResizable(false);

        this.setVisible(true);

    }
}
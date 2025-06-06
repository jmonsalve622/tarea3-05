package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal dp;
    private PanelDeposito de;
    public Ventana() {
        super();
        dp = new PanelPrincipal();
        de = new PanelDeposito();

        this.setTitle("esta Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.setContentPane(de);
        this.add(dp);
        this.pack();
        this.setResizable(true);

        this.setVisible(true);

    }
}
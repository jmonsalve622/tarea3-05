package org.example.Visual;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal dp;

    public Ventana() {
        super();
        this.setTitle("esta Ventana");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
        dp = new PanelPrincipal();
        this.add(dp, BorderLayout.CENTER);
        this.add(new JButton("Primer Botón"), BorderLayout.NORTH);
    }
}
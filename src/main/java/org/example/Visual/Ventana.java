package org.example.Visual;
import javax.swing.*;
import java.awt.BorderLayout;

public class Ventana extends JFrame {
    public Ventana() {
        super();
        this.setTitle("esta Ventana");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}

class MainVentana {
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
}
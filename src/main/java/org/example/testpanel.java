package org.example;

import javax.swing.*;
import java.awt.*;

public class testpanel extends JPanel {
    private Image imagenEscalada;

    public testpanel() {
        ImageIcon iconoOriginal = new ImageIcon("sprite.png"); // Asegúrate de que la ruta es válida
        imagenEscalada = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.setPreferredSize(new Dimension(1000, 600));
    }
    /*
    Este codigo es solo para testear la imagen de Sprite
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenEscalada, 600, 100, this); // Dibuja en posición visible
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Imagen escalada con paintComponent");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(new testpanel());
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}

package org.example.Visual;

import javax.swing.*;
import java.awt.*;


public class PanelDeposito extends JPanel {
    private Image imagenEscalada;

    public PanelDeposito() {

        ImageIcon iconoOriginal = new ImageIcon("sprite.png");
        imagenEscalada = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        this.setPreferredSize(new Dimension(1000, 600));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenEscalada, 0, 0, this);
    }
}





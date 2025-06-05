package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelDeposito extends JPanel {

    public PanelDeposito(){
        ImageIcon imageOri = new ImageIcon("Fanta.png");
        Image imagenG = imageOri.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon iconoG = new ImageIcon(imagenG);
        JLabel label = new JLabel();
        label.setIcon(iconoG);
        label.setIcon(imageOri);
        label.setBounds(0,0,75,75);
    }

}

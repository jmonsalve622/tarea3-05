package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        super();
        com = new PanelComprador();
        exp = new PanelExpendedor();

        this.setSize(800,600);
        this.setBackground(Color.blue);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(100,100,100,100);
    }
}

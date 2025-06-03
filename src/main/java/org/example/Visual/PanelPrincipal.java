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
        this.add(com);
        this.add(exp);
        this.setSize(800,600);
        this.setBackground(Color.WHITE);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        exp.paintComponent(g);
    }
}

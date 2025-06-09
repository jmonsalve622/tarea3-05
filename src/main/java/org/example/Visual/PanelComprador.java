package org.example.Visual;

import org.example.Logic.*;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;
import java.util.List;

public class PanelComprador extends JPanel {
    private List<Moneda100> m100Stack = new Stack<>();
    private List<Moneda500> m500Stack = new Stack<>();
    private List<Moneda1000> m1000Stack = new Stack<>();
    private List<Producto> productStack = new Stack<>();
    private JPanel m100Panel;
    private JPanel m500Panel;
    private JPanel m1000Panel;
    private JPanel productPanel;

    public PanelComprador() {
        m1000Stack.add(new Moneda1000());
        m1000Stack.add(new Moneda1000());
        m500Stack.add(new Moneda500());
        m500Stack.add(new Moneda500());
        for (int i = 0; i < 5; i++) {
            m100Stack.add(new Moneda100());
        }
        
        setPreferredSize(new Dimension(1200, 100));
        setBackground(Color.BLUE);
        this.setLayout(null);

        m100Panel = new JPanel();
        m500Panel = new JPanel();
        m1000Panel = new JPanel();
        productPanel = new JPanel();

        m100Panel.setBounds(20, 20, 260, 50);
        m500Panel.setBounds(20, 80, 260 ,50);
        m1000Panel.setBounds(20, 140, 260 ,50);
        productPanel.setBounds(20, 200, 260, 370);

        this.add(m100Panel);
        this.add(m500Panel);
        this.add(m1000Panel);
        this.add(productPanel);
    }

    public List<Moneda100> getM100Stack() {
        return m100Stack;
    }

    public List<Moneda500> getM500Stack() {
        return m500Stack;
    }

    public List<Moneda1000> getM1000Stack() {
        return m1000Stack;
    }

    public List<Producto> getProductStack() {
        return productStack;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}

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
    private List<CocaCola> cocaStack = new Stack<>();
    private List<Sprite> spriteStack = new Stack<>();
    private List<Fanta> fantaStack = new Stack<>();
    private List<Snickers> snickersStack = new Stack<>();
    private List<Super8> super8Stack = new Stack<>();
    private JPanel m100Panel;
    private JPanel m500Panel;
    private JPanel m1000Panel;
    private JPanel cocaPanel;
    private JPanel spritePanel;
    private JPanel fantaPanel;
    private JPanel snickersPanel;
    private JPanel super8Panel;

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
        cocaPanel = new JPanel();
        spritePanel = new JPanel();
        fantaPanel = new JPanel();
        snickersPanel = new JPanel();
        super8Panel = new JPanel();

        m100Panel.setBounds(20, 20, 100, 100);
        m500Panel.setBounds(170, 20, 100 ,100);
        m1000Panel.setBounds(20, 170, 100 ,100);
        cocaPanel.setBounds(170, 170, 100, 100);
        spritePanel.setBounds(20, 320, 100 ,100);
        fantaPanel.setBounds(170, 320, 100 ,100);
        snickersPanel.setBounds(20, 470, 100, 100);
        super8Panel.setBounds(170, 470, 100, 100);

        this.add(m100Panel);
        this.add(m500Panel);
        this.add(m1000Panel);
        this.add(cocaPanel);
        this.add(spritePanel);
        this.add(fantaPanel);
        this.add(snickersPanel);
        this.add(super8Panel);
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

    public List<CocaCola> getCocaStack() {
        return cocaStack;
    }

    public List<Sprite> getSpriteStack() {
        return spriteStack;
    }

    public List<Fanta> getFantaStack() {
        return fantaStack;
    }

    public List<Snickers> getSnickersStack() {
        return snickersStack;
    }

    public List<Super8> getSuper8Stack() {
        return super8Stack;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}

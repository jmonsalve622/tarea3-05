package org.example.Visual;

import org.example.Logic.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel implements ActionListener {
    private PanelComprador panelCom;
    private PanelExpendedor panelExp;
    private Expendedor exp;
    private Comprador com;

    private PanelBotones panelBot;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton fillButton;
    private ButtonGroup bGroup;
    private JRadioButton m100Button;
    private JRadioButton m500Button;
    private JRadioButton m1000Button;

    public PanelPrincipal() {
        super();
        this.setLayout(null);

        exp = new Expendedor(5);
        panelCom = new PanelComprador();
        panelCom.setBounds(0, 0, 300, 600);
        panelExp = new PanelExpendedor();
        panelExp.setBounds(300, 0, 700, 600);
        this.add(panelCom);
        this.add(panelExp);

        panelBot = new PanelBotones();
        panelBot.setBounds(1000, 0, 700, 600);
        this.add(panelBot);
        button1 = new JButton("CocaCola");
        button2 = new JButton("Sprite");
        button3 = new JButton("Fanta");
        button4 = new JButton("Snickers");
        button5 = new JButton("Super8");
        fillButton = new JButton("Rellenar Expendedor");
        bGroup = new ButtonGroup();
        m100Button = new JRadioButton("$100");
        m500Button = new JRadioButton("$500");
        m1000Button = new JRadioButton("$1000");


        bGroup.add(m100Button);
        bGroup.add(m500Button);
        bGroup.add(m1000Button);
        panelBot.add(button1);
        panelBot.add(button2);
        panelBot.add(button3);
        panelBot.add(button4);
        panelBot.add(button5);
        panelBot.add(m100Button);
        panelBot.add(m500Button);
        panelBot.add(m1000Button);
        panelExp.add(fillButton);

        button1.setBounds(50, 50, 110, 30);
        button2.setBounds(50, 105, 110, 30);
        button3.setBounds(50, 160, 110, 30);
        button4.setBounds(50, 215, 110, 30);
        button5.setBounds(50, 270, 110, 30);
        fillButton.setBounds(0, 0, 160, 40);
        m100Button.setBounds(40, 300, 60, 30);
        m500Button.setBounds(120, 300, 60, 30);
        m1000Button.setBounds(200, 300, 60, 30);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        fillButton.addActionListener(this);
        m100Button.addActionListener(this);
        m500Button.addActionListener(this);
        m1000Button.addActionListener(this);

        this.setPreferredSize(new Dimension(1200, 600));
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("1");
            com = new Comprador(new Moneda1000(), Seleccion.COCASELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == button2) {
            System.out.println("2");
            com = new Comprador(new Moneda1000(), Seleccion.SPRITESELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == button3) {
            System.out.println("3");
            com = new Comprador(new Moneda1000(), Seleccion.FANTASELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == button4) {
            System.out.println("4");
            com = new Comprador(new Moneda1000(), Seleccion.SNICKERSSELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == button5) {
            System.out.println("5");
            com = new Comprador(new Moneda1000(), Seleccion.SUPER8SELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == fillButton) {
            exp = new Expendedor(5);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
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

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

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
        this.setComponentZOrder(panelCom, 0);
        this.setComponentZOrder(panelCom, 1);
        this.setComponentZOrder(panelCom, 1);
        this.setComponentZOrder(panelCom, 1);
        this.setComponentZOrder(panelCom, 1);
        this.setComponentZOrder(panelCom, 1);






        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);

        button1.setBounds(50, 510, 80, 30);
        button2.setBounds(50, 410, 80, 30);
        button3.setBounds(50, 310, 80, 30);
        button4.setBounds(50, 210, 80, 30);
        button5.setBounds(50, 110, 80, 30);



        button1.addActionListener(this);

        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        this.setPreferredSize(new Dimension(1000, 600));
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
        }
    }
}
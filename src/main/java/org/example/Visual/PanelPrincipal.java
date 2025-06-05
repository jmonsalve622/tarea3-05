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


        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");


        button1.setBounds(50, 510, 80, 30);
        button2.setBounds(50, 410, 80, 30);
        button3.setBounds(50, 310, 80, 30);
        button4.setBounds(50, 210, 80, 30);
        button5.setBounds(50, 110, 80, 30);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);

        button1.addActionListener(this);

        //pal joaco: esto lo hice para probar mas que nada y ahi puedes probar los botones
        // aunque a mi me sale error al probar el boton 1 y aun no cacho porque, pero el resto de todo ya esta bien
        button2.addActionListener(e -> {
            System.out.println("Botón 2 presionado");
        });
        button3.addActionListener(e -> {
            System.out.println("Botón 3 presionado");
        });
        button4.addActionListener(e -> {
            System.out.println("Botón 4 presionado");
        });
        button5.addActionListener(e -> {
            System.out.println("Botón 5 presionado");
        });

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
            com = new Comprador(new Moneda1000(), Seleccion.SUPER8SELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == button5) {
            System.out.println("5");
            com = new Comprador(new Moneda1000(), Seleccion.SNICKERSSELECCION, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        }
    }
}
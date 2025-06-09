package org.example.Visual;

import org.example.Logic.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel implements ActionListener {
    private PanelComprador panelCom;
    private PanelExpendedor panelExp;
    private PanelBotones panelBot;

    private Expendedor exp;
    private Comprador com;
    private Moneda mon;
    private Seleccion select;

    private ButtonGroup proGroup;
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;
    private JRadioButton button5;
    private ButtonGroup monGroup;
    private JRadioButton m100Button;
    private JRadioButton m500Button;
    private JRadioButton m1000Button;
    private JButton fillButton;
    private JButton comprarButton;
    private JButton cancelarButton;

    private PanelDeposito sprite;
    private PanelCocacola cocacola;
    private PanelFanta fanta;

    public PanelPrincipal() {
        super();
        this.setLayout(null);

        exp = new Expendedor(CantidadInicial.INICALNUMBER.getInicialNum());
        mon = null;
        select = null;

        panelCom = new PanelComprador();
        panelCom.setBounds(0, 0, 300, 600);
        panelExp = new PanelExpendedor();
        panelExp.setBounds(300, 0, 700, 600);
        this.add(panelCom);
        this.add(panelExp);

        panelBot = new PanelBotones();
        panelBot.setBounds(1000, 0, 700, 600);
        this.add(panelBot);

        proGroup = new ButtonGroup();
        button1 = new JRadioButton("CocaCola");
        button2 = new JRadioButton("Sprite");
        button3 = new JRadioButton("Fanta");
        button4 = new JRadioButton("Snickers");
        button5 = new JRadioButton("Super8");
        fillButton = new JButton("Rellenar Expendedor");
        monGroup = new ButtonGroup();
        m100Button = new JRadioButton("$100");
        m500Button = new JRadioButton("$500");
        m1000Button = new JRadioButton("$1000");
        comprarButton = new JButton("Comprar");
        cancelarButton = new JButton("Cancelar");

        proGroup.add(button1);
        proGroup.add(button2);
        proGroup.add(button3);
        proGroup.add(button4);
        proGroup.add(button5);

        monGroup.add(m100Button);
        monGroup.add(m500Button);
        monGroup.add(m1000Button);
        panelBot.add(button1);
        panelBot.add(button2);
        panelBot.add(button3);
        panelBot.add(button4);
        panelBot.add(button5);
        panelBot.add(m100Button);
        panelBot.add(m500Button);
        panelBot.add(m1000Button);
        panelBot.add(comprarButton);
        panelBot.add(cancelarButton);
        panelExp.add(fillButton);

        button1.setBounds(50, 105, 110, 30);
        button2.setBounds(50, 50, 110, 30);
        button3.setBounds(50, 160, 110, 30);
        button4.setBounds(50, 215, 110, 30);
        button5.setBounds(50, 270, 110, 30);
        fillButton.setBounds(0, 0, 160, 40);
        m100Button.setBounds(35, 320, 60, 30);
        m500Button.setBounds(115, 320, 60, 30);
        m1000Button.setBounds(75, 360, 60, 30);
        comprarButton.setBounds(60, 430, 90, 40);
        cancelarButton.setBounds(60, 500, 90, 40);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        fillButton.addActionListener(this);
        m100Button.addActionListener(this);
        m500Button.addActionListener(this);
        m1000Button.addActionListener(this);
        comprarButton.addActionListener(this);
        cancelarButton.addActionListener(this);

        sprite = panelExp.getSpriteDep();
        cocacola = panelExp.getCocaDep();
        fanta = panelExp.getFantaDep();

        this.setPreferredSize(new Dimension(1200, 600));
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            select = Seleccion.COCASELECCION;
        } else if (e.getSource() == button2) {
            select = Seleccion.SPRITESELECCION;
        } else if (e.getSource() == button3) {
            select = Seleccion.FANTASELECCION;
        } else if (e.getSource() == button4) {
            select = Seleccion.SNICKERSSELECCION;
        } else if (e.getSource() == button5) {
            select = Seleccion.SUPER8SELECCION;
        } else if (e.getSource() == m100Button) {
            mon = new Moneda100();
        } else if (e.getSource() == m500Button) {
            mon = new Moneda500();
        } else if (e.getSource() == m1000Button) {
            mon = new Moneda1000();
        } else if (e.getSource() == fillButton) {
            exp = new Expendedor(6);
            sprite.RellenarSprite();
            sprite.RecolocarImagen(true);
            cocacola.RellenarCoca();
            cocacola.RecolocarImagen(true);
            fanta.RellenarFanta();
            fanta.RecolocarImagen(true);
        } else if (e.getSource() == comprarButton) {
            if(select == Seleccion.SPRITESELECCION && mon instanceof Moneda1000){
                sprite.ComprarSprite();
                sprite.setMostrarImagen(false);
            }
            if(select == Seleccion.COCASELECCION && mon instanceof Moneda1000){
                cocacola.ComprarCoca();
                cocacola.setMostrarImagen(false);
            }
            if(select == Seleccion.FANTASELECCION && mon instanceof Moneda1000){
                fanta.ComprarFanta();
                fanta.setMostrarImagen(false);
            }
            com = new Comprador(mon, select, exp);
            System.out.println(com.queCompraste() + " " + com.cuantoVuelto());
        } else if (e.getSource() == cancelarButton) {
            proGroup.clearSelection();
            monGroup.clearSelection();
            mon = null;
            select = null;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
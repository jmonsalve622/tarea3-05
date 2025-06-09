package org.example.Visual;

import org.example.Logic.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
El PanelPrincipal, tal como lo dice el nombre, es el panel principal, pues aqui estan todos los paneles importantes
como el panel de comprador, botones y expendedor. Es por este PanelPrincipal que todos los otros paneles queden unidos
y puedan ser visualizados dentro de la ventana ejecutada.
 */
public class PanelPrincipal extends JPanel implements ActionListener {
    /*
    Aqui abajo tenemos los privates con sus variables, pues estas variables estan encargadas
    de instanciar a otros paneles y otras variables fueron creadas como limitantes de la expendedora como un bloqueo.
     */
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
    private JButton recogerButton;

    private PanelSpriteC spriteC;
    private PanelCocacolaC cocacolaC;
    private PanelFantaC fantaC;
    private PanelSnickersC snickersC;
    private PanelSuper8C super8C;

    private PanelSprite sprite;
    private PanelCocacola cocacola;
    private PanelFanta fanta;
    private PanelSnickers snickers;
    private PanelSuper8 super8;
    private PanelEspecial dep;
    private PanelMoneda dmon;
    private int block = 0;
    private int blockm = 0;
    private int blockp = 0;


    /*
    Aca abajo tenemos el constructor, pues aca estan construidos todos los botones con sus posiciones
    y tambien se instancian a los otros paneles como el de expendedora, compra y botones.
     */
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
        recogerButton = new JButton("Recoger");

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
        panelExp.add(recogerButton);

        button1.setBounds(50, 105, 110, 30);
        button2.setBounds(50, 50, 110, 30);
        button3.setBounds(50, 160, 110, 30);
        button4.setBounds(50, 215, 110, 30);
        button5.setBounds(50, 270, 110, 30);
        fillButton.setBounds(10, 10, 160, 40);
        m100Button.setBounds(35, 320, 60, 30);
        m500Button.setBounds(115, 320, 60, 30);
        m1000Button.setBounds(75, 360, 60, 30);
        comprarButton.setBounds(60, 430, 90, 40);
        cancelarButton.setBounds(60, 500, 90, 40);
        recogerButton.setBounds(40, 500, 100, 40);

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
        recogerButton.addActionListener(this);

        sprite = panelExp.getSpriteDep();
        cocacola = panelExp.getCocaDep();
        fanta = panelExp.getFantaDep();
        snickers = panelExp.getSnikersDep();
        super8 = panelExp.getSuper8Dep();
        dep = panelExp.getEsDep();
        dmon = panelExp.getMoDep();

        spriteC = panelCom.getSpriteC();
        cocacolaC = panelCom.getCocaC();
        fantaC = panelCom.getFantaC();
        snickersC = panelCom.getSnickersC();
        super8C = panelCom.getSuper8C();

        this.setPreferredSize(new Dimension(1200, 600));
    }

    /*
    Aca tenemos La configuracion de todos los botones que hay en toda la aplicacion
     */
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
            exp = new Expendedor(CantidadInicial.INICALNUMBER.getInicialNum());
            sprite.RellenarSprite();
            sprite.RecolocarImagen(true);
            cocacola.RellenarCoca();
            cocacola.RecolocarImagen(true);
            fanta.RellenarFanta();
            fanta.RecolocarImagen(true);
            snickers.RellenarSnickers();
            snickers.RecolocarImagen(true);
            super8.RellenarSuper8();
            super8.RecolocarImagen(true);
            dep.setNumN();
            dmon.setNumN();
        } else if (e.getSource() == comprarButton) {
            if(block == 0){
                com = new Comprador(mon, select, exp);
                System.out.println("Nombre Producto: " + com.queCompraste());
                System.out.println("Vuelto: $" + com.cuantoVuelto());
                if (mon != null) {
                    System.out.println("Serie Moneda: " + mon.getSerie());
                } else {
                    System.out.println("No se ocupo una moneda");
                }
                if (com.getProductoComprado() != null) {
                    System.out.println("Serie Producto: " + com.getProductoComprado().getSerie());
                } else {
                    System.out.println("No se obtuvo producto");
                }
            }
            if (select == Seleccion.SPRITESELECCION && mon instanceof Moneda1000){
                if(block == 0){
                    dep.setNum(2);
                    sprite.ComprarSprite();
                    sprite.setMostrarImagen(false);
                    dep.setMostrarImagen(true);
                    dep.setBlock(1);
                    dmon.setNum(200);
                    dmon.setMostrarImagen(true);
                    dmon.setBlock(1);
                    blockm = 1;
                    blockp = 1;
                    block = 1;
                } else if (block == 1) {
                    System.out.println("Saque el producto de la Expendedora y su vuelto");
                }
            } else if (select == Seleccion.COCASELECCION && mon instanceof Moneda1000){
                if(block == 0){
                    dep.setNum(1);
                    cocacola.ComprarCoca();
                    cocacola.setMostrarImagen(false);
                    dep.setMostrarImagen(true);
                    dep.setBlock(1);
                    dmon.setNum(0);
                    dmon.setMostrarImagen(true);
                    dmon.setBlock(1);
                    blockm = 1;
                    blockp = 1;
                    block = 1;
                } else if (block == 1) {
                    System.out.println("Saque el producto de la Expendedora y su vuelto");
                }
            } else if (select == Seleccion.FANTASELECCION && mon instanceof Moneda1000){
                if(block == 0){
                    dep.setNum(3);
                    fanta.ComprarFanta();
                    fanta.setMostrarImagen(false);
                    dep.setMostrarImagen(true);
                    dep.setBlock(1);
                    dmon.setNum(100);
                    dmon.setMostrarImagen(true);
                    dmon.setBlock(1);
                    blockm = 1;
                    blockp = 1;
                    block = 1;
                } else if (block == 1) {
                    System.out.println("Saque el producto de la Expendedora y su vuelto");
                }
            } else if (select == Seleccion.SNICKERSSELECCION && (mon instanceof Moneda500 || mon instanceof Moneda1000)){
                if(block == 0){
                    dep.setNum(4);
                    snickers.ComprarSnickers();
                    snickers.setMostrarImagen(false);
                    dep.setMostrarImagen(true);
                    dep.setBlock(1);
                    dmon.setNum(500);
                    dmon.setMostrarImagen(true);
                    dmon.setBlock(1);
                    blockm = 1;
                    blockp = 1;
                    block = 1;
                } else if (block == 1) {
                    System.out.println("Saque el producto de la Expendedora y su vuelto");
                }
            } else if (select == Seleccion.SUPER8SELECCION && (mon instanceof Moneda500 || mon instanceof Moneda1000)){
                if(block == 0){
                    dep.setNum(5);
                    super8.ComprarSuper8();
                    super8.setMostrarImagen(false);
                    dep.setMostrarImagen(true);
                    dep.setBlock(1);
                    dmon.setNum(600);
                    dmon.setMostrarImagen(true);
                    dmon.setBlock(1);
                    blockm = 1;
                    blockp = 1;
                    block = 1;
                } else if (block == 1) {
                    System.out.println("Saque el producto de la Expendedora y su vuelto");
                }
            }
            proGroup.clearSelection();
            monGroup.clearSelection();
            mon = null;
        } else if (e.getSource() == cancelarButton) {
            proGroup.clearSelection();
            monGroup.clearSelection();
            mon = null;
            select = null;
        } else if (e.getSource() == recogerButton) {
            if(select == Seleccion.SPRITESELECCION) {
                spriteC.RecogerSprite();
                spriteC.setMostrarImagen(true);
                select = null;
            } else if(select == Seleccion.COCASELECCION) {
                cocacolaC.RecogerCoca();
                cocacolaC.setMostrarImagen(true);
                select = null;
            } else if(select == Seleccion.FANTASELECCION) {
                fantaC.RecogerFanta();
                fantaC.setMostrarImagen(true);
                select = null;
            } else if(select == Seleccion.SNICKERSSELECCION) {
                snickersC.RecogerSnickers();
                snickersC.setMostrarImagen(true);
                select = null;
            } else if(select == Seleccion.SUPER8SELECCION) {
                super8C.RecogerSuper8();
                super8C.setMostrarImagen(true);
                select = null;
            }
            blockp = 0;
            dep.setBlock(0);
            dep.setMostrarImagen(false);
            if(blockm == 0) {
                block = 0;
            }

            blockm = 0;
            dmon.setBlock(0);
            dmon.setMostrarImagen(false);
            if(blockp == 0) {
                block = 0;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
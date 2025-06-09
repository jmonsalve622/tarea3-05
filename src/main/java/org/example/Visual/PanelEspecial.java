package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelEspecial extends JPanel{
    /*
    Aca tenemos los Privates que referencian a las imagenes de cada producto individualmente
     */
    private Image imagen1;
    private boolean mostrar1 = false;
    private Image imagen2;
    private boolean mostrar2 = false;
    private Image imagen3;
    private boolean mostrar3 = false;
    private Image imagen4;
    private boolean mostrar4 = false;
    private Image imagen5;
    private boolean mostrar5 = false;

    private int num;
    private int block = 0;
    private int spriN = 0;
    private int cocaN = 0;
    private int fantaN = 0;
    private int snickersN = 0;
    private int super8N = 0;

    /*
    El constructor de PanelEspecial, Aca se crean las imagenes que se usaran despues.
     */
    public PanelEspecial() {

        ImageIcon iconoCoca = new ImageIcon("cocacola.png");
        ImageIcon iconoSprite = new ImageIcon("sprite.png");
        ImageIcon iconoFanta = new ImageIcon("fanta.png");
        ImageIcon iconoSnickers = new ImageIcon("snickers.png");
        ImageIcon iconoSuper8 = new ImageIcon("super8.png");
        imagen1 = iconoCoca.getImage().getScaledInstance(30, 50, Image.SCALE_SMOOTH);
        imagen2 = iconoSprite.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen3 = iconoFanta.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen4 = iconoSnickers.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen5 = iconoSuper8.getImage().getScaledInstance(30, 50, Image.SCALE_SMOOTH);
        setOpaque(false);
        this.setPreferredSize(new Dimension(1200, 600));

    }

    /*
    Este metodo paintComponet sirve para pintar los iconos, pero solo tiene permitido mostrar uno a las vez.
     */
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if ((mostrar1 && imagen1 != null) && cocaN < 12) {
            g.drawImage(imagen1, 35, 0, this);
        } else if ((mostrar2 && imagen2 != null) && spriN < 12) {
            g.drawImage(imagen2, 25, 0, this);
        } else if ((mostrar3 && imagen3 != null) && fantaN < 12) {
            g.drawImage(imagen3, 27, 0, this);
        } else if ((mostrar4 && imagen4 != null) && snickersN < 12) {
            g.drawImage(imagen4, 26, 0, this);
        } else if ((mostrar5 && imagen5 != null) && super8N < 12) {
            g.drawImage(imagen5, 35, 0, this);
        }
    }

    /*
    Esto es un metodo que permite elegir que producto se mostrara en el PanelEspecial.
     */
    public void setMostrarImagen(boolean mostrar) {
        if (block != 1) {
            if(num == 1){
                mostrar1 = mostrar;
                cocaN += 1;
                repaint();
            } else if(num == 2){
                mostrar2 = mostrar;
                spriN += 1;
                repaint();
            } else if(num == 3){
                mostrar3 = mostrar;
                fantaN += 1;
                repaint();
            } else if(num == 4){
                mostrar4 = mostrar;
                snickersN += 1;
                repaint();
            } else if(num == 5){
                mostrar5 = mostrar;
                super8N += 1;
                repaint();
            }
        }
    }

    /*
    Estos metodos de aca abajo, son Setters que permiten cambiar las variables num y block
    , estas variables son utiles para verificar si hay un producto en PanelEspecial o no.
     */
    public void setNum(int n){
        num = n;
    }
    public void setBlock(int n){
        block = n;
    }
    public void setNumN(){
        cocaN = 0;
        spriN = 0;
        fantaN = 0;
        snickersN = 0;
        super8N = 0;
    }
}
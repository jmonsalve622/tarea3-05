package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelEspecial extends JPanel{
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

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (mostrar1 && imagen1 != null) {
            g.drawImage(imagen1, 35, 0, this);
        }
        if (mostrar2 && imagen2 != null) {
            g.drawImage(imagen2, 25, 0, this);
        }
        if (mostrar3 && imagen3 != null) {
            g.drawImage(imagen3, 27, 0, this);
        }
        if (mostrar4 && imagen4 != null) {
            g.drawImage(imagen4, 26, 0, this);
        }
        if (mostrar5 && imagen5 != null) {
            g.drawImage(imagen5, 35, 0, this);
        }
    }


    public void setMostrarImagen(boolean mostrar) {
        if (block != 1) {
            if(num == 1){
                mostrar1 = mostrar;
                repaint();
            } else if(num == 2){
                mostrar2 = mostrar;
                repaint();
            } else if(num == 3){
                mostrar3 = mostrar;
                repaint();
            } else if(num == 4){
                mostrar4 = mostrar;
                repaint();
            } else if(num == 5){
                mostrar5 = mostrar;
                repaint();
            }
        }
    }

    public void setNum(int n){
        num = n;
    }
    public void setBlock(int n){
        block = n;
    }
}
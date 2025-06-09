package org.example.Visual;

import org.example.Logic.CantidadInicial;

import javax.swing.*;
import java.awt.*;

public class PanelFanta extends JPanel{
    private Image imagen1;
    private boolean mostrar1 = true;
    private Image imagen2;
    private boolean mostrar2 = true;
    private Image imagen3;
    private boolean mostrar3 = true;
    private Image imagen4;
    private boolean mostrar4 = true;
    private Image imagen5;
    private boolean mostrar5 = true;
    private Image imagen6;
    private boolean mostrar6 = true;
    private int num;

    public PanelFanta() {

        ImageIcon iconoOriginal = new ImageIcon("fanta.png");
        imagen1 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen2 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen3 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen4 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen5 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen6 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setBackground(Color.yellow);
        setOpaque(false);
        this.setBounds(0, 0, 1000, 200);
        this.setPreferredSize(new Dimension(1200, 600));

        num = CantidadInicial.INICALNUMBER.getInicialNum();

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (mostrar1 && imagen1 != null){
            g.drawImage(imagen1, 0, 0, this);
        }
        if (mostrar2 && imagen2 != null){
            g.drawImage(imagen2, 50, 0, this);
        }
        if (mostrar3 && imagen3 != null){
            g.drawImage(imagen3, 100, 0, this);
        }
        if (mostrar4 && imagen4 != null){
            g.drawImage(imagen4, 150, 0, this);
        }
        if (mostrar5 && imagen5 != null){
            g.drawImage(imagen5, 200, 0, this);
        }
        if (mostrar6 && imagen6 != null){
            g.drawImage(imagen6, 250, 0, this);
        }
    }

    public void setMostrarImagen(boolean mostrar) {
        if(num <= 0){
            mostrar1 = mostrar;
            repaint();
        } else if(num <= 1){
            mostrar2 = mostrar;
            repaint();
        } else if(num <= 2){
            mostrar3 = mostrar;
            repaint();
        } else if(num <= 3){
            mostrar4 = mostrar;
            repaint();
        } else if(num <= 4){
            mostrar5 = mostrar;
            repaint();
        } else if(num <= 5){
            mostrar6 = mostrar;
            repaint();
        }
    }

    public void RecolocarImagen(boolean mostrar) {
        mostrar1 = mostrar;
        mostrar2 = mostrar;
        mostrar3 = mostrar;
        mostrar4 = mostrar;
        mostrar5 = mostrar;
        mostrar6 = mostrar;
        repaint();
    }

    public int ComprarFanta() {
        num -= 1;
        return num;
    }

    public int RellenarFanta() {
        num = CantidadInicial.INICALNUMBER.getInicialNum();
        return num;
    }
}

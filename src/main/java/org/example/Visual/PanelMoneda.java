package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelMoneda extends JPanel {
    /*
    Los privates de abajo nos ayudan a definir las imagenes y estas variables tambien ayudaran a ver si hay monedas o no.
     */
    private Image imagen1;
    private boolean mostrar1 = false;
    private Image imagen2;
    private boolean mostrar2 = false;
    private Image imagen3;
    private boolean mostrar3 = false;
    private int num;
    private int block;
    private int spriN = 0;
    private int cocaN = 0;
    private int fantaN = 0;
    private int snickersN = 0;
    private int super8N = 0;

    /*
    Esto de abajo es el constructor del deposito de monedas,
    aca tenemos guardada las imagenes de las monedas que usaremos.
     */
    public PanelMoneda(){
        ImageIcon iconoMon100 = new ImageIcon("mon100.png");
        ImageIcon iconoMon500 = new ImageIcon("mon500.png");
        ImageIcon iconoMon1002 = new ImageIcon("mon100.png");
        imagen1 = iconoMon100.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
        imagen2 = iconoMon500.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
        imagen3 = iconoMon1002.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
        setOpaque(false);
        this.setPreferredSize(new Dimension(1200, 600));
    }

    /*
    El metodo paintComponent nos sirve para dibujar las monedas dentro de su deposito.
     */
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (mostrar1 && imagen1 != null) {
            g.drawImage(imagen1, 0, 0, this);
        }
        if (mostrar2 && imagen2 != null) {
            g.drawImage(imagen2, 60, 0, this);
        }
        if (mostrar3 && imagen3 != null) {
            g.drawImage(imagen3, 30, 0, this);
        }
    }

    /*
    El metodo de abajo nos sirve para entregar la cantidad de monedas justas para el vuelto.
     */
    public void setMostrarImagen(boolean mostrar) {
        if(block != 1) {
            if((num == 200) && spriN < 12) {
                mostrar1 = mostrar;
                mostrar3 = mostrar;
                spriN += 1;
                repaint();
            } else if((num == 100) && fantaN < 12) {
                mostrar1 = mostrar;
                fantaN += 1;
                repaint();
            } else if((num == 500) && snickersN < 12) {
                mostrar2 = mostrar;
                snickersN += 1;
                repaint();
            } else if((num == 5002) && snickersN < 12) {
                snickersN += 1;
            } else if((num == 600) && super8N < 12) {
                mostrar1 = mostrar;
                mostrar2 = mostrar;
                super8N += 1;
                repaint();
            }  else if((num == 6002) && super8N < 12) {
                mostrar1 = mostrar;
                super8N += 1;
                repaint();
            }else if((num == 0) && cocaN < 12) {
                cocaN += 1;
            }
        }
    }

    /*
    Estos son Setter que ayudan a verificar si hay monedas en el deposito de monedas.
     */
    public void setNum(int n){
        num = n;
    }
    public void setBlock(int n){
        block = n;
    }
    public void setNumN() {
        cocaN = 0;
        spriN = 0;
        fantaN = 0;
        snickersN = 0;
        super8N = 0;
    }
}

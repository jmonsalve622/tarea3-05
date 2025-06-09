package org.example.Visual;

import org.example.Logic.CantidadInicial;

import javax.swing.*;
import java.awt.*;

/*
Esta clase esta hecho para hacer lo mismo que PanelFanta, pero con la diferencia
que este esta hecho para el PanelComprador y hace lo contrario que PanelFanta.
 */
public class PanelFantaC extends JPanel {
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
        private Image imagen6;
        private boolean mostrar6 = false;
        private int num;

    /*
    El constructor el cual crea las imagenes que se usaran luego.
     */
    public PanelFantaC() {

        ImageIcon iconoOriginal = new ImageIcon("fanta.png");
        imagen1 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen2 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen3 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen4 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen5 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imagen6 = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setOpaque(false);
        this.setPreferredSize(new Dimension(1200, 600));

        num = CantidadInicial.INICALNUMBER.getInicialNum();

    }


        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (mostrar1 && imagen1 != null){
            g.drawImage(imagen1, 0, 120, this);
        }
        if (mostrar2 && imagen2 != null){
            g.drawImage(imagen2, 50, 120, this);
        }
        if (mostrar3 && imagen3 != null){
            g.drawImage(imagen3, 100, 120, this);
        }
        if (mostrar4 && imagen4 != null){
            g.drawImage(imagen4, 150, 120, this);
        }
        if (mostrar5 && imagen5 != null){
            g.drawImage(imagen5, 200, 120, this);
        }
        if (mostrar6 && imagen6 != null){
            g.drawImage(imagen6, 250, 120, this);
        }
    }

    /*
    Aca la diferencia con su respectivo clase gemelo, es que aca en vez de desaparecer, la bedida aparece
    dentro del inventario del comprador.
     */
        public void setMostrarImagen(boolean mostrar) {
        if(num == 0){
            mostrar6 = mostrar;
            repaint();
        } else if(num == 1){
            mostrar5 = mostrar;
            repaint();
        } else if(num == 2){
            mostrar4 = mostrar;
            repaint();
        } else if(num == 3){
            mostrar3 = mostrar;
            repaint();
        } else if(num == 4){
            mostrar2 = mostrar;
            repaint();
        } else if(num == 5){
            mostrar1 = mostrar;
            repaint();
        }
    }

        public int RecogerFanta() {
            num -= 1;
            return num;
        }

}

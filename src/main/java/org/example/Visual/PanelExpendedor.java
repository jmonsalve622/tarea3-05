package org.example.Visual;

import org.example.Logic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelExpendedor extends JPanel {
     private PanelDeposito cocaDep;
     private PanelDeposito spriteDep;
     private PanelDeposito fantaDep;
     private PanelDeposito super8Dep;
     private PanelDeposito snikersDep;
     private PanelDeposito dep;

     public PanelExpendedor() {
          super();
          this.setLayout(null);
          this.setBackground(Color.GRAY);
          this.setPreferredSize(new Dimension(1200, 600));

          JPanel panelInterno = new JPanel();

          this.add(panelInterno);



          panelInterno.setLayout(null);
          panelInterno.setBackground(Color.cyan);
          panelInterno.setBounds(200, 100, 300, 50);

          // Crear y agregar el PanelDeposito (que dibuja la imagen)
          spriteDep = new PanelDeposito();
          spriteDep.setBounds(0, 0, 1000, 200); // Posición y tamaño dentro del panel interno
          panelInterno.add(spriteDep); // Agregar al panel interno

          this.add(panelInterno); // Agregar el panel interno al principal



     }

     @Override
     public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.RED);
          g.fillRect(175,70,350,510);
     }

}

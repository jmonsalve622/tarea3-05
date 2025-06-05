package org.example.Visual;
import org.example.Logic.*;
import javax.swing.*;
import java.awt.*;


public class PanelExpendedor extends JPanel {
     private PanelDeposito cocaDep;
     private PanelDeposito spriteDep;
     private PanelDeposito fantaDep;
     private PanelDeposito super8Dep;
     private PanelDeposito snikersDep;

     public PanelExpendedor() {
          super();
          this.setBackground(Color.GRAY);
     }

     @Override
     public void paintComponent(Graphics g) {
          g.setColor(Color.RED);
          g.drawRect(300,300,300,400);
     }
}

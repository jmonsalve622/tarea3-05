package org.example.Visual;
import org.example.Logic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelExpendedor extends JPanel {
     private PanelDeposito cocaDep;
     private PanelDeposito spriteDep;
     private PanelDeposito fantaDep;
     private PanelDeposito super8Dep;
     private PanelDeposito snikersDep;
     private Expendedor exp = new Expendedor(5);

     public PanelExpendedor() {
          super();
          this.setBackground(Color.GRAY);
     }

     @Override
     public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.RED);
          g.fillRect(175,70,350,510);
     }
}

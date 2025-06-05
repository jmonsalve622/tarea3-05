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
          this.setPreferredSize(new Dimension(300,300));
          this.setBackground(Color.red);
          this.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseReleased(MouseEvent e) {
                    repaint();
               }
          });
     }

     @Override
     protected void paintComponent(Graphics g) {
          super.paintComponent(g);
     }
}

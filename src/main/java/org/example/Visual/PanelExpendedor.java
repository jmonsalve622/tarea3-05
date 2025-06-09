package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
     /*
     Abajo tenemos los Privates de cada deposito de cada producto
      */
     private PanelCocacola cocaDep;
     private PanelSprite spriteDep;
     private PanelFanta fantaDep;
     private PanelSuper8 super8Dep;
     private PanelSnickers snikersDep;
     private PanelEspecial dep;

     /*
     Aca tenemos el constructor de la expendedora, que crea cada panel de deposito de cada producto
     y los posiciona dentro de la expendedora.
      */
     public PanelExpendedor() {
          super();
          this.setLayout(null);
          this.setBackground(Color.GRAY);
          this.setPreferredSize(new Dimension(1200, 600));


          JPanel panelInterno1 = new JPanel();

          panelInterno1.setLayout(null);
          panelInterno1.setBackground(Color.cyan);
          panelInterno1.setBounds(200, 100, 300, 50);
          spriteDep = new PanelSprite();
          spriteDep.setBounds(0, 0, 1000, 200);
          panelInterno1.add(spriteDep);

          this.add(panelInterno1);


          JPanel panelInterno2 = new JPanel();

          panelInterno2.setLayout(null);
          panelInterno2.setBackground(Color.cyan);
          panelInterno2.setBounds(200, 180, 300, 50);
          cocaDep = new PanelCocacola();
          cocaDep.setBounds(0, 0, 1000, 200);
          panelInterno2.add(cocaDep);

          this.add(panelInterno2);


          JPanel panelInterno3 = new JPanel();

          panelInterno3.setLayout(null);
          panelInterno3.setBackground(Color.cyan);
          panelInterno3.setBounds(200, 260, 300, 50);
          fantaDep = new PanelFanta();
          fantaDep.setBounds(0, 0, 1000, 200);
          panelInterno3.add(fantaDep);

          this.add(panelInterno3);


          JPanel panelInterno4 = new JPanel();

          panelInterno4.setLayout(null);
          panelInterno4.setBackground(Color.cyan);
          panelInterno4.setBounds(200, 340, 300, 50);
          snikersDep = new PanelSnickers();
          snikersDep.setBounds(0, 0, 1000, 200);
          panelInterno4.add(snikersDep);

          this.add(panelInterno4);


          JPanel panelInterno5 = new JPanel();

          panelInterno5.setLayout(null);
          panelInterno5.setBackground(Color.cyan);
          panelInterno5.setBounds(200, 420, 300, 50);
          super8Dep = new PanelSuper8();
          super8Dep.setBounds(0, 0, 1000, 200);
          panelInterno5.add(super8Dep);

          this.add(panelInterno5);


          JPanel panelEspecial = new JPanel();

          panelEspecial.setLayout(null);
          panelEspecial.setBackground(Color.cyan);
          panelEspecial.setBounds(300, 500, 100, 50);
          dep = new PanelEspecial();
          dep.setBounds(0, 0, 1000, 200);
          panelEspecial.add(dep);

          this.add(panelEspecial);
     }

     /*
     Aca van los Getters de cada producto que vaya a haber.
      */
     public PanelSprite getSpriteDep() {
          return spriteDep;
     }
     public PanelCocacola getCocaDep() {
          return cocaDep;
     }
     public PanelFanta getFantaDep() {
          return fantaDep;
     }
     public PanelSnickers getSnikersDep() {
          return snikersDep;
     }
     public PanelSuper8 getSuper8Dep() {
          return super8Dep;
     }
     public PanelEspecial getEsDep() {
          return dep;
     }

     /*
     Este es el metodo que dibuja la expendedora roja
      */
     @Override
     public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.RED);
          g.fillRect(175,70,350,510);
     }

}

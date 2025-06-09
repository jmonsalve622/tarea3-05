package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/*
Aca tenemos el panel del comprador, aca se puede apreciar el inventario y su contenido.
 */
public class PanelComprador extends JPanel {

    private JPanel m100Panel;
    private JPanel m500Panel;
    private JPanel m1000Panel;
    private JPanel productPanel;

    private PanelCocacolaC cocaDep;
    private PanelSpriteC spriteDep;
    private PanelFantaC fantaDep;
    private PanelSuper8C super8Dep;
    private PanelSnickersC snickersDep;

    /*
    Este es el constructor, pues aca se estan encargando de meter las imagenes de los objetos
    que se iran metiendo al inventario a medida que compras en la expendedora.
     */
    public PanelComprador() {
        
        setPreferredSize(new Dimension(1200, 100));
        setBackground(Color.BLUE);
        this.setLayout(null);

        m100Panel = new JPanel();
        m500Panel = new JPanel();
        m1000Panel = new JPanel();


        m100Panel.setBounds(20, 20, 260, 50);
        m500Panel.setBounds(20, 80, 260 ,50);
        m1000Panel.setBounds(20, 140, 260 ,50);

        this.add(m100Panel);
        this.add(m500Panel);
        this.add(m1000Panel);

        productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBounds(20, 200, 260, 370);
        spriteDep = new PanelSpriteC();
        spriteDep.setBounds(0, 0, 1000, 370);
        productPanel.add(spriteDep);
        cocaDep = new PanelCocacolaC();
        cocaDep.setBounds(0, 0, 1000, 370);
        productPanel.add(cocaDep);
        fantaDep = new PanelFantaC();
        fantaDep.setBounds(0, 0, 1000, 370);
        productPanel.add(fantaDep);
        snickersDep = new PanelSnickersC();
        snickersDep.setBounds(0, 0, 1000, 370);
        productPanel.add(snickersDep);
        super8Dep = new PanelSuper8C();
        super8Dep.setBounds(0, 0, 1000, 370);
        productPanel.add(super8Dep);
        this.add(productPanel);
    }

    public PanelSpriteC getSpriteC() {
        return spriteDep;
    }
    public PanelCocacolaC getCocaC() {
        return cocaDep;
    }
    public PanelFantaC getFantaC() {
        return fantaDep;
    }
    public PanelSnickersC getSnickersC() {
        return snickersDep;
    }
    public PanelSuper8C getSuper8C() {
        return super8Dep;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}

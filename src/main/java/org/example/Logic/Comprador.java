package org.example.Logic;
import org.example.Visual.PanelPrincipal;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, Seleccion select, Expendedor e) {
        e.comprarProducto(m, select);
        Producto p = e.getProducto();
        sonido = p.consumir();
        vuelto = 0;
        while (e.hayVuelto()) {
            vuelto += e.getVuelto().getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queCompraste() {
        return sonido;
    }
}
package org.example.Logic;
import org.example.Visual.PanelPrincipal;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private Producto productoComprado;
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, Seleccion select, Expendedor e) {
        try {
            e.comprarProducto(m, select);
            productoComprado = e.getProducto();
            sonido = productoComprado.consumir();
        }
        catch (RuntimeException rte) {
            productoComprado = null;
            sonido = null;
        }
        finally {
            vuelto = 0;
            while (e.hayVuelto()) {
                vuelto += e.getVuelto().getValor();
            }
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queCompraste() {
        return sonido;
    }

    public Producto getProductoComprado() {
        return productoComprado;
    }
}
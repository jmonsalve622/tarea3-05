package org.example.Logic;

public class DepositoEspecial {
    private Producto producto = null;

    public DepositoEspecial() {}

    public void depositarProducto(Producto p) {
        producto = p;
    }

    public Producto getProducto() {
        Producto tempProducto = producto;
        producto = null;
        return tempProducto;
    }
}

package org.example.Logic;

abstract public class Producto {
    private int serie;

    public Producto(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }
    public abstract String consumir();

}
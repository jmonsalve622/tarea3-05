package org.example.Logic;

/*
Aca podemos observar la clase Producto, que cumple con ser un apoyo del
polimorfismo sobre otros productos como bebidas y comestibles.
 */
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
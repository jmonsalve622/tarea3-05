package org.example.Logic;

/*
Aca podemos ver los precios de cada producto que ofrece la expendedora.
 */
public enum Precios {
    COCAPRECIO(1000),
    SPRITEPRECIO(800),
    FANTAPRECIO(900),
    SNICKERSPRECIO(500),
    SUPER8PRECIO(400);

    private final int precio;

    Precios(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
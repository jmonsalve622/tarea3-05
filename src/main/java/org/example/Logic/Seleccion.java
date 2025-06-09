package org.example.Logic;

/*
Este enumeracion cumple con entregar la seleccion del producto a la expendedora.
 */
public enum Seleccion {
    COCASELECCION(1),
    SPRITESELECCION(2),
    FANTASELECCION(3),
    SNICKERSSELECCION(4),
    SUPER8SELECCION(5);

    private final int seleccion;

    Seleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public int getSeleccion() {
        return seleccion;
    }
}
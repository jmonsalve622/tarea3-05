package org.example.Logic;

public class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException() {
        super("No se puede comprar un producto sin tener una moneda");
    }
}
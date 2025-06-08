package org.example.Logic;

public enum CantidadInicial {
    INICALNUMBER(6);

    private final int inicialNum;

    CantidadInicial(int inicialNum) {
        this.inicialNum = inicialNum;
    }

    public int getInicialNum() {
        return inicialNum;
    }
}

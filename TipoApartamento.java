package com.gmail.danielfernandezneira1;

public enum TipoApartamento {
    enalquiler(0.002),
    segundaVivienda(0.001),
    primeravivienda(0);


    private double incremento;

    TipoApartamento(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento() {
        return incremento;
    }
}

package com.gmail.danielfernandezneira1;

public class Locales extends Inmueble{
    private double metrosCuadrados;
    public double impuestoExtra;

    public Locales( int codigoPostal, String direccion, double valor, double metrosCuadrados ) {
        super( codigoPostal, direccion, valor);
        this.metrosCuadrados = metrosCuadrados;
        this.impuestoExtra=metrosCuadrados/2;
    }



    @Override
    public double getImpuestoExtra() {
        return impuestoExtra;
    }
}

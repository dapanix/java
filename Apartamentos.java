package com.gmail.danielfernandezneira1;

public class Apartamentos extends Inmueble{

    public double impuestoExtra;
    private TipoApartamento tipo;
    public Apartamentos(int codigoPostal, String direccion, float valor, TipoApartamento tipo) {
        super( codigoPostal, direccion, valor);
        this.tipo=tipo;

        impuestoExtra=calcularImpuesto()* tipo.getIncremento()-calcularImpuesto();
    }
    @Override
    calcularID(Inmueble tipo, int cont){

    }
    @Override
    public double getImpuestoExtra() {
        return impuestoExtra;
    }
}

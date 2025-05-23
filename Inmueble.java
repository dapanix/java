package com.gmail.danielfernandezneira1;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Inmueble implements Comparable<Inmueble>{
    private String ID;
    private int codigoPostal;
    private String direccion;
    private double valor;
    public static int cont=0;
    private double impuestoTotal;
    public static ArrayList<Inmueble> listaInmuebles = new ArrayList<Inmueble>();



    public Inmueble(int codigoPostal, String direccion, double valor) {
        listaInmuebles.add(this);
        this.ID = calcularID(this);
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.valor = valor;
        this.impuestoTotal=calcularImpuesto()+getImpuestoExtra();
    }
    public static String  calcularID(Inmueble tipo){
        cont+=1;
        if (tipo instanceof Apartamentos){
            return ("(A-"+cont+")");
        }
        if (tipo instanceof Locales){
            return ("(L-"+cont+")");
        }
        else{
                return(null);
        }
    }
    public double calcularImpuesto(){
        double impuesto=0;
        if (valor>300000){
            impuesto=valor*0.005;
        } else if (valor>200000 && valor<300000) {
            impuesto=valor*0.0035;
        }else{
            impuesto=valor*0.001;
        }
        return (impuesto);
    }

    public String getID() {
        return ID;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getValor() {
        return valor;
    }

    public static int getCont() {
        return cont;
    }

    public double getImpuestoTotal() {
        return impuestoTotal;
    }

    public static ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "ID='" + ID + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", direccion='" + direccion + '\'' +
                ", valor=" + valor +
                ", impuestoTotal=" + impuestoTotal +
                '}';
    }

    public abstract double getImpuestoExtra();


    public class ComparaValor implements Comparator<Inmueble> {

        @Override
        public int compare(Inmueble o1, Inmueble o2) {
            return Double.compare(o1.getValor(), o2.getValor());
        }
    }
    public class ComparaCodigoPostal implements Comparator<Inmueble> {

        @Override
        public int compare(Inmueble o1, Inmueble o2) {
            return Integer.compare(o1.getCodigoPostal(), o2.getCodigoPostal());
        }
    }
    public class ComparaCodigoID implements Comparator<Inmueble> {

        @Override
        public int compare(Inmueble o1, Inmueble o2) {
            String[] partes = o1.getID().split("-");
            String letra1=partes[0];
            int numero1= Integer.valueOf(partes[1]);

            String[] partes2 = o2.getID().split("-");
            String letra2=partes[0];
            int numero2= Integer.valueOf(partes[1]);

            if (letra1.equals(letra2)){

            }
            int ID1=new Integer(o1.getID().split("-",1);
            return Integer.compare(o1.getID(), o2.getID());
        }
    }
}

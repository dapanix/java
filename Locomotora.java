package Maquinaria;

import Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private double potencia;
    private Personal.Mecanico mantenimiento;
    private int anoFabricacion;
    //@@ Falta año de fabricación


    public Locomotora(String matricula, double potencia, Mecanico mantenimiento, int anoFabricacion) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.mantenimiento = mantenimiento;
        this.anoFabricacion=anoFabricacion;
    }

    public void cambiarMecanico(Personal.Mecanico nuevoMecanico){
        mantenimiento = nuevoMecanico;
    }
    public void mostrarInformacion(){
        System.out.println("matricula: "+matricula);
        System.out.println("potencia: "+potencia+"Wats");

        //@@ Sería mantenimiento muestra la sirección de memoria del objeto.
        //@@ Tendrias que hacer primero mantenimiento.mostrarInformacion()
        System.out.print("personal mantenimiento: ");
        mantenimiento.mostrarInformacion();
        System.out.println("anyo de fabricacion: "+anoFabricacion);
    }
    




}

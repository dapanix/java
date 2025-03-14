package Personal;

import javax.sound.sampled.SourceDataLine;

public class Maquinista {
    private String nombre;
    private String Dni;
    private double sueldo;

    // @@ esto debe ser  String
    private String rango;

     public Maquinista(String nombre, String Dni, double sueldo, String rango){
        this.nombre=nombre;
        this.Dni=Dni;
        this.sueldo=sueldo;
        this.rango=rango;
    }
    public void aumentarSueldo( double aumentar){
         //@@ Falta validaciones. Ver solución subida.
        if (sueldo<=0){
            System.out.println("error: el sueldo debe ser mayor a 0");
            return;
        }
    
        sueldo=sueldo+ aumentar;
    }
    public void reducirSueldo( double reducir){
        //@@ Falta validaciones. Ver solución subida.
        if (reducir <= 0) {
            System.out.println(" Error: La reducción debe ser mayor a 0.");
            return;
        }
        if (sueldo - reducir < 0) {
            System.out.println(" Error: No se puede reducir el sueldo por debajo de 0.");
            return;
        }
        sueldo=sueldo+ reducir;
    }
    public void cambiarRango( String newrango){
       rango=newrango;
    }
    public void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println(Dni);
        System.out.println(sueldo);
        System.out.println(rango);
    }

}

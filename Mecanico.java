package Personal;

import java.util.Arrays;

public class Mecanico {
    private String nombre;
    private int telfEmergencia;
    private String[] especialidades;
    public Mecanico(String nombre, int telfEmergencia) {
        this.nombre = nombre;
        this.telfEmergencia = telfEmergencia;
        this.especialidades = new String [0];
    }
    public void incluirOtraEspecialidad(String especialidad){
        
        // @@ Hay que hacer primero una copiaa del array incrementando
        // @@ una unidad su tamaño. Esto está provocando el error que
        // @@ habrás visto al ejecutar:
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Personal.Mecanico.incluirOtraEspecialidad(Mecanico.java:16)
        at Main.main(Main.java:26)*/
        int nuevoTamano = especialidades.length + 1;

        especialidades = Arrays.copyOf(especialidades, nuevoTamano);

        especialidades[nuevoTamano-1]=especialidad;
    }
    public void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println(telfEmergencia);
        if (especialidades.length > 0) {
            for (String especialidad : especialidades) {
                System.out.print(especialidad + " ");
            }
        } else {
            System.out.print("No tiene especialidades.");
        }
    }
    
}

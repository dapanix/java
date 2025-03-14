package Personal;

import java.time.LocalDate;

public class JefeEstacion {
    private String nombre;
    private String Dni;
    private LocalDate nombramiento;
    public JefeEstacion(String nombre, String Dni, LocalDate nombramiento) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.nombramiento = nombramiento;
    }

    public void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println(Dni);
        System.out.println(nombramiento);
    }
}

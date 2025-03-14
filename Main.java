import Maquinaria.*;
import Personal.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        
        // 1. 
        Maquinista maquinista = new Maquinista("Juan Pérez", "12345678A", 2500, "3-4");
        maquinista.mostrarInformacion();
        
        // Aumentar sueldo
        maquinista.aumentarSueldo(300);
        // Reducir sueldo
        maquinista.reducirSueldo(150);
        // Cambiar rango
        maquinista.cambiarRango("3-7");
        
        maquinista.mostrarInformacion();



        // 2. 
        Mecanico mecanico1 = new Mecanico("Carlos Ruiz", 987654321);

        //@@ Aquí falla y termina ejecución. Grave no haberlo corregido.
        //@@ Motivo. Ver comentario en clase Mecanico.mecanico1.mostrarInformacion();
        
        // Añadir especialidades
        mecanico1.incluirOtraEspecialidad("Reparación de motores");
        mecanico1.incluirOtraEspecialidad("Mantenimiento de frenos");
        
        mecanico1.mostrarInformacion();
        
        // Crear otro Mecanico
        Mecanico mecanico2 = new Mecanico("Ana López", 123456789);
        mecanico2.mostrarInformacion();
        
        // 3.
        JefeEstacion jefeEstacion = new JefeEstacion("María García", "98765432B", LocalDate.of(2020, 1, 15));
        jefeEstacion.mostrarInformacion();
        
        // 4. 
        Mecanico nuevoMecanico = new Mecanico("David Martínez", 6942096);
        Locomotora locomotora = new Locomotora("AB123CD", 2500.5, mecanico1, 1986);
        locomotora.mostrarInformacion();
        
        // Asignar nuevo mecánico a la locomotora
        locomotora.cambiarMecanico(nuevoMecanico);
        locomotora.mostrarInformacion();
        
        // 5. 
        Vagon vagon1 = new Vagon(1, 5000, 1000, "Cereal");
        Vagon vagon2 = new Vagon(2, 4000, 1500, "Madera");
        Vagon vagon3 = new Vagon(3, 6000, 2000, "Piedra");
        Vagon vagon4 = new Vagon(4, 5500, 1200, "Cemento");
        Vagon vagon5 = new Vagon(5, 7000, 3000, "Carbón");
        
        vagon1.mostrarInformacion();
        vagon2.mostrarInformacion();
        vagon3.mostrarInformacion();
        vagon4.mostrarInformacion();
        vagon5.mostrarInformacion();
        
        // Modificar uno de los vagones
        vagon3.aumentarMercancia(100);
        vagon3.cambiarMercancia("Hierro");
        vagon3.mostrarInformacion();
        
        // 6.
        Tren tren = new Tren("AB123CD",  0, maquinista);
        
        tren.mostrarInformacion();
        tren.enganchaVagon(vagon1);
        tren.mostrarInformacion();
        tren.enganchaVagon(vagon2);
        tren.mostrarInformacion();
        tren.enganchaVagon(vagon3);
        tren.mostrarInformacion();
        tren.enganchaVagon(vagon4);
        tren.mostrarInformacion();
        tren.enganchaVagon(vagon5);
        tren.mostrarInformacion();
        System.out.println("prueba sexto vagón");
        tren.enganchaVagon(vagon1); // Prueba para ver que pasa si enganchas 6 vagones
    }
}

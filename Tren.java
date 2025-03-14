package Maquinaria;

import Personal.Maquinista;
import java.util.Arrays;

public class Tren {
    private Vagon[] listavagones;
    private String locomotora;
    private int numVagones;
    private Maquinista maquinista;

    public Tren(String locomotora, int numVagones, Maquinista maquinista) {
        if (numVagones > 5) {
            System.out.println("El número de vagones no puede ser mayor a 5. Se establecerá en 5.");
            numVagones = 5;
        }
        this.locomotora = locomotora;
        this.listavagones = new Vagon[numVagones];
        this.numVagones = 0; // Inicialmente sin vagones enganchados
        this.maquinista = maquinista;
    }

    public void enganchaVagon(Vagon vagon) {
        if (numVagones >= listavagones.length) {
            System.out.println("El tren no admite más vagones.");
            return;
        }
        listavagones[numVagones] = vagon;
        numVagones++; 
    }

    public void mostrarInformacion() {
        System.out.println("Número de vagones: " + numVagones);
        System.out.println("Locomotora: " + locomotora);
        System.out.println("Lista de vagones: " + Arrays.toString(Arrays.copyOf(listavagones, numVagones))); // Evita imprimir nulls
        if (maquinista != null) {
            System.out.print("Maquinista: ");
            maquinista.mostrarInformacion();
        } else {
            System.out.println("Maquinista: No asignado");
        }
    }
}
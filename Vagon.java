package Maquinaria;

public class Vagon {
    private int numeroIden;
    private double cargaMax;
    private double cargaActual;
    private String mercancia;

    public Vagon(int numeroIden, double cargaMax, double cargaActual, String mercancia) {
        this.numeroIden = numeroIden;
        this.cargaMax = cargaMax;
        this.cargaActual = Math.max(0, Math.min(cargaActual, cargaMax)); // Evita valores negativos o mayores a cargaMax
        this.mercancia = mercancia;
    }

    //  cambiar completamente la mercancía
    public void cambiarMercancia(String newMercancia) {
        mercancia = newMercancia;
    }

    //  aumentar mercancía con validaciones
    public void aumentarMercancia(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a agregar debe ser mayor a 0.");
            return;
        }
        if (cargaActual + cantidad > cargaMax) {
            System.out.println("Advertencia: No se puede exceder la carga máxima. Se llenará hasta el límite.");
            cargaActual = cargaMax;
        } else {
            cargaActual += cantidad;
        }
        System.out.println("Mercancía aumentada. Nueva carga actual: " + cargaActual);
    }

    //  disminuir mercancía con validaciones
    public void disminuirMercancia(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a reducir debe ser mayor a 0.");
            return;
        }
        if (cargaActual - cantidad < 0) {
            System.out.println("Advertencia: No se puede reducir más de la carga actual. Se vaciará el vagón.");
            cargaActual = 0;
        } else {
            cargaActual -= cantidad;
        }
        System.out.println("Mercancía reducida. Nueva carga actual: " + cargaActual);
    }

    public void mostrarInformacion() {
        System.out.println("Número de identificación: " + numeroIden);
        System.out.println("Carga máxima: " + cargaMax);
        System.out.println("Carga actual: " + cargaActual);
        System.out.println("Tipo de mercancía: " + mercancia);
    }
}

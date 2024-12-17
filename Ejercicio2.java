package EjsInicio.NuevosEjs;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int sandiasPequenas=0;
        int cuenta=0;
        Scanner s = new Scanner(System.in);
        float peso=1;
        float max = 0;
        while(peso>0){
            System.out.println("Introduce el peso de la sandia: ");
            peso = s.nextFloat();
            if (cuenta==0 && peso<0){
                System.out.println("no se ha introducido el peso de ninguna sandia");
                break;
            }

            if (peso>max){
                max=peso;
            }
            if (peso<2){
                sandiasPequenas++;
            }
            cuenta++;
        }
        if (cuenta!=0) {
            System.out.println("numero de sandias: " + (cuenta - 1));
            System.out.println("peso maximo de sandia: " + max);
            System.out.println("numero de sandias pequeñas: " + (sandiasPequenas - 1));
        }
    }
}

package EjsInicio.NuevosEjs;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int indice=0;
        int numeroRepetido=3;
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba la cantidad de números que quieres guardar en el array: ");
        int largo = s.nextInt();

        while (largo<=0){
            System.out.println("no puede ingresar un valor negativo o igual a 0, ingreselo de nuevo: ");
            largo = s.nextInt();
        }

        int list[]=new int [largo];
        while (indice<largo){
            System.out.println("Introduzca el elemento del array de la posición "+indice+": ");
            int input = s.nextInt();
            list[indice]=input;
            indice++;
        }
        for (int i=0; i<largo;i++){
            if (i==0){
                System.out.print("Array lista: {");
            }
            System.out.print(list[i]);
            if (i==list.length-1) {
                System.out.print("}");
                System.out.println();
            }
            else{
                System.out.print(", ");
            }
        }
        System.out.println("suma de los valores: "+sumaArray(list));
        System.out.println("numero de apariciones del numero: "+numeroRepetido+" : "+ numeroApariciones(list, numeroRepetido)+" veces");
        System.out.print("numeros pares ordenados de mayor a menor: ");
        int[]listapares =extraeParesOrdenadosInversa(list);
        if (listapares[0]==-1){
            System.out.println("no ha introduciodo ningun numero par, por lo tanto no pueden estar ordenados");
        }
        else {
            System.out.println(Arrays.toString(extraeParesOrdenadosInversa(list)));
        }

    }
    private static int sumaArray(int lista[]){
        int total=0;
        for(int i=0; i<lista.length; i++){
            total=lista[i]+total;
        }
        return total;
    }

    private static int numeroApariciones(int lista[],int valor){
        int cuenta=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==valor){
                cuenta=cuenta+1;
            }
        }
        return cuenta;
    }
    private static int[] extraeParesOrdenadosInversa(int lista[]) {
        int pares = 0;
        int cuenta = 0;
        int ParesVacios[]={-1};
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                pares++;
            }

        }
        if (pares==0){
            return ParesVacios;
        }
            else {
            int listaPares[] = new int[pares];

            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 == 0) {
                    listaPares[cuenta] = lista[i];
                    cuenta++;
                }

            }
            Arrays.sort(listaPares);
            for (int i = 0; i < listaPares.length / 2; i++) {
                int temp = listaPares[i];
                listaPares[i] = listaPares[listaPares.length - 1 - i];
                listaPares[listaPares.length - 1 - i] = temp;
            }

            return listaPares;
        }

    }
}

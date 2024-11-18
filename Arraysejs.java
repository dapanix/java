package ejsInicio.nuevosEjs;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Arraysejs {
    public static void main(String[] args) {
        //-1 imprimir el array literalmente "{1:2:3...}
        //-2 imprimir solo los numeros pares de un array
        //-3 imprimir un array de numeros aleatorios
        //-4 imprimir un array invertido
        //-5imprimir un array en orden numerico
        Scanner s = new Scanner(System.in);
        System.out.println("como de largo quieres el array?:");
        int largo = s.nextInt();
        Scanner input = new Scanner(System.in);
        int[] array = new int[largo];

        for (int i = 0; i < array.length; i++) {
            System.out.println("inserta un numero en el array: ");
            array[i] = input.nextInt();
        }






        arrayLiteral(array);
        arrayPares(array);
        arrayRandom(largo);
        arrayOrdenado(array);
    }
    static void arrayLiteral(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (i==0){
                System.out.print("arrayLiteral: {");
            }
            System.out.print(arr[i]);
            if (i==arr.length-1) {
                System.out.print("}");
            }
            else{
                System.out.print(", ");
            }
        }
    }
    static void arrayPares(int[]arr){
        ArrayList<Integer> pares = new ArrayList<Integer>();
        System.out.println();
        for (int j : arr) {
            if (j % 2 == 0) {
                pares.add(j);
            }
        }
        System.out.println("arrayPares: "+pares);
    }
    static void arrayRandom(int lar){
        ArrayList<Integer> randoom = new ArrayList<Integer>();
        for (int i=0;i<lar;i++){
            Random rand = new Random();
            int r1 = rand.nextInt(100);
            randoom.add(r1);
        }
        System.out.println("arrayRandom: "+randoom);
    }
    static void arrayOrdenado(int[] arr){

    }
}

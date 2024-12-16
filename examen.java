
import java.util.Arrays;
import java.util.Scanner;

public class examen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("valor que quiere que se repita: ");
        int valor = sc.nextInt();
        System.out.println();
        int list []={1,3,5,1,7,8,10};
        guardaEnRango(list,3,10);
        System.out.println("el valor "+valor+" se repite "+ numeroOcurrencias(list, valor)+" veces");
        System.out.println(Arrays.toString(extraePares(list)));
        
    }
    private static void guardaEnRango(int lista[],int desde,int hasta ){
        for (int i = 0; i < lista.length; i++) {
            if (i>=desde-1 && i<=hasta+1){
                System.out.println(lista[i]);
            }
        }

    }
    private static int numeroOcurrencias(int lista[],int valor){
        int cuenta=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==valor){
                cuenta=cuenta+1;
            }
        }
        return cuenta;
    }
    private static int[] extraePares(int lista[]){
        int pares=0;
        int cuenta=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]%2==0){
                pares++;
            }
            
        }
        int listaPares[] = new int[pares];
        
        for (int i = 0; i <lista.length; i++) {
            if(lista[i]%2==0){
                listaPares[cuenta]=lista[i];
                cuenta++;
            }
            
        }
        return listaPares;
    }

}
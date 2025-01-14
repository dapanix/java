package EjsInicio.NuevosEjs;
import java.util.Random;
import java.util.Scanner;

public class cuadradoMagico {
    public static void main(String[] args) {
        int acumulacion2=0;
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tamaño desea de el cuadrado magico: ");
        int tamano = sc.nextInt();
        System.out.println("cual quieres que sea el maximo de las celdas: ");
        int num = sc.nextInt();
        int maximo = num-(tamano-1);
            int[] array0 =new int[tamano];
            int[] array1 =new int[tamano];
            int[] array2 =new int[tamano];
            int[] array3 =new int[tamano];
            int [] arrayTotal[]={array0, array1, array2, array3};
            if (tamano!=4){
                array3=null;
            }
            for (int i=0; i<tamano; i++) {
                int acumulacion=0;
                for (int j = 0; j < tamano; j++) {
                    acumulacion=arrayTotal[i][j]+acumulacion;
                    //arrayTotal[i][j]
                    if (j==0){
                        arrayTotal[i][j]= ran.nextInt(maximo);
                    }
                    if (j==tamano-1){

                        arrayTotal[i][j]=num-acumulacion;
                    }
                    else if (j!=0 && j!=tamano-1) {
                        arrayTotal[i][j]= ran.nextInt(num-acumulacion);
                    }

                }
            }
        for (int i=0; i<tamano; i++) {
            acumulacion2=0;
            for (int j = 0; j < tamano; j++) {
                if (acumulacion2!=num){
                    arrayTotal[2][j]=num-(arrayTotal[0][j]+arrayTotal[1][j]);
                    if (num - (arrayTotal[0][j] + arrayTotal[1][j]) < 0) {

                    }
                }

                acumulacion2=arrayTotal[j][i]+acumulacion2;
            }
        }

        System.out.println(arrayTotal);
















        }
    }






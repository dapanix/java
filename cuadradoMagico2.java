package EjsInicio.NuevosEjs.Daniel_Fernandez_ExProgramacion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cuadradoMagico2 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("cual quieres que sea el maximo de las celdas: ");
        int num = sc.nextInt();
        int maximo = num-(2);
        int[] array0 =new int[3];
        int[] array1 =new int[3];
        int[] array2 =new int[3];
        int[][] arrayTotal ={array0, array1, array2};

        for (int i=0; i<3; i++) {
            int acumulacion=0;
            for (int j = 0; j < 3; j++) {

                if (j==0){
                    arrayTotal[i][0]= ran.nextInt(maximo);
                }
                if (j==2){

                    arrayTotal[i][2]=num-acumulacion;
                }
                if (j==1) {
                    arrayTotal[i][1]= ran.nextInt(num-acumulacion);
                }
                acumulacion=arrayTotal[i][j]+acumulacion;


            }

        }
        for (int i=0; i<3; i++) {
            int acumulacion=0;
            for (int j = 0; j < 3; j++) {

                if (j==2){
                    while (num-acumulacion<0){
                        arrayTotal[j][1]=ran.nextInt(num-acumulacion);
                    }
                    arrayTotal[j][2]=num-(num-arrayTotal[j][1]+num-arrayTotal[j][2]);
                }
                acumulacion=arrayTotal[j][i]+acumulacion;


            }

        }
        }


    }

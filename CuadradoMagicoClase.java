package EjsInicio.NuevosEjs;

import java.util.Arrays;
import java.util.Scanner;

public class CuadradoMagicoClase {
    public static void main(String[] args) {
        int z;
        int fila=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("tamaño del cuadrado (debe ser multiplo de 4): ");
        boolean pintado=false;
        int tamano = sc.nextInt();
        int[] cuadradoTotal = new int[tamano * tamano];
        int[] A = new int[tamano / 2];
        int[] B = new int[tamano];
        int[] C = new int[tamano / 2];
        int[] D = new int[tamano];
        int[] E = new int[tamano * 2];
        int[] F = new int[tamano];
        int[] G = new int[tamano / 2];
        int[] H = new int[tamano];
        int[] I = new int[tamano / 2];
        int[] X1 = new int[tamano * 2];
        int[] X2 = new int[tamano * 2];
        int[] X3 = new int[tamano * 2];
        int[] X4 = new int[tamano * 2];
        int[][] Cuadradoarrays = {X1, X2, X3, X4};
        for (int i = 0; i < tamano * tamano; i++) {
            cuadradoTotal[i] = i + 1;
        }

        for (int i = 0; i < 4; i++) {
            int contador = 0;
            for (int j = 0; j < tamano * 2; j++) {
                if (i == 2 && j == 0) {
                    contador = contador + tamano - (tamano / 4);
                }
                if (i != 3) {
                    z = 0;
                } else {
                    z = tamano * tamano - tamano * 2;
                }


                if (i == 1 || i == 2) {
                    Cuadradoarrays[i][j] = cuadradoTotal[contador];
                    if ((j + 1) % 2 == 0) {
                        contador += tamano - (tamano / 4);
                    }
                } else {
                    Cuadradoarrays[i][j] = cuadradoTotal[j + z];
                }
                contador += 1;


            }
        }
        encontrarComunes(X1, X2, A);
        encontrarComunes(X1, X3, C);
        encontrarComunes(X2, X4, G);
        encontrarComunes(X3, X4, I);
        encontrarNOComunes(X1, X2, X3, B);
        encontrarNOComunes(X2, X1, X4, D);
        encontrarNOComunes(X3, X1, X4, F);
        encontrarNOComunes(X4, X2, X3, H);
        cuadradoCentral(cuadradoTotal, X1, X2, X3, X4, E);
        ordenInverso.invertirArray(B);
        ordenInverso.invertirArray(D);
        ordenInverso.invertirArray(F);
        ordenInverso.invertirArray(H);

        /*System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(G));
        System.out.println(Arrays.toString(I));
        System.out.println("B"+Arrays.toString(B));
        System.out.println("D"+Arrays.toString(D));
        System.out.println("F"+Arrays.toString(F));
        System.out.println("H"+Arrays.toString(H));
        System.out.println("E"+Arrays.toString(E));
        System.out.println(Arrays.toString(X1));
        System.out.println(Arrays.toString(X2));
        System.out.println(Arrays.toString(X3));
        System.out.println(Arrays.toString(X4));*/

        /*System.out.print(Arrays.toString(A));
        System.out.print(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        System.out.print(Arrays.toString(D));
        System.out.print(Arrays.toString(E));
        System.out.println(Arrays.toString(F));
        System.out.print(Arrays.toString(G));
        System.out.print(Arrays.toString(H));
        System.out.print(Arrays.toString(I));*/

        int[][] granCuadrado=  {A,H,C,
                                F,E,D,
                                G,B,I};
        if (tamano > 4) {


            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (!pintado){
                        System.out.print(" "+granCuadrado[i][j]+" ");
                    }
                    pintado=false;

                    if (i<=3) {
                        if (granCuadrado[i][tamano / 4-1] == granCuadrado[i][j]) {
                            i = i + 1;
                            j=0;
                            System.out.print(" "+granCuadrado[i][j]+" ");
                            pintado=true;
                        } else if (granCuadrado[i][tamano/2-1] == granCuadrado[i][j]) {
                            i = i + 1;
                            j=0;
                            System.out.print(" "+granCuadrado[i][j]+" ");
                            pintado=true;
                        }
                        if (i==3 && fila<tamano/4){
                            fila=fila+1;
                            i=0;
                            j=tamano/4;
                        }


                    }
                    if (i<=6 && i>3){
                        if (granCuadrado[i][j+1] ==tamano/4){

                        }
                    }

                }
            }


        }


    }

    public static int[] encontrarComunes(int[] array1, int[] array2, int[] arrayDestino) {
        int cont = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    arrayDestino[cont] = array1[i];
                    cont = cont + 1;
                }
            }
        }

        return arrayDestino;
    }

    public static int[] encontrarNOComunes(int[] array1, int[] array2, int[] array3, int[] arrayDestino) {
        int cont = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean encontradoEnArray2 = false;
            boolean encontradoEnArray3 = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    encontradoEnArray2 = true;
                    break;
                }
            }

            for (int j = 0; j < array3.length; j++) {
                if (array1[i] == array3[j]) {
                    encontradoEnArray3 = true;
                    break;
                }
            }

            if (!encontradoEnArray2 && !encontradoEnArray3) {
                arrayDestino[cont] = array1[i];
                cont++;
            }
        }
        return(arrayDestino);
    }
    public static int[]cuadradoCentral(int[] total, int[] array1, int[] array2, int[] array3, int array4[], int[] arrayDestino){
        int cont = 0;
        for (int i = 0; i < total.length; i++) {
            boolean encontradoEnArray2 = false;
            boolean encontradoEnArray3 = false;
            boolean encontradoEnArray1 = false;
            boolean encontradoEnArray4 = false;

            for (int j = 0; j < array2.length; j++) {
                if (total[i] == array2[j]) {
                    encontradoEnArray2 = true;
                    break;
                }
            }

            for (int j = 0; j < array3.length; j++) {
                if (total[i] == array3[j]) {
                    encontradoEnArray3 = true;
                    break;
                }
            }
            for (int j = 0; j < array2.length; j++) {
                if (total[i] == array1[j]) {
                    encontradoEnArray1 = true;
                    break;
                }
            }
            for (int j = 0; j < array2.length; j++) {
                if (total[i] == array4[j]) {
                    encontradoEnArray4 = true;
                    break;
                }
            }

            if (!encontradoEnArray2 && !encontradoEnArray3 && !encontradoEnArray4 && !encontradoEnArray1) {
                arrayDestino[cont] = total[i];
                cont++;
            }
        }
        return arrayDestino;


    }

}
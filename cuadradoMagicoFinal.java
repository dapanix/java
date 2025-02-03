package EjsInicio.NuevosEjs;
import java.lang.Math;
import java.util.Arrays;

public class cuadradoMagicoFinal {
    public static void main(String[] args) {

        int tamano = 8;
        int [] cuadradofinal=new int [tamano*tamano];
        int tamanototal=tamano*tamano;
        int[][] cuadradoTotal = new int[tamano][];


        for (int i = 0; i < tamano; i++){
            cuadradoTotal[i]= new int[tamano];
        }
        int cont2=0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                cont2=cont2+1;
                cuadradoTotal[i][j]=cont2;
            }
        }

        // codigo para seleccionar el bloque B y cambiarlo por el H
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i<=tamano/4 && j>=tamano/4 && j<tamano-tamano/4){
                    cuadradofinal[(tamanototal-(tamano-(tamano-j))-(tamano*i))-1]=cuadradoTotal[i][j];
                }
            }
        }
        //cambiar el bloqe H y cambiarlo por el B
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i>=tamano-tamano/4 && j>=tamano/4 && j<tamano-tamano/4){
                    cuadradofinal[(tamanototal-(tamano-(tamano-j))-(tamano*i))-1]=cuadradoTotal[i][j];
                }
            }
        }
        //cambiar el D por el F
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j<tamano/4 && i>=tamano/4 && i<tamano-tamano/4){
                    cuadradofinal[(tamanototal-(tamano-(tamano-j))-(tamano*i))-1]=cuadradoTotal[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(cuadradofinal));


    }
    void voltearHorizontal(int[] cuadradoTotal){



    }
}

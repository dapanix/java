package EjsInicio.NuevosEjs;

import java.util.Arrays;

public class CuadradoMagicoClase {
    public static void main(String[] args) {
        int z=48;
        final int tamano=8;
        int[]CuadradoTotal =new int[tamano*tamano];
        int []A =new int[tamano/2];
        int []B=new int [tamano];
        int []C =new int[tamano/2];
        int []D=new int [tamano];
        int []E=new int [tamano*2];
        int []F=new int [tamano];
        int []G=new int [tamano/2];
        int []H=new int [tamano];
        int []I=new int [tamano/2];
        int []X1 =new int [tamano*2];
        int []X2 =new int [tamano*2];
        int []X3 =new int [tamano*2];
        int []X4 =new int [tamano*2];
        int[][]Cuadradoarrays={X1,X2,X3,X4};
        for (int i=0;i<tamano*tamano;i++){
            CuadradoTotal[i]=i+1;
        }

        for (int i=0; i<4;i++) {
            int contador=0;
            for (int j = 0; j < tamano* 2; j++) {
                if (i==2 && j==0){
                    contador= contador+tamano-(tamano/4);
                }
                if (i!=3){
                    z=0;
                }
                else{
                    z=tamano*tamano-tamano*2;
                }



                if (i==1 || i==2){
                    Cuadradoarrays[i][j] = CuadradoTotal[contador];
                    if ((j+1)%2==0){
                        contador += tamano-(tamano/4);
                    }
                }
                else{
                    Cuadradoarrays[i][j] = CuadradoTotal[j+z];
                }
                contador+=1;


            }
        }







        System.out.println(Arrays.toString(X1));
        System.out.println(Arrays.toString(X2));
        System.out.println(Arrays.toString(X3));
        System.out.println(Arrays.toString(X4));
    }
}
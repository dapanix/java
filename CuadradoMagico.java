import java.util.Arrays;
import java.util.Scanner;

public class CuadradoMagico {

    public static void main(String[] args) {
        //la logica que vamos a seguir la encontramos en el siguiente video https://youtu.be/HKjrhLoqei0?si=sPXSxZ7rZJdOrfEW
        //nota: mi el video lo he visto hasta el minuto 10, NO he querido ver la explicacion para programarlo, tan solo la logica, 
        //por lo que muy probablemente haya diferencias y el codigo no sera lo mas optimo posible

         Scanner sc = new Scanner(System.in);
        System.out.println("tamaño del cuadrado (debe ser impar): ");
        int tamano = sc.nextInt();
        int cuenta=1;
        int f=0;//fila
        boolean sumado;
        boolean pintado;
        boolean divisor;
        int c=tamano/2;//columna
        int[] array1 =new int[tamano];
        int[] array2 =new int[tamano];
        int[] array3 =new int[tamano];
        int[][] arrays ={array1, array2, array3};
        

        for (int i=0;i<tamano;i++){
            for (int j=0;j<tamano;j++){
                pintado=false;
                if ((c>=0 && f>=0)){
                    arrays[f][c]=cuenta; 
                    pintado=true;
                }
                 if ((c<0)){
                    c=c+tamano;

                }
                else if ((f<0)){
                     f=f+tamano;

                }
                else if((cuenta%tamano==0)&&(cuenta!=0)){
                    f=f+1; 
                    arrays[f][c]=cuenta; 
                    pintado=true;
                }
                else {
                    f=f-1;
                    c=c-1;
                }
                if (pintado){
                    cuenta=cuenta+1;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        



    }
}
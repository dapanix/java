package Matrices2;

import java.util.Arrays;

public class Matriz2 {
    private int[][] matriz;

    public Matriz2() {
        this.matriz = new int [4][4];
    }
    public Matriz2(int[][] matriz){
        this.matriz = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
                this.matriz[i][j]=matriz[i][j];
           }
        }
    }
    public Matriz2(int a, int b){
        this.matriz= new int[a][b];
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public static void voltearHorizontal2(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length / 2; j++) { 
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][matriz[i].length - 1 - j];
                matriz[i][matriz[i].length - 1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matriz)); 
    }

    
}

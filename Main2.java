package EjsInicio.NuevosEjs.Hora.Matrices2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[][] ejemplo = {{1, 2, 3}, {2, 6, 7}, {5, 9, 0}};
        Matriz2.mostrarMatriz(ejemplo);
        Matriz2 matriz = new Matriz2(ejemplo);
        Matriz2.mostrarMatriz(matriz.getMatriz());

        Matriz2.voltearHorizontal2(matriz.getMatriz());
        Matriz2.mostrarMatriz(matriz.getMatriz());

        Matriz2.voltearVertical2(matriz.getMatriz());
        Matriz2.mostrarMatriz(matriz.getMatriz());

        Matriz2.esCuadradoMagico(matriz.getMatriz());

        Matriz2.mostrarMatriz(matriz.getMatriz());
        int[] diagonal= matriz.dameDiagonal(3);
        System.out.println("diagonal:");
        System.out.println(Arrays.toString(diagonal));
        int[][] subMatriz = matriz.dameSubMatriz(1,0,2,2);
        System.out.println(Arrays.deepToString(subMatriz));
    }
}

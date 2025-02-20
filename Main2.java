package EjsInicio.NuevosEjs.Hora.Matrices2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
                System.out.println("Caso 1: Creación matriz m1 de 4x4 rellena de valores consecutivos y mostrar");
                int[][] valores = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };
                Matriz2 m1 = new Matriz2(valores);
                Matriz2.mostrarMatriz(m1.getMatriz());

                System.out.println("Caso 2: Creada matriz cuadroMagico con constructor Matriz() y mostrar");
                Matriz2 cuadroMagico = new Matriz2();
                Matriz2.mostrarMatriz(cuadroMagico.getMatriz());

                System.out.println("Caso 3: Asigna a cuadroMagico un array de 3x3 con valores de un cuadro mágico y mostrar");
                int[][] magico = {
                        {4, 9, 2},
                        {3, 5, 7},
                        {8, 1, 6}
                };
                cuadroMagico.setMatriz(magico);
                Matriz2.mostrarMatriz(cuadroMagico.getMatriz());

                System.out.println("Caso 4: Comprueba si mCuadroMagico es un cuadro mágico");
                System.out.println("mCuadroMagico " + (Matriz2.esCuadradoMagico(cuadroMagico.getMatriz()) ? "SI es cuadro mágico" : "NO es cuadro mágico"));

                System.out.println("Caso 5: Comprueba si m1 es un cuadro mágico");
                System.out.println("m1 " + (Matriz2.esCuadradoMagico(m1.getMatriz()) ? "SI es cuadro mágico" : "NO es cuadro mágico"));

                System.out.println("Caso 6: Extrae submatriz (0,0,1,1) de m1, y mostrar");
                Matriz2.mostrarMatriz(m1.dameSubMatriz(0, 0, 1, 1));

                System.out.println("Caso 7: Extrae submatriz (3,3,3,3) de m1, y mostrar");
                Matriz2.mostrarMatriz(m1.dameSubMatriz(3, 3, 3, 3));

                System.out.println("Caso 8: Extrae submatriz (1,2,3,3) de m1");
                try {
                    Matriz2.mostrarMatriz(m1.dameSubMatriz(1, 2, 3, 3));
                } catch (Exception e) {
                    System.out.println("Error. Submatriz no se puede ubicar dentro de la matriz.");
                }

                System.out.println("Caso 9: Coloca submatriz cuadroMagico en m1 en (0,1), y mostrar");
                m1.colocaSubMatriz(0, 0, cuadroMagico.getMatriz());
                Matriz2.mostrarMatriz(m1.getMatriz());

                System.out.println("Caso 10: Coloca submatriz cuadroMagico en m1 en (2,2)");
                try {
                    m1.colocaSubMatriz(2, 2, cuadroMagico.getMatriz());
                } catch (Exception e) {
                    System.out.println("Error. Coordenadas incorrectas o submatriz no se puede ubicar dentro de la matriz.");
                }

                System.out.println("Caso 11: Voltea m1 en horizontal, y mostrar");
                Matriz2.voltearHorizontal2(m1.getMatriz());
                Matriz2.mostrarMatriz(m1.getMatriz());

                System.out.println("Caso 12: Voltea m1 en vertical, y mostrar");
                Matriz2.voltearVertical2(m1.getMatriz());
                Matriz2.mostrarMatriz(m1.getMatriz());

                System.out.println("Caso 13: Muestra diagonales de m1, y mostrar");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Diagonal " + i);
                    int[] diag = m1.dameDiagonal(i);
                    for (int num : diag) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }

                System.out.println("Caso 14: Crea array arrayIrregular y trata de crear una matriz con él");
                int[][] arrayIrregular = {
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0}
                };
                try {
                    Matriz2 matrizIrregular = new Matriz2(arrayIrregular);
                    Matriz2.mostrarMatriz(matrizIrregular.getMatriz());
                } catch (Exception e) {
                    System.out.println("Error: array no es regular");
                }

    }
}
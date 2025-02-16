package Matrices;

public class Main {
    public static void main(String[] args) {
        //Crear matrices usando cada constructor
        Matriz matriz1 = new Matriz(); // 4x4 rellena de ceros
        int[][] valores = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matriz matriz2 = new Matriz(valores); // Matriz a partir de un array
        Matriz matriz3 = new Matriz(3, 3); // Matriz 3x3 rellena de ceros

        //Mostrar matrices creadas
        System.out.println("Matriz 1 (4x4 por defecto):");
        matriz1.imprimirMatriz();
        System.out.println("\nMatriz 2 (desde array bidimensional):");
        matriz2.imprimirMatriz();
        System.out.println("\nMatriz 3 (3x3 vacía):");
        matriz3.imprimirMatriz();

        //Probar setters y getters
        matriz3.setValor(1, 1, 5);
        System.out.println("\nMatriz 3 después de setValor(1,1,5):");
        matriz3.imprimirMatriz();

        // 4. Probar voltearHorizontal
        Matriz volteadaH = matriz2.voltearHorizontal();
        System.out.println("\nMatriz 2 volteada horizontalmente:");
        volteadaH.imprimirMatriz();

        // 5. Probar voltearVertical
        Matriz volteadaV = matriz2.voltearVertical();
        System.out.println("\nMatriz 2 volteada verticalmente:");
        volteadaV.imprimirMatriz();

        // 6. Probar esCuadroMagico
        System.out.println("\n¿Matriz 2 es un cuadrado mágico? " + matriz2.esCuadroMagico());

        // 7. Probar dameDiagonal
        System.out.println("\nDiagonal 0 de Matriz 2:");
        int[] diagonal0 = matriz2.dameDiagonal(0);
        for (int num : diagonal0) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 8. Probar dameSubMatriz
        Matriz subMatriz = matriz2.dameSubMatriz(0, 0, 1, 1);
        System.out.println("\nSubmatriz de Matriz 2 (0,0 a 1,1):");
        subMatriz.imprimirMatriz();

        // 9. Probar colocaSubMatriz
        System.out.println("\nMatriz 1 antes de colocar submatriz:");
        matriz1.imprimirMatriz();
        matriz1.colocaSubMatriz(1, 1, matriz2);
        System.out.println("\nMatriz 1 después de colocar Matriz 2 en (1,1):");
        matriz1.imprimirMatriz();
    }
}
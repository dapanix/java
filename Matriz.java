package Matrices;

public class Matriz {
    private int[][] matriz;

    // Constructor por defecto: matriz 4x4 rellena de ceros
    public Matriz() {
        this.matriz = new int[4][4];
    }

    // Constructor que recibe un array bidimensional
    public Matriz(int[][] matriz) {
        this.matriz = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            System.arraycopy(matriz[i], 0, this.matriz[i], 0, matriz[i].length);
        }
    }

    // Constructor que recibe dos números enteros n y m
    public Matriz(int n, int m) {
        this.matriz = new int[n][m];
    }

    // Getters y Setters
    public int[][] getMatriz() {
        return matriz;
    }

    public void setValor(int fila, int columna, int valor) {
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            matriz[fila][columna] = valor;
        } else {
            throw new IndexOutOfBoundsException("Índices fuera de rango");
        }
    }

    // Método para imprimir la matriz
    public void imprimirMatriz() {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d ", valor);
            }
            System.out.println();
        }
    }

    // Método para voltear la matriz horizontalmente
    public Matriz voltearHorizontal() {
        int filas = matriz.length, columnas = matriz[0].length;
        int[][] nuevaMatriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                nuevaMatriz[i][j] = matriz[i][columnas - 1 - j];
            }
        }
        return new Matriz(nuevaMatriz);
    }

    // Método para voltear la matriz verticalmente
    public Matriz voltearVertical() {
        int filas = matriz.length, columnas = matriz[0].length;
        int[][] nuevaMatriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            nuevaMatriz[i] = matriz[filas - 1 - i];
        }
        return new Matriz(nuevaMatriz);
    }

    // Método para verificar si es un cuadrado mágico
    public boolean esCuadroMagico() {
        int sumaReferencia = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            sumaReferencia += matriz[0][j];
        }
        for (int i = 1; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) return false;
        }
        return true;
    }

    public int[] dameDiagonal(int cualDiagonal) {
        int n = matriz.length;
        int[] diagonal = new int[n];
        switch (cualDiagonal) {
            case 0:
                for (int i = 0; i < n; i++) diagonal[i] = matriz[i][i];
                break;
            case 1:
                for (int i = 0; i < n; i++) diagonal[i] = matriz[i][n - 1 - i];
                break;
            case 2:
                for (int i = 0; i < n; i++) diagonal[i] = matriz[n - 1 - i][i];
                break;
            case 3:
                for (int i = 0; i < n; i++) diagonal[i] = matriz[n - 1 - i][n - 1 - i];
                break;
            default:
                System.out.println("Diagonal inválida");
        }
        return diagonal;
    }

    public Matriz dameSubMatriz(int x1, int y1, int x2, int y2) {
        int[][] subMatriz = new int[x2 - x1 + 1][y2 - y1 + 1];
        for (int i = x1; i <= x2; i++) {
            System.arraycopy(matriz[i], y1, subMatriz[i - x1], 0, y2 - y1 + 1);
        }
        return new Matriz(subMatriz);
    }

    public void colocaSubMatriz(int x1, int y1, Matriz m) {
        int[][] subMatriz = m.getMatriz();
        for (int i = 0; i < subMatriz.length; i++) {
            for (int j = 0; j < subMatriz[0].length; j++) {
                matriz[x1 + i][y1 + j] = subMatriz[i][j];
            }
        }
    }
}
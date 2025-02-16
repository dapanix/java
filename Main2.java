package Matrices2; 

public class Main2 {
    public static void main(String[] args) {
        int[][] ejemplo = {{1, 2, 3}, {2, 6, 7}, {5, 9, 0}};
        Matriz2 matriz = new Matriz2(ejemplo);

        Matriz2.voltearHorizontal(matriz.getMatriz());
    }
}

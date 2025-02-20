package EjsInicio.NuevosEjs.Hora.Matrices2;



public class Matriz2 {
    private int[][] matriz;

    public Matriz2() {
        this.matriz = new int[4][4];
    }

    public Matriz2(int[][] matriz) {
        this.matriz = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }

    public Matriz2(int a, int b) {
        this.matriz = new int[a][b];
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
    }

    public static void voltearVertical2(int[][] matriz) {
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[matriz.length - 1 - i][j];
                matriz[matriz.length - 1 - i][j] = temp;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%" + 3 + "d ", matriz[i][j]));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean esCuadradoMagico(int[][] matriz) {
        int cuenta1 = 0;
        int cuenta2 = 0;
        int cuenta3 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    cuenta1 = cuenta1 + matriz[i][j];
                }
                if (i == 0) {
                    cuenta2 = cuenta2 + matriz[i][j];
                }
                if (j == i) {
                    cuenta3 = cuenta3 + matriz[i][j];
                }
            }
        }
        if (cuenta1 == cuenta3 && cuenta2 == cuenta3) {
            return true;
        } else {

            System.out.println("la diagonal suma: " + cuenta3 + ", la columna suma " + cuenta1 + ", la fila suma " + cuenta2 + ", por lo que no es cuadrado magico ");
            return false;
        }
    }

    public int[] dameDiagonal(int cual){
        int[] def={0};
        int[] d0=new int [matriz.length];
        int cuenta1=0;
        int[] d1=new int [matriz.length];
        int[] d2=new int [matriz.length];
        int[] d3=new int [matriz.length];
        int cuenta2=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    d0[cuenta1] = matriz[i][j];
                    d3[matriz.length - cuenta1 - 1] = matriz[i][j];
                    cuenta1++;

                }
                if (j + i+1 == matriz.length) {
                    d1[cuenta2] = matriz[i][j];
                    d2[matriz.length - cuenta2 - 1] = matriz[i][j];
                    cuenta2++;
                }
            }
        }
            switch(cual) {
                case 0:
                    return d0;
                case 1:
                    return d1;
                case 2:
                    return d2;
                case 3:
                    return d3;
                default:
                    System.out.println("inserte un numero del 0 al 3");
                    return def;
            }

    }
    public int[][] dameSubMatriz(int x1, int y1, int x2, int y2) {
        int filas = Math.abs(y2 - y1) + 1;
        int columnas = Math.abs(x2 - x1) + 1;

        int[][] subMatriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                subMatriz[i][j] = matriz[y1 + i][x1 + j]; // Ajustamos índices
            }
        }

        return subMatriz;
    }
    int conti=0;
    int contj=0;
    public void colocaSubMatriz(int x1, int y1, int[][] m1){
        for (int i = y1; i < m1.length; i++) {
            y1++;
            for (int j = x1; j < m1[i].length; j++) {
                matriz[x1][y1]=m1[i][j];
                x1++;
            }
            x1=0;
        }
    }
}
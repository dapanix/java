package ejsInicio;

public class Ej6U3triangulo {
    public static void main(String[] args) {
        int altura=10;
        int j=0;
        int i=0;
        for (;i<=10;i++){
            for (;j<=10;j++){
                altura=altura-1;

                    System.out.println(" ".repeat(altura) + "*".repeat(j * 2+1));
                
            }
        }
    }
}

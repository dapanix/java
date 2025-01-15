package EjsInicio.NuevosEjs;import java.util.Arrays;


public class ordenInverso {
    public static void main(String[] args) {
        int[] array = {1, 6, 2, 3, 9, 12, 9, 2};
        invertirArray(array);

    }

    public static void invertirArray(int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }
    }
}

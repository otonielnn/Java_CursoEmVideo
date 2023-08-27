package vetores;

import java.util.Arrays;

public class Vetor2 {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};
        Arrays.sort(num);
        for (int valor: num) {
            System.out.println(valor);
        }
    }
}

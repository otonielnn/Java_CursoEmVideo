package vetores;

import java.util.Arrays;

public class Vetor3 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet);
        for (int v:vet) {
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("\nEncontrei o valor na posição " + p);
    }
}

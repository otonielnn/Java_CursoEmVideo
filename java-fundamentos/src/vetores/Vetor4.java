package vetores;

import java.util.Arrays;

public class Vetor4 {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 7);
        for(int i: v) {
            System.out.println(i);
        }
    }
}

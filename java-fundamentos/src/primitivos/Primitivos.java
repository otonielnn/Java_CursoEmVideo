package primitivos;

import java.util.*;

public class Primitivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua altura: ");
        float altura = input.nextFloat();
        System.out.printf("Eu sou %s e tenho %.2f.\n", nome, altura);
        input.close();
    }
}

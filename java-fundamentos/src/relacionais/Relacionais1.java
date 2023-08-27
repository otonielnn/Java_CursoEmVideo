package relacionais;

import java.util.Scanner;

public class Relacionais1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Em qual ano você nasceu? ");
        int nasc = input.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        input.close();
    }
}

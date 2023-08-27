package condicionais;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Em qual ano você nasceu? ");
        int nasc = input.nextInt();
        int idade = 2023 - nasc;
        if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto Opcional");
        } else {
            System.out.println("Voto Obrigatório");
        }
        System.out.println(idade);
        input.close();
    }
}

package condicionais;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas = input.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            
            case 2:
                tipo = "Bípede";
                break;

            case 4:
                tipo = "Quadrúpede";
                break;

            case 6, 8:
                tipo = "Aranha";
                break;

            default:
                tipo = "Et";
        }
        System.out.println(tipo);
        input.close();
    }
}

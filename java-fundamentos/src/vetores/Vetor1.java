package vetores;

public class Vetor1 {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int c = 0; c < total.length; c++) {
            System.out.println("O Mês " + mes[c] + " Tem " + total[c] + " Dias");
        }
    }
}

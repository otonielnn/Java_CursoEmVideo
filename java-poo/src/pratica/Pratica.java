package pratica;

public class Pratica {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(7777);
        conta1.setDono("Otoniel");
        conta1.abrirConta("cc");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(6666);
        conta2.setDono("Juliana");
        conta2.abrirConta("CP");

        conta1.depositar(100);
        conta2.depositar(500);
        conta1.sacar(150);

        conta1.fecharConta();
        conta1.getSaldo();

        System.out.println("---------------------------");
        conta1.estado();
        System.out.println("------------------------");
        conta2.estado();
    }
}

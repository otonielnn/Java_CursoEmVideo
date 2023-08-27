package exerciciopratico;

public class main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Otoniel", 21, "M");

        l[0] = new Livro("Apredendo Java", "José da silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro paulo", 300, p[1]);
        l[2] = new Livro("Java Avançado", "Maria candido", 800, p[0]);

        l[0].abrir();
        l[0].voltarPag();
        l[0].folhear(100);
        l[0].avançarPag();
        l[0].detalhes();

    }
}

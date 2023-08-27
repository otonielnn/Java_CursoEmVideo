package projetofinal;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Otoniel", 21, "M", "juninho");
        g[1] = new Gafanhoto("Creuza", 40, "F", "Creuzita");

        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[0]);
        vi[0].avaliar(5);
        System.out.println(vi[0].toString());

        vi[1] = new Visualizacao(g[0], v[2]);
        vi[1].avaliar(35.0f);
        System.out.println(vi[1].toString());
    }
}

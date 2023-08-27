package exerciciopratico;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setPaginaAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Detalhes do livro: " + this.getTitulo());
        System.out.println("O livro foi escrito pelo autor: " + this.getAutor());
        System.out.println("Tem um total de " + this.getTotalPaginas() + " Páginas.");
        System.out.println("está aberto? " + this.isAberto());
        System.out.println("Página atual: " + this.getPaginaAtual());
    }

    @Override
    public void abrir() {
        if (this.isAberto()) {
            System.out.println("O livro já está aberto!!!");
        } else {
            this.setAberto(true);
        }
        
    }

    @Override
    public void avançarPag() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("Abra o livro para poder avançar de página!!!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("O livro já está fechado!!!");
        }
        
    }

    @Override
    public void folhear(int pagina) {
        if (this.isAberto()) {
            this.setPaginaAtual(pagina);
        } else {
            System.out.println("Abra o livro para poder folhear!!!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("Abra o livro para poder voltar de página!!!");
        }
    }

    
}

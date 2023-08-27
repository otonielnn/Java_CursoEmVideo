package ultraemojicombat;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    // Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRoud() {
        return round;
    }

    public void setRoud(int roud) {
        this.round = roud;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado) {
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (this.isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = 0 + (int)(Math.random() * 3);
            switch (vencedor) {
                // Empate
                case 0:
                    System.out.println("Empatou!!!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                // Ganhou Desafiado
                case 1:
                    System.out.println("O " + desafiado.getNome() + " Venceu!!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                // Ganhou Desafiante
                case 2:
                    System.out.println("O " + desafiante.getNome() + " Venceu!!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!!!");
        }
    }
}

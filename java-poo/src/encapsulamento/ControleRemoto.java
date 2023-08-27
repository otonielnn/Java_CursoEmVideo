package encapsulamento;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int setVolume(int volume) {
        return this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if (this.isLigado()) {
            System.out.println("A TV já está ligada!!!");
        } else {
            System.out.println("Ligando a TV...");
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado()) {
            System.out.println("Desligando a TV...");
            this.setLigado(false);
        } else {
            System.out.println("A TV já está desligada!!!");
        }
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está Tocando? " + this.isTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("A TV está desligada!!!");
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("A TV está desligada!!!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else if (this.isTocando()) {
            System.out.println("Não conseguir reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar.");
        }
    }
}

package encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.desligar();
        controle.abrirMenu();
        controle.ligar();
        controle.maisVolume();
        controle.fecharMenu();
        controle.desligar();
    }
}

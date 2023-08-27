package classe;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status () {
        System.out.println("Uma caneta " + this.cor + " do modelo " + this.modelo);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Nivel da carga: " + this.carga);
        System.out.println("ponta: " + this.ponta);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }

    private void tampar() {
        this.tampada = true;
        System.out.println("A caneta foi tampada!!!");
    }

    private void destampar() {
        this.tampada = false;
        System.out.println("A caneta foi destampada!!!");
    }
}

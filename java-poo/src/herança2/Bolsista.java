package herança2;

public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando a Bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista!!! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
  
    @Override
    public String toString() {
        return "Pessoa [nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", matricula=" + this.getMatricula() + ", curso=" + this.getCurso() + ", bolsa=" + this.getBolsa() + "]";
    }
    
}

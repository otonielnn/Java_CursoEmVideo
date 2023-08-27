package herança2;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade de " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", matricula=" + this.getMatricula() + ", curso=" + this.getCurso() + "]";
    }
}

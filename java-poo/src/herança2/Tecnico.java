package herança2;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar() {}

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", matricula=" + this.getMatricula() + ", curso=" + this.getCurso() + ", registroProfissional=" + this.getRegistroProfissional() + "]";
    }
}

public class Funcionario  extends Pessoa{
     private String setor;
     private boolean trabalhando;

    public void mudarTrabalho(String trabalho) {
        setSetor(trabalho);
    }

    public Funcionario(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experienca;


    

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        setExperienca(0);
    }

    protected abstract void ganharExp();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experienca=" + experienca + "]";
    }

    public float getExperienca() {
        return experienca;
    }

    public void setExperienca(float experienca) {
        this.experienca = experienca;
    }

  

}

public class Leitor {
    private String nome, sexo;
    private int idade;

    public Leitor(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostraLeitor(){
        System.out.printf("\nNome: %s\nIdade: %d\nSexo: %s\n", getNome(), getIdade(), getSexo());
    }

    public void fazerAnivesario(){

    }
    
}

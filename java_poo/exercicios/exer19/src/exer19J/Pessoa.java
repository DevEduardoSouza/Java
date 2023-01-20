package exer19J;
public class Pessoa {
    private String nome, endereco;
    private int idade;

    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        setIdade(idade);
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade > 0 && idade < 150){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida");
        }
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + "]";
    }
    
}

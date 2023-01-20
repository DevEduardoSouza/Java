package animais;

public class Animal {
    private String nome, tipoAnimal;
    private int idade;

    public Animal(String nome, String tipoAnimal, int idade) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
    }
    
    public void alimentar() {
        System.out.println("Alimentando o animal");
    }
    public void brincar() {
        System.out.println("Bricando com o animal");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", tipoAnimal=" + tipoAnimal + ", idade=" + idade + "]";
    }
    
    
}

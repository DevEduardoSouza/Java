public class Pessoa {
    private String name;
    private int idade;
    private String endereco;
    private long contato;

    public Pessoa(String name, int idade, String endereco, long contato){

        setNome(name);
        setIdade(idade);
        setEndereco(endereco);
        setContato(contato);
    }

    public void setNome(String name){
        this.name = name;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setContato(long contato){
        this.contato = contato;
    }

    public String getName(){
        return this.name;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public long getContato(){
        return this.contato;
    }

    public void status(){
        System.out.printf("\nNome: %s\nIdade: %d\nEndereco: %s\nContato: %d\n", getName(), getIdade(), getEndereco(), getContato());
    }
}

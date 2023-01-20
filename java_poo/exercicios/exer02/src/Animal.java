public class Animal {
    private String name;
    private String tipoAnimal;
    private int idade;

    public Animal(String name, String tipoAnimal, int idade){
        setIdade(idade);
        setName(name);
        setTipoAnimal(tipoAnimal);

    }

    public void setName(String name){
        this.name = name;
    }
    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getName(){
        return this.name;
    }
    public String getTipoAnimal(){
        return this.tipoAnimal;
    }
    public int getIdade(){
        return this.idade;
    }

    public void status(){
        System.out.printf("\nNome: %s\nTipo do animal: %s\nIdade: %d anos\n", getName(), getTipoAnimal(), getIdade());
    }

}

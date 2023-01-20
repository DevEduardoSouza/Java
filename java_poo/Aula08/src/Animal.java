/**
 * Animal
 */
public abstract class Animal {
    private double peso;
    private int membros, idade;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public int getIdade() {
        return idade;
    }
    @Override
    public String toString() {
        return "Animal [peso=" + peso + ", membros=" + membros + ", idade=" + idade + "]";
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
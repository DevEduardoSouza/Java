public class Empregado {
    private String name;
    private int numero;
    private double salario;

    public Empregado(String nome, int numero, double salario){
        this.name = nome;
        this.numero = numero;
        this.salario = salario;
    }

    public String getName(){
        return name;
    }
    public int getNumero(){
        return numero;
    }
    public double getSalario(){
        return salario;
    }
    
    public void aumentarSalario(int porcentagem){
        salario += (salario * porcentagem) / 100;
    }

    public void status(){
        System.out.printf("\nNome: %s\nNúmero: %d\nSalário: %.1f\n", getName(), getNumero(), getSalario());
    }

}



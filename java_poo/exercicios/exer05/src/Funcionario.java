public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;



    public Funcionario(String nome, String matricula, double salario){
        setSalario(salario);
        setNome(nome);
        setMatricula(matricula);

    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public void salarioAnual(){
        double salarioAnual = salario * 12;
        System.out.println("\nSeu salario anual é R$ "+ salarioAnual);
    }

    public void status(){
        System.out.printf("\nNome: %s\nMatricula: %s\nSalário: R$ %.1f", nome, matricula, salario);
    }
    
}

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;


    public Professor(String nome, String sexo, int idade){
        super(nome, sexo, idade);
    }

    public void aumantarSalario(double salario) {
        this.salario += salario;
        System.out.println("Salario novo é: " + getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

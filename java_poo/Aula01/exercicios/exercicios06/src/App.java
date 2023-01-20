// Crie uma classe "Funcionário" com atributos para nome, salário e dados de contratação. Crie métodos para calcular o tempo de serviço e para aumentar o salário.

// se tiver um ano na empresa aumento 10%, 2 20%, 3 ou mais 30%

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario fun = new Funcionario();
        fun.nome = "Eduardo";
        fun.salario = 1000;
        fun.tempoNaEmpresa = 12;

        fun.aumentarSalario();
        System.out.println("Novo salario : R$ "+ fun.salario);
    }
}

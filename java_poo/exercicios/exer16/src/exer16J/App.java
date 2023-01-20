package exer16J;


// Crie uma classe chamada "Veiculo" com atributos para marca, modelo, ano e proprietario (do tipo Pessoa). Adicione métodos de acesso e modificação para esses atributos.
public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Eduardo", 21);        
        Veiculo veiculo = new Veiculo("Volw", "Gol", "José", 2020, pessoa);

        System.out.println(veiculo.toString());

        
    }
}

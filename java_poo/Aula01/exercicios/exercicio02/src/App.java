
// 2° - Crie uma classe chamada "Pessoa" com atributos para nome, idade e endereço. Crie um método que exiba esses atributos.
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Eduardo de Souza";
        pessoa.idade = 20;
        pessoa.endereco = "Rua 1";

        pessoa.imprimirPessoa();
    }
}

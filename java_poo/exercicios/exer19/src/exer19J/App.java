package exer19J;


// Crie uma classe chamada "Pessoa" com atributos para nome, idade e endereço. Adicione métodos de acesso e modificação para esses atributos, mas garanta que a idade seja sempre maior que 0 e menor que 150.
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Eduardo", "Rua 1", 20);
        System.out.println(pessoa.toString());
       
       
    }
}

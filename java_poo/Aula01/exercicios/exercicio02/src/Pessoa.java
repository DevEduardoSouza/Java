public class Pessoa {
    String nome;
    String endereco;
    int idade;


    void imprimirPessoa(){
        System.out.printf("Nome: %s\nIdade: %d anos\nEndereço: %s\n\n", this.nome, this.idade, this.endereco);
    }
}


package pessoas;
// Crie uma classe chamada "Pessoa" que possui os atributos "nome" e "endereco". Crie uma classe chamada "Endereco" que possui os atributos "rua", "cidade" e "estado". A classe "Pessoa" deve ter uma instância de "Endereco" como um de seus atributos

public class App {
    public static void main(String[] args) throws Exception {
      
        Endereco endereco = new Endereco("Rua 1", "Juazeiro", "Bahia");
        Pessoa pessoa = new Pessoa("Eduardo", endereco);

        System.out.println(pessoa.toString());

    }
}

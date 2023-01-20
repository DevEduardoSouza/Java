
// 4° Crie uma classe "Produto" com atributos para nome, preço e quantidade no estoque. Crie métodos para adicionar e remover itens do estoque, e para exibir o preço total do estoque.

public class App {
    public static void main(String[] args) throws Exception {
       Produto produto = new Produto();
       produto.nome = "Feijão";
       produto.preco = 8.6f;
       
       produto.addEstoque(11);
       produto.removerEstoque(10);
       produto.precoTotal();

       System.out.println(produto.quantidade);
    }
}

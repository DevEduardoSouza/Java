// Crie uma classe chamada "Produto" com atributos para nome, preço e quantidade em estoque. Adicione métodos para adicionar e remover itens do estoque, mas garanta que a quantidade em estoque nunca seja negativa
public class App {
    public static void main(String[] args) throws Exception {
        Produto2 produto = new Produto2("Feijão", 9.50, 10);
        produto.removerItems(5);

        System.out.println(produto.toString());

        
       
    }
}

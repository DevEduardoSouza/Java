// Crie uma classe "Produto" com atributos para nome, descrição, preço e estoque. Crie métodos para adicionar e remover itens do estoque, e para exibir o preço total do estoque.
public class App {
    public static void main(String[] args) throws Exception {
        Produto2 p = new Produto2("Arroz", "Arroz saco 1kg", 8.99, 10);

        p.addItems(10);
        p.removerItems(22);
        System.out.println("Preço total do estoque " + p.precoEstoque());
        System.out.println(p.toString());
        
       
    }
}

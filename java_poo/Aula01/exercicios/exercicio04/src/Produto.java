public class Produto {
    String nome;
    int quantidade;
    float preco;


    void addEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    void precoTotal(){
        float total;
        total = this.quantidade * this.preco;
        
        System.out.printf("Preco total: R$ %.1f", total);
    }
}

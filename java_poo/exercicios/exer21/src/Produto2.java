public class Produto2 {
    private String nome, discricao;
    private double preco;
    private int estoque;

    public Produto2(String nome, String discricao, double preco, int estoque) {
        this.nome = nome;
        this.discricao = discricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void addItems(int qtd) {
        if(qtd > 0){
            setEstoque( getEstoque() + qtd );
        }
    }

    public void removerItems(int qtd){
        if(qtd > 0){
            if(getEstoque() >= qtd){
                setEstoque( getEstoque() - qtd );
            }else{
                System.out.println("Erro");
            }
        }
    }
    public double precoEstoque(){
        return getEstoque() * preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDiscricao() {
        return discricao;
    }
    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }
    public double getPreço() {
        return preco;
    }
    public void setPreço(double preco) {
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto2 [nome=" + nome + ", discricao=" + discricao + ", preço=" + preco + ", estoque=" + estoque
                + "]";
    }
}

public class Produto {
    private String nome;
    private double preço;
    private int estoque;

    public Produto(String nome, double preço, int estoque) {
        this.nome = nome;
        this.preço = preço;
        this.estoque = estoque;
    }

    public void adicionarItems(int qtd) {
        if(qtd > 0){
            this.estoque += qtd;
        }else{
            System.out.println("Erro");
        }
        
    }
    public void removerItems(int qtd) {
        if(qtd > 0){
            if(this.estoque >= qtd){
                this.estoque -= qtd;
                System.out.println("Quantidade removida com sucesso");
            }else{
                System.out.println("Erro, sem estoque disponível");
            }
        }
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preço=" + preço + ", estoque=" + estoque + "]";
    }

    
}

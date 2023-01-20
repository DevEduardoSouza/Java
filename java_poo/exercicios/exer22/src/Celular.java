public class Celular {
    private String marca, modelo;
    private int capacidade;

    public Celular(String marca, String modelo, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
    public void addApp(String app, int tamanho) {
        if(tamanho <= capacidade){
            System.out.println("Aplicativo adicionado com sucesso");
            capacidade -= tamanho;
        }else{
            System.out.println("Erro, armazenamento insuficiente");
        }
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Celular [marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + "]";
    }
    
    
    
}

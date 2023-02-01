package heranca;

public class Caminhao extends Veiculo{
    private int capacidadeCarga;

    public Caminhao(int numerosRodas, int velocidadeMaxima, String cor, int capacidadeCarga) {
        super(numerosRodas, velocidadeMaxima, cor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    

}
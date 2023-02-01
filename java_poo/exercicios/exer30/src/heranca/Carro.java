package heranca;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(int numerosRodas, int velocidadeMaxima, String cor, int numPortas) {
        super(numerosRodas, velocidadeMaxima, cor);
        this.numPortas = numPortas;
    }


    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }


    
}

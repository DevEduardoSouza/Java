// Crie uma classe "Veículo" com atributos para marca, modelo, ano, quilometragem e velocidade máxima. Implemente métodos para acelerar e frear o veículo.

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo("Volw", "Gol", 2014, 1500, 200);

        veiculo.acelerarVeiculo(100);
        veiculo.frear();


      
    }
}

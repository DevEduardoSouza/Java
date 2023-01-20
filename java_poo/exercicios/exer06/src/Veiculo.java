public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private int velocidadeMaxima;
    private int velocidade;

    public Veiculo(String marca, String modelo, int ano, double quilometragem, int velocidadeMaxima){
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setQuilometragem(quilometragem);
        setVelocidadeMaxima(velocidadeMaxima);
        this.velocidade = 0;

    }

    private void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }
    public void acelerarVeiculo(int velocidade){
        if(velocidade > velocidadeMaxima || velocidade < 0){
            
            System.out.println("Erro, não é possível atingi essa valocidade\n");
        }else{
            this.velocidade = velocidade;
            System.out.println("Acelerando");
        }
    }
    public void frear(){
        if(velocidade > 0){
            System.out.println("Carro freado com sucesso\n");
        }else{
            System.out.println("Erro o carro está parado\n");
        }
    }
}

package heranca;

public abstract class Veiculo {
    protected int numerosRodas, velocidadeMaxima, velocidadeAtual;
    protected String cor;
    
    public Veiculo(int numerosRodas, int velocidadeMaxima, String cor) {
        this.numerosRodas = numerosRodas;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade){
        if(velocidade <= getVelocidadeMaxima() ){
            this.velocidadeAtual = velocidade;
            System.out.println("Acelerando");
        }else{
            System.out.println("Erro, Velocidade máxima atiginda");
        }
    }

    public void frear(){
        if(getVelocidadeAtual() != 0){
            velocidadeAtual = 0;
            System.out.println("Freando");
        }else{
            System.out.println("já está parado");
        }
    }




    public int getNumerosRodas() {
        return numerosRodas;
    }
    public void setNumerosRodas(int numerosRodas) {
        this.numerosRodas = numerosRodas;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

   
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public String toString() {
        return "Veiculo [numerosRodas=" + numerosRodas + ", velocidadeMaxima=" + velocidadeMaxima + ", velocidadeAtual="
                + velocidadeAtual + ", cor=" + cor + "]";
    }

    
    
}

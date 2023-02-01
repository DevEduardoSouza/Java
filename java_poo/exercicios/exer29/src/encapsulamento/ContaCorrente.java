package encapsulamento;

public class ContaCorrente {
    private int conta;
    private double limiteCredito, juros, saldo;


    public ContaCorrente(int conta) {
        this.conta = conta;
        this.limiteCredito = 1200;
        this.saldo = 1200;
        this.juros = 15;
    }

    public void depositar(double saldo) {
        if(saldo > 0){
            this.saldo += saldo;
            System.out.println("Deposito efetuado com sucesso");
        }else{
            System.out.println("Erro");
        }
    }

    private boolean saidaDinheiro(double saldo) {
        saldo += juros;

        if( saldo <= this.saldo + limiteCredito){
            this.saldo -= saldo;
            return true;
        }else{
            return false;
        }
        
    }

    public void sacar(double saldo) {
       
        if(saidaDinheiro(saldo)){
            System.out.println("Dinherio sacado com sucesso");
        }else{
            System.out.println("Erro ao sacar");
        }
    }

    public void transferir(double saldo) {
        if(saidaDinheiro(saldo)){
            System.out.println("Dinherio transferido com sucesso");
        }else{
            System.out.println("Erro ao transferir");
        }
    }



    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public double getJuros() {
        return juros;
    }
    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "ContaCorrente [conta=" + conta + ", limiteCredito=" + limiteCredito + ", juros=" + juros + ", saldo="
                + saldo + "]";
    }

   

    
}

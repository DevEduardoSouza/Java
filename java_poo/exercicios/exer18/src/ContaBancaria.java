public class ContaBancaria implements Banco {
    private String nomeTitular;
    private int numConta;
    private double saldo;

    

    public ContaBancaria(String nomeTitular, int numConta) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = 0;
    }

    @Override
    public void depositarDin(double saldo) {
        if(saldo > 0){
            System.out.println("Deposito feito com sucesso");
            this.saldo += saldo;
        }else{
            System.out.println("Erro");
        }
    }

    @Override
    public void saqueDin(double saldo) {
       if(this.saldo >= saldo){
            setSaldo(this.saldo - saldo);
       }else{
            System.out.println("Saldo insuficiente");
       }
        
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [nomeTitular=" + nomeTitular + ", numConta=" + numConta + ", saldo=" + saldo + "]";
    }
    
    
}

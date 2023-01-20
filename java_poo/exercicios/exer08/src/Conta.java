public class Conta {
    private double saldo;
    private int numeroDaConta;

    public Conta(double saldo, int numeroDaConta){
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;

    }

    public double saldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Erro, o valor precisa ser maior que 0");
        }else{
            saldo += valor;
            System.out.println("Saldo depositado com sucesso");
        }
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saldo retirado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}

public class ContaBancaria {
    int numConta;
    double saldo;

    void depositar(double valor){
        this.saldo += valor;
    }

    void saque(double valor){
        if(this.saldo >= valor){
            saldo -= valor;
            System.out.println("Saque feito com sucesso");
        }else{
            System.out.println("Dinheiro insuficiente na conta");
        }
    }

    void consultarSaldo(){
        System.out.printf("Seu saldo é: R$ %.1f", saldo);
    }
    
}

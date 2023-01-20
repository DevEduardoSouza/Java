
// 3° Crie uma classe chamada "Conta Bancária" com atributos para saldo e número da conta. Crie métodos para depositar e retirar dinheiro.

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria cb = new ContaBancaria();
        cb.numConta = 1111;
        cb.saldo = 0;

        cb.depositar(1000);
        cb.saque(500);
        cb.depositar(800);
        cb.consultarSaldo();
    }
}

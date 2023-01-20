// Crie uma classe "Conta" com atributos para saldo e número da conta. Crie métodos para depositar, retirar e verificar o saldo na conta.

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(1000, 111144);

        conta.depositar(500);
        conta.sacar(500);
        
        System.out.println(conta.saldo());
        
    }
}

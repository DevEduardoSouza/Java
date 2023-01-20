// Crie uma classe chamada "ContaBancaria" com atributos para o nome do titular, o número da conta e o saldo. Adicione métodos para depositar e retirar dinheiro, mas garanta que o saldo nunca fique negativo.
public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria contaBancaria = new ContaBancaria("Eduardo", 15514);

        contaBancaria.depositarDin(100);
        contaBancaria.saqueDin(110);
        System.out.println(contaBancaria.toString());
       
    }
}

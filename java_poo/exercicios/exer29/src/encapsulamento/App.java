
package encapsulamento;
// Encapsulamento: Crie uma classe "ContaCorrente" com atributos privados como número da conta, saldo, limite de crédito e juros. Adicione métodos públicos para depositar, sacar e transferir dinheiro, verificando se o saldo e o limite de crédito permitem a transação antes de prosseguir e calculando juros se necessário.


public class App {
    public static void main(String[] args) throws Exception {
        
      ContaCorrente contaCorrente = new ContaCorrente(20);

      contaCorrente.transferir(1100);
      System.out.println(contaCorrente.toString());
    }
}

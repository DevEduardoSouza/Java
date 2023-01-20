/* 
 * Atributos
 * numeroConta
 * tipoConta -> (cc)corente ou (cp)poupança
 * nomeUser
 * saldo
 * status -> se está aberta ou fechada
 * 
 * Métodos
 * AbriConta -> sattus = true e tipo conta, cc = ganha 50R$, cp ganha 150R$
 * fecharConta - não pode ter dinherio e nem está devendo ao banco
 * depositar -> conta tem que está aberta
 * sacar -> conta tem que está aberta saque <= saldo
 * pagarMensalidade-> cc -> 12, cp 20
 * 
 * Construtor
 * status -> false
 * saldo = 0;
 * 
 * 
*/

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco contaBanco = new ContaBanco();

        contaBanco.abriConta("cp");
        contaBanco.setNomeUser("Eduardo");

        System.out.println(contaBanco.getSaldo());


       
    
        
    }
}

public class Encapsulamento {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Eduardo", "123456");
        pessoa.login("Eduardo", "123456");
    
        System.out.println(pessoa.getLogado());
        pessoa.sair();
        
    }
}

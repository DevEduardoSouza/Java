import java.util.Scanner;

// Crie uma classe "Agenda" com atributos para armazenar contatos, como nome, telefone e endereço de e-mail. Crie métodos para adicionar, remover e pesquisar contatos.

public class App {
    public static void main(String[] args) throws Exception {

        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        Contatos contatos = new Contatos(0, null, null);


       

        int op = 0;

        do {
            System.out.println("\n******* Bem vindo a sua Agenda **********\n");

            System.out.println("Informe a opção\n1 - Adicionar contato\n2 - Remover contato\n3 - Pesquisar contato\n");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe Nome, Telefone e email do novo contato\n");

                    System.out.println("Nome:");
                    contatos.setNome(scanner.nextLine());

                    System.out.println("Email:");
                    contatos.setEmail(scanner.nextLine());

                    System.out.println("Telefone:");
                    contatos.setTelefone(scanner.nextLong());
                    

                    contatos = new Contatos(contatos.getTelefone(), contatos.getNome(), contatos.getEmail() );

                    agenda.adiconar(contatos);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    agenda.mostraTodosContatos(contatos);
                    break;
            
                default:
                    break;
            }
            
        } while (op!=0);

      
    }
}

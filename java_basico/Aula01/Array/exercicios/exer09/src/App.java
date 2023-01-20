import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nome ={"maria", "ana", "eduardo"};
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de login");
        name = scanner.nextLine();

        name = name.toLowerCase();
        System.out.println(name);

        
        Arrays.sort(nome);
        int resultado = Arrays.binarySearch(nome, name);

        if(resultado > 0){
            System.out.println("Login autorizado");
        }else{
            System.out.println("Login negado");
        }
        scanner.close();


    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int tam = 8;
        int[] valores= new int[tam];
        int x,y, soma;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Informe um numero: ");
            valores[i] = scanner.nextInt();    
        }

        System.out.println("Informe um valor");
        x = scanner.nextInt();  
        System.out.println("Informe outro valor");
        y = scanner.nextInt();

        soma = valores[x] + valores[y];

        System.out.println("A soma das posições informadas é = " + soma);

        scanner.close();
    }
}

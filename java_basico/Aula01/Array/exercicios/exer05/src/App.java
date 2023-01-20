import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int tam = 10;
        int[] valores = new int[tam];
        int pares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Informe um numero: ");
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {

            if(valores[i] % 2 == 0){
                pares++;
            }
        }

        System.out.printf("No array possui %d valores pares", pares);

        scanner.close();
    }
}

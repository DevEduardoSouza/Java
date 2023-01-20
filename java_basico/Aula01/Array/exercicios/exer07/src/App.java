import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int tam = 6;
        int[] valores = new int[tam];
        int maior = 0, pos = 0;
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe um valor");
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > maior){
                maior = valores[i];
                pos = i;
            }
        }

        System.out.printf("O numero maior se encontra no index [%d] = %d", pos, maior);
        
        scanner.close();
    }
}

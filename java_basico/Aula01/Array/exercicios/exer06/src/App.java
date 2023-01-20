import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int tam = 10;
        int[] valores = new int[tam];
        int maior = 0, menor = 0;


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Informe um numero: ");
            valores[i] = scanner.nextInt();
        }


        for (int i = 0; i < valores.length; i++) {
            

            if(i == 0){
                menor = valores[i];
            }

            if(valores[i] < menor){
                menor = valores[i];
            }

            if(valores[i] > maior){
                maior = valores[i]; 
            }
        }

        System.out.println("O numero maior do meu array é " + maior);
        System.out.println("O numero menor do meu array é " + menor);

        scanner.close();
    }
}

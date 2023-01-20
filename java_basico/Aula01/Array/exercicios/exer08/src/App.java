import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // ordenar uma array

        final int tam = 3;
        int[] idade = new int[tam];
        double[] nota = new double[tam];
        String[] string = new String[tam];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < string.length; i++) {
            System.out.println("Informe seu nome");
            string[i] = scanner.nextLine();

            System.out.println("INforme sua idade");
            idade[i] = scanner.nextInt();

            System.out.println("INforme sua nota");
            nota[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nNomes em ordem alfabética");

        Arrays.sort(string);
        for (int i = 0; i < string.length; i++) {
            System.out.printf("\nNome: %s\tIdade: %d\tNota: %.1f\n", string[i], idade[i], nota[i]);
        }

        scanner.close();

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int TAM = 5;
        double[] valores = new double[TAM];

        double[] qrst = new double[TAM];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Informe um valor: ");
            valores[i] = scanner.nextDouble();
        }

        for (int i = 0; i < qrst.length; i++) {
            qrst[i] = valores[i] * valores[i];
        }

        System.out.println("Números e seus quadrados");
        for (int i = 0; i < qrst.length; i++) {
            System.out.printf("%.1f = %.1f\n", valores[i], qrst[i]);
        }


        scanner.close();
    }
}

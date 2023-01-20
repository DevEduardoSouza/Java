import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       final int tam = 6;
       int[] valores = new int[tam];

       Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o °"+ (i+1) +" número");
            valores[i] = scanner.nextInt();
       }

       for (int i : valores) {
            System.out.printf("%d - ", i);
       }
       scanner.close();
    }
}

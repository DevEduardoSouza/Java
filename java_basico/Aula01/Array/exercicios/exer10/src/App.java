import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class App {
    public static void main(String[] args) throws Exception {
        final int tam = 5;
        int[] valores = new int[tam];
        int par=0, impar=0, negativo=0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe um numero");
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] %2==0){
                par++;
            }else{
                impar++;
            }
            if(valores[i] < 0){
                negativo++;
            }   
        }
        System.out.printf("pares = %d\nImpares = %d\nNegativos = %d", par, impar, negativo);
        scanner.close();
    }
}

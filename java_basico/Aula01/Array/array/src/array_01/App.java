package array_01;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        int[] num = new int[5];
       

        for(int i = 0; i < num.length; i++){
            num[i] = 5;
        }

        for(int i = 0; i < num.length; i++){
            System.out.println( "num = " + num[i]);
        }
        System.out.println("\n");

        // Já inicializando elementos no array
        int[] numeros = {10,5,6,7,8};

        for(int i = 0; i < numeros.length; i++){
            System.out.println( "numeros = " + numeros[i]);
        }

        // Mini exercicio , Gabarito
        final int tam = 5;
        char[] gabarito = {'a','e','c','b','a'};
        char[] respostas = new char[tam]; 
        int nota=0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < gabarito.length; i++){
           System.out.printf("Informe a opcoa na questão %d: ", (i+1) );
           respostas[i] = scanner.nextLine().charAt(0);
        }

        for(int i = 0; i < gabarito.length; i++){
            if(gabarito[i] == respostas[i]){
                nota++;
            }
        }
        System.out.printf("Voce acertou %d questoes", nota);
        scanner.close();
    }
}

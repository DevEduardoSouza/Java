
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int l = 5, c = 5;
        int[][] mat = new int[l][c];
        int x = 0, control = 0;
        int li = 0, co = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = random.nextInt(100);
            }
        }


        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.print("\n");
        }


        System.out.println("\nInforme um numero");
        x = scanner.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if(x == mat[i][j]){
                    control = 1;
                    li = i;
                    co = j;
                }
            }
        }

       
        if(control == 1){
            System.out.printf("O numero %d foi encontrado na linha %d e coluna %d", x, li, co);
        }else{
            System.out.printf("O numero %d NÃO foi encontrado", x);
        }
        
    }
}

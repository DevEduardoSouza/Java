import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int [][] mat = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for(int l = 0; l<2; l++){
            for(int c = 0; c<2; c++){   
                mat[l][c] = scanner.nextInt();
            }
        }

        System.out.println("\n\n");
        for(int l = 0; l<2; l++){
            for(int c = 0; c<2; c++){   
                System.out.printf("%d - ", mat[l][c]);
            }
        }
        scanner.close();
    }
}

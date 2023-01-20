import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       Random random = new Random();

       final int l = 4, c = 4;
       int[][] mat = new int[l][c];
       int maior= 0, linha = 0, coluna= 0;

       for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = random.nextInt(100);
                

                if(mat[i][j] > maior){
                    maior = mat[i][j];
                    linha = i;
                    coluna = j;
                }
            }
       }

       for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("|%2d| ", mat[i][j]);
            }
            System.out.print("\n");
        }




       System.out.printf("\nO maior numero é = %d, e foi encotrado na linha %d e coluna %d", maior, (linha + 1), (coluna + 1));
    }
}

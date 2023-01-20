import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        final int l = 4, c = 4;
        
        Random random = new Random();
        int qtd = 0;
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = random.nextInt(100);

                if(mat[i][j] > 10){
                    qtd++;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d - ", mat[i][j]);
            }
        }

        

        System.out.printf("\n\nNa matriz possui %d maiores que 10", qtd);

    }
}

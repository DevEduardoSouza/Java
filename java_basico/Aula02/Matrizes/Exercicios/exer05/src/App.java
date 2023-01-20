import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    //Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao acima da ˜
    // diagonal principal.

        final int  l = 3, c = 3;
        int[][] mat = new int[l][c];
        Random random = new Random();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

        int soma = mat[0][0] + mat[0][1] + mat[0][2];

        System.out.println("A soma é " + soma);



    }
}

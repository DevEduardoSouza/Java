
public class App {
    public static void main(String[] args) {
     
          final int l = 5, c = 5;

          int[][] mat = new int[l][c];
          for (int i = 0; i < l; i++) {
               for (int j = 0; j < c; j++) {
                    
                    mat[i][j] = 0;
                    
                    if(j == 0)
                         mat[i][j] = 1;
                    
               }
          }

          for (int i = 0; i < l; i++) {
               for (int j = 0; j < c; j++) {
                    System.out.printf("%d ", mat[i][j]);
               }
               System.out.print("\n");
          }

    }
}

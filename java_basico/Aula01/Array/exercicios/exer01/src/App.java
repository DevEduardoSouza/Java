public class App {
    public static void main(String[] args) throws Exception {
        int[]a = {1,0,5,-2,-5,7};
        int soma = a[0] + a[1] + a[5];
    
        System.out.println("Soma dos valores do index 0, 1 e 5 = " + soma);

        a[4] = 100;
        for (int i : a) {
                System.out.printf("%d - ", i);
        }

    }
}

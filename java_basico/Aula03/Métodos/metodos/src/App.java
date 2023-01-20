public class App {
    public static void main(String[] args){
    
        nome("Eduardo");
        nome("Eduardo Souza");

        System.out.println(somaValores(10,5,3,8,2));

    }

    public static void nome(String name) {
        System.out.println(name);
    }

// Com esse tipo de parametros posso passa vários valores
    public static int somaValores (int... numeros){
        int res = 0;

        for (int i : numeros) {
            res += i;
        }
        return res;
    }
}

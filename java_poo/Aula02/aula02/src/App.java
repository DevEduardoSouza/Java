public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic new";
        c1.cor = "Azul";
        
        c1.tampar();

        c1.status();
    }
}

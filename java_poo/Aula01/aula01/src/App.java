public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "version 1";
        c1.ponta = 0.5; 
       
        // c1.destampar();
        c1.tampar();
       
        c1.status();
        c1.rabiscar();


    }
}

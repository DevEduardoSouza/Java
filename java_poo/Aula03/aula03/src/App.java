// Métodos Getter, Setter e Construtor
public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("Bic black", 0.5);
        // c1.setModelo("Bic black");
        // c1.setPonta(0.5);

        // System.out.printf("Modelo: %s\nPonta: %.1f", c1.getModelo(), c1.getPonta());
        
        c1.status();
    }

}

package sobreposicaoSobrecarga;

public class App {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Vai la");
        c.reagir(true);
        c.reagir(10, 1);
        c.reagir(10, 5.5);      
    }
    
}

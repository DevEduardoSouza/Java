// Polimorfismo
public class App {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        m.alimentar();
        m.setPeso(150);
        System.out.println(m.toString());


        Reptil reptil = new Reptil();
        reptil.setPeso(100);
        reptil.alimentar();
        System.out.println(reptil.toString());

        Canguru c = new Canguru();
        c.setIdade(5);
        System.out.println(c.toString());
        c.locomover();

        Tartaruga t = new Tartaruga();
        t.locomover();
        
      
        
    }
    
}

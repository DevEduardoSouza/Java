
package animais;
// Crie uma classe "Animal" com atributos como nome, idade e tipo de animal. Implemente métodos para alimentar e brincar com o animal.

public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal("Eduardo", "Cachorro", 5);
        animal.brincar();
        animal.alimentar();

        
    }
}

// Crie uma classe "Animal" com atributos para nome, idade e tipo de animal. Crie um método que exiba esses atributos.

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Spake", "Cachorro", 2);
        animal.status();

        Animal animal2 = new Animal("Mike", "Gato", 3);
        animal2.status();
      
    }
}

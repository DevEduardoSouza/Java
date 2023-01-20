// Crie uma classe "Celular" com atributos para marca, modelo e capacidade de armazenamento. Crie métodos para verificar se há espaço disponível e para adicionar aplicativos ao celular.
public class App {
    public static void main(String[] args) throws Exception {
  
    Celular celular = new Celular("Iphone x", "Iphone", 256);
    celular.addApp("Fifa", 56);
    celular.addApp("Fifa 2", 256);
    System.out.println(celular.toString());

       
    }
}

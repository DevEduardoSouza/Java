// Crie uma classe "Alimento" com atributos para nome, ingredientes e modo de preparo. Crie um método que exiba esses atributos.

public class App {
    public static void main(String[] args) throws Exception {
        Alimentos alimentos = new Alimentos("Arroz", "Conzinhar", "Arroz, Alho, Água, Tempero");
        alimentos.mostraAlimentos();
       
    }
}

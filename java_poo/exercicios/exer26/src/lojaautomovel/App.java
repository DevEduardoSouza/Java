// Crie uma classe "Automóvel" com atributos como marca, modelo, ano e quilometragem. Crie métodos para mostrar os atributos e para calcular o tempo gasto com manutenção.
package lojaautomovel;
public class App {
    public static void main(String[] args) throws Exception {
        
        Automovel automovel = new Automovel("ferrari", "ferrari 91", 2020, 1005);
        automovel.precoManutacao();
       
    }
}

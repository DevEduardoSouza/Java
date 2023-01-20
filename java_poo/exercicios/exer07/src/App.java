// Crie uma classe "Eletrodoméstico" com atributos para marca, modelo, consumo de energia e estado (on/off). Crie métodos para ligar e desligar o eletrodoméstico.

public class App {
    public static void main(String[] args) throws Exception {
    
        Eletrodomestico eletrodomestico = new Eletrodomestico("Mundial", "Ventilador", 40);
    
        
        eletrodomestico.ligar();
        eletrodomestico.desligar();


        eletrodomestico.status();
    }
}

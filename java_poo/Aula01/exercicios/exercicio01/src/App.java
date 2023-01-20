// 1° - Crie uma classe chamada "Carro" com atributos para marca, modelo e ano. Crie um método que exiba esses atributos.


public class App {
    public static void main(String[] args) throws Exception {
        
        Carro car = new Carro();
        car.marca = "Volw";
        car.modelo = "Gol";
        car.ano = 2018;
        car.imprimirCar();

        
        Carro car2 = new Carro();
        car2.marca = "Honda";
        car2.modelo = "Civc";
        car2.ano = 2022;

        car2.imprimirCar();

    }
}

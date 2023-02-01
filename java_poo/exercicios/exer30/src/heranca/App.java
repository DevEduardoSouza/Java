
package heranca;
// Herança: Crie uma superclasse "Veículo" com atributos como número de rodas, cor e velocidade máxima. Em seguida, crie subclasses "Carro", "Moto" e "Caminhão" que herdam de Veículo e adicionam atributos específicos, como número de portas (Carro) ou capacidade de carga (Caminhão). Crie métodos nas subclasses para acelerar e frear, usando a velocidade máxima da superclasse como limite.


public class App {
    public static void main(String[] args) throws Exception {
      Moto m = new Moto(2, 100, "Preta");
      Carro c = new Carro(4, 150, "Branco", 4);
      Caminhao k = new Caminhao(8, 250, "Verde", 1500);

      m.acelerar(100);
      m.frear();
      System.out.println(m.toString());

      c.acelerar(100);
      k.acelerar(150);

    }
}

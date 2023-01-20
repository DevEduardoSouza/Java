// Crie uma classe "Empregado" com atributos como nome, número de empregado e salário. Crie um método para mostrar esses atributos e um método para aumentar o salário em uma porcentagem.

public class App {
    public static void main(String[] args) throws Exception {
    
        Empregado empregado = new Empregado("Eduardo", 1545, 5545.69);
        empregado.aumentarSalario(100);
        empregado.status();
     
      
    }
}

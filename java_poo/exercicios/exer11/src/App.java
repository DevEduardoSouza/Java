// Crie uma classe "Empregado" com atributos para nome, endereço, salário, carga e departamento. Crie métodos para mostrar os atributos e para calcular o tempo de serviço.

public class App {
    public static void main(String[] args) throws Exception {
    
    Empregado empregado = new Empregado("Eduardo", "Sênio", "TI", "Rua 1", 5538.5);
    empregado.status();
    empregado.todoTempoTrabalhado(88);
        
    }
}

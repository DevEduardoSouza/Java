// Crie uma classe "Sistema de gerenciamento de reservas" com classes para reservas de passagens aéreas, hotéis e aluguel de carros. Implemente métodos para reservar, cancelar e verificar reservas.

public class App {
    public static void main(String[] args) throws Exception {
        SistemaGerenciamentoReservas sis = new SistemaGerenciamentoReservas(11, "Barra", "BMW", 109.50);
        sis.reservar();
        sis.cancelar();
        sis.verificarReseva();
    
    
        
    }
}

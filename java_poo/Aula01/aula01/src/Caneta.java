
/**
 * Caneta
 */
public class Caneta {

    String modelo;
    String cor;
    double ponta;
    boolean isTampado;

    void status(){
        System.out.printf("\nCor da caneta: %s", this.cor);
        System.out.printf("\nModelo: %s", this.modelo);
        System.out.printf("\nPonta: %.2f", this.ponta);
        System.out.printf("\nEstá tampado: %b", this.isTampado);
    }

    void rabiscar(){
        if(this.isTampado){
            System.out.println("\nA Caneta está fechada, não pode rabiscar");
        }else {
            System.out.println("\nRabiscando");
        }
    }

    void tampar(){
        this.isTampado = true;
    }

    void destampar(){
        this.isTampado = false;
    }

}
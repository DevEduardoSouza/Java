public class Caneta {
    public String modelo;
    public String cor;
    private int carga;
    protected double ponta;
    private boolean isTampada;

    public void status(){
        System.out.printf("Cor: %s\nModelo: %s\nCarga: %d\nPonta: %.1f\nEstá tampada? %b",this.cor, this.modelo, this.carga,this.ponta, this.isTampada);
    }

    public void rabiscar(){
        if(this.isTampada){
            System.out.println("ERRO, a caneta está tambada");
        }else{
            System.out.println("Rasbiscando");
        }
    }

    public void tampar(){
        this.isTampada = true;
    }

    public void destampar(){
        this.isTampada = false;
    }
}

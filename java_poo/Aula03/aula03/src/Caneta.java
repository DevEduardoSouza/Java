public class Caneta {
    private String modelo;
    private double ponta;
    private boolean isTampada;

    // Metódo construtor
    public Caneta(String modelo, double ponta){
        tampar();
        setModelo(modelo);
        setPonta(ponta);
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        this.isTampada = true;
    }

    public void destampar(){
        this.isTampada = false;
    }

    public boolean isTampada(){
        return this.isTampada;
    }

    public void status(){
        System.out.printf("Modelo: %s\n", this.getModelo());
        System.out.printf("Ponta: %s\n", this.getPonta());
        System.out.printf("A caneta está tampada? %b", this.isTampada());

    }
    
}

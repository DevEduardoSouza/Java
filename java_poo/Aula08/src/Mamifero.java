public class Mamifero extends Animal{
    private String corPele;

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
        
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de um mamífero");
        
    }

    @Override
    public void locomover() {
       System.out.println("Correndo");
    }
    
}

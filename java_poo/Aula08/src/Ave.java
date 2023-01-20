public class Ave extends Animal{
    private String corPena;


    public void fazerNilho(){
        System.out.println("Fazendo nilho");
    }


    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("piando");
        
    }

    @Override
    public void locomover() {
        System.out.println("Voando");        
    }


    public String getCorPena() {
        return corPena;
    }


    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}

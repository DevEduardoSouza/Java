package sobreposicaoSobrecarga;

public  class Mamifero extends Animal{
    protected String corPele;

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som mamífero");
    }
    
}

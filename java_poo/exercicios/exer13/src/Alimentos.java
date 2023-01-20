public class Alimentos implements Uialimentos{
    private String nome, modoPreparo;
    private String igredientes;



    public Alimentos(String nome, String modoPreparo, String igredientes) {
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.igredientes = igredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(String igredientes) {
        this.igredientes = igredientes;
    }

    @Override
    public void mostraAlimentos() {
        System.out.printf("Nome: %s\nModo preparo: %s\nIgredientes: %s\n", getNome(), getModoPreparo(), getIgredientes());
        
    }

    @Override
    public void totalAlimentos() {
        
    }
    
}

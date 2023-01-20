public class Visualizacao {
    private Aluno espectador;
    private Video filme;


    
    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    
    public Aluno getEspectador() {
        return espectador;
    }
    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
        
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
        
    }
    public void avaliar(double porc) {
        int total;
        if(porc >=90){
            total = 10;
        }else if(porc >= 80){
            total = 8;
        }else if(porc >= 50){
            total = 5;
        }else{
            total = 3;
        }
        this.filme.setAvaliacao(total);
    }
}

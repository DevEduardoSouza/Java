public class Bolsista extends Aluno {
    private int bolsa;

    public Bolsista(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa");
    }


  


    // Vai sobrepor o metódo de Aluno
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalida : bolsista");
    }


    public int getBolsa() {
        return bolsa;
    }


    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    
}

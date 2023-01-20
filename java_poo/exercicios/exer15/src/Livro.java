public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean isAberto;
    private Leitor leitor;
    
    

    public Livro(Leitor leitor, String tiulo, String autor, int totPag) {
        setPagAtual(0);
        setAberto(false);
        setLeitor(leitor);
        setTotPag(totPag);
        setTitulo(tiulo);
        setAutor(autor);
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return isAberto;
    }

    public void setAberto(boolean isAberto) {
        this.isAberto = isAberto;
    }
    public void status(){
        System.out.println("=====================================");
        System.out.printf("\n------------ Leitor ------------\n");
        getLeitor().mostraLeitor();
        System.out.printf("\n-------------------- Livro -------------------\n");
        System.out.printf("Titulo: %s\nAutor: %s\nTotal de páginas: %d\nPágina atual: %d\n",
                            getTitulo(), getAutor(), getTotPag(), getPagAtual());
        System.out.println("=====================================");

    }


    @Override
    public void abrir() {
        if(!isAberto()){
            setAberto(true);
            System.out.println("Livro aberto");
        }else{
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if(isAberto()){
            setAberto(false);
        }else{
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear(int page) {
        if(getTotPag() < page){
            setPagAtual(0);
        }else{
            setPagAtual(page);
        }
    }

    @Override
    public void avancaPag() {
        if( isAberto() ){
            if(getPagAtual() != getTotPag()){
                setPagAtual( getPagAtual() + 1 );
            }
        }else{
            System.out.println("O livro está fechado");
        }
        
    }

    @Override
    public void voltarPag() {
        if(isAberto()){
            if(getPagAtual() > 0){
                setPagAtual(getPagAtual() - 1);
            }
        }else{
            System.out.println("O livro está fechado");
        }
        
    }
    
}

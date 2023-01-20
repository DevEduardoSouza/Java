
public class Aluno extends Pessoa {
    private String login;
    private int totAssistido;
    
    
    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        setLogin(login);
        setTotAssistido(0);
    }
    
    public void viuMaisUm(){
        
    }
    
    @Override
    protected void ganharExp() {
        
    }
    
    
    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAluno [login=" + " " + login + ", totAssistido=" + totAssistido + "]";
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}

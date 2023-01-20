public class Contatos{

    private long telefone;
    private String nome;
    private String email;


    public Contatos(long telefone, String nome, String email){
        setTelefone(telefone);
        setNome(nome);
        setEmail(email);
    
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public String getNome(){
        return nome;
    }
    public long getTelefone(){
        return telefone;
    }

    
}

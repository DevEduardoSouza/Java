public class Pessoa implements IuPessoa {

    private String name;
    private String password;
    private boolean isLogado;

    // construtuor
    public Pessoa(String name, String password){
        this.setName(name);
        this.setPassword(password);
        setLogado(false);
    }

    // Métodos especias

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setLogado(boolean isLogado){
        this.isLogado = isLogado;
    }
    public boolean getLogado(){
        return isLogado;
    }


    // Métodos da interface
    @Override
    public void login(String name, String password) {

        if(this.name == name && this.password == password){
            this.setLogado(true);
            System.out.println("Login feito com sucesso");
        }else{
            System.out.println("Erro ao fazer login");
        }     
    }

    @Override
    public void sair() {
        if(getLogado()){
            setLogado(false);
            System.out.println("Saiu com sucesso");
        }else{
            System.out.println("Voce não está logado");
        }
    }
}

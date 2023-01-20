public class ContaBanco {
    private int numeroConta;
    private String tipoConta;
    private String nomeUser;
    private double saldo;
    private boolean status;


    public ContaBanco(){
        status = false;
        setSaldo(0);
    }
    public void abriConta(String tipoConta){
        setStatus(true);
        setTipoConta(tipoConta);
        bonificao(tipoConta);
    }
    public void fecharConta(){
        if (saldo == 0) {
            System.out.printf("%s, conta fechada com sucesso\n", nomeUser);
            setStatus(false);
            
        }else if(saldo < 0){
            System.out.printf("%s, você está em débito\n", nomeUser);
        }else{
            System.out.printf("%s, você está com saldo, saque antis de fechar a conta\n", nomeUser);
        }
    }

    public void depositar(double valor) {
        if(status){
            saldo += valor;
            System.out.println("Valor depositado com sucesso");
        }else{
            System.out.println("conta está fechada");
        }
    }

    public void sacar(double valor) {
        if(status){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Valor sacado com sucesso");
            } else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("conta está fechada");
        }
    }

    public void pagarMensalidade(){
        if(status){
            if(tipoConta == "cc"){
                saldo -= 12;
            }else{
                saldo -= 20;
            }
        }
    }

    private void bonificao(String tipoConta){
        if(status){
            if(tipoConta == "cc"){
                saldo = 50;
            }else{
                saldo = 150;
            }
        }
    }


    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
       
    }
    public String getTipoConta(){
        return tipoConta;
    }
    public void setNomeUser(String nomeUser){
        this.nomeUser = nomeUser;
    }
    public String getNomeUser() {
        return nomeUser;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
}

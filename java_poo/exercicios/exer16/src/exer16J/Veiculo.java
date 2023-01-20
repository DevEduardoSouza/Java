package exer16J;

public class Veiculo {
    private String marca, modelo, proprietario;
    private int ano;
    private Pessoa pessoa;
    
    public Veiculo(String marca, String modelo, String proprietario, int ano, Pessoa pessoa) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.ano = ano;
        this.pessoa = pessoa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", proprietario=" + proprietario + ", ano=" + ano
                + ", pessoa=" + pessoa + "]";
    }
    

}

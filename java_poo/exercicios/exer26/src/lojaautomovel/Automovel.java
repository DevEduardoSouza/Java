package lojaautomovel;
public class Automovel {
    private String marca, modelo;
    private int ano, quilometragem;

    public Automovel(String marca, String modelo, int ano, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }
    public void precoManutacao() {
        if(quilometragem > 1000){
            System.out.println("Preco: R$ 359");
        }else if(quilometragem > 500){
            System.out.println("Preco:  R$ 159");
        }else{
            System.out.println("Preco:  R$ 50");
        }
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
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    @Override
    public String toString() {
        return "Automovel [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", quilometragem=" + quilometragem
                + "]";
    }

    
}

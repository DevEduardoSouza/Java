public class Eletrodomestico{
    private String marca;
    private String modelo;
    private double consumoEneregetico;
    private boolean isLigada;

    public Eletrodomestico(String marca, String modelo, double consumoEneregetico){
        setMarca(marca);
        setModelo(modelo);
        setConsumoEnergetico(consumoEneregetico);
        this.isLigada = false;
    }

    private void setConsumoEnergetico(double consumoEneregetico){
        this.consumoEneregetico =  consumoEneregetico;
    }
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private void setMarca(String marca) {
        this.marca = marca;
    }
    public void ligar(){
        isLigada = true;
    }

    public void desligar(){
        isLigada = false;
    }

    public void status(){
        System.out.printf("Marca: %s\nModelo: %s\nConsumo energetico: %.1f Kw\nEstá ligado? %b", marca, modelo, consumoEneregetico,isLigada);
    }


}
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public void areaCirculo(){
        double area;
        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area é " + area);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }
    
}

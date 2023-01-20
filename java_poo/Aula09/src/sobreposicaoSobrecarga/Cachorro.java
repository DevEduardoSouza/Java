package sobreposicaoSobrecarga;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au, Au, Au");
    }

    // Sobrecarga

    
    public void reagir(String frase){
        if(frase == "Ola"){
            System.out.println("Ficou feliz");
        }else{
            System.out.println("Bravo");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
        
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Feliz");
        }else{
            System.out.println("Bravo");
        }

    }
    public void reagir(int idade, double peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }

    }
}

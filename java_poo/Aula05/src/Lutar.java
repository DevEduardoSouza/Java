import java.util.Random;

public class Lutar {
    private Lutador l1, l2;
    private int raunds;
    private boolean aprovada;
    Random random = new Random();


    public Lutar(){
        setAprovado(false);
    }


    public void marcaLuta(Lutador l1, Lutador l2) {
        if(l1 != l2 && l1.getCategory() == l2.getCategory()){
            setAprovado(true);
            setLutador1(l1);
            setLutador2(l2);
            System.out.println("Luta marcada com sucesso");
        }else{
            setAprovado(false);
            setLutador1(null);
            setLutador2(null);
            System.out.println("Luta não pode ser marcada");
        }
    }

    private int gerarGanhador(){
        return random.nextInt(3);
    }

    public void luta() {

        if(getAprovado()){
            switch (gerarGanhador()) {
                case 0:
                    System.out.println("Empate entre os lutadores");
                    l1.empatarLuta();
                    l2.empatarLuta();
                    break;
                case 1:
                    System.out.printf("O grade vencedor foi...... %s\n", l1.getName());
                    l1.ganharLuta();
                    l2.perdeLuta();
                    break;
                case 2:
                    System.out.printf("O grade vencedor foi...... %s\n", l2.getName());
                    l2.ganharLuta();
                    l1.perdeLuta();
                    break;
            
                default: System.out.println("Erro");
                    break;
            }
        }else{
            System.out.println("Luta não está aprovada");
        }
       
    }

    private void setLutador1(Lutador lutador1){
        this.l1 = lutador1;
    }
    private void setLutador2(Lutador lutador2){
        this.l2 = lutador2;
    }

    private void setAprovado(boolean aprovada){
        this.aprovada = aprovada;
    }
    private boolean getAprovado(){
        return aprovada;
    }

}

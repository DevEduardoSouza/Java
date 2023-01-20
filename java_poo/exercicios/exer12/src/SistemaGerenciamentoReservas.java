
public class SistemaGerenciamentoReservas {
    private int idPasagem;
    private String hotel, carro;
    private double precoCarro;
    private boolean resevado;


    public SistemaGerenciamentoReservas(int idPasagem, String hotel, String carro, double precoCarro) {
        this.idPasagem = idPasagem;
        this.hotel = hotel;
        this.carro = carro;
        this.precoCarro = precoCarro;
        setResevado(false);
    }

    public void reservar(){
        if(!isResevado()){
            setResevado(true);
            System.out.printf("%s resevado com sucesso\n", getHotel());
        }else{
            System.out.println("Já está resevado resevado");
        }
    }

    public void cancelar(){
        if(isResevado()){
            setResevado(false);
            System.out.println("Cancelado com sucesso");
        }else{
            System.out.println("Sem hoteis resevados");
        }
    }

    public void verificarReseva() {
        if(isResevado()){
            System.out.println("Está resevado");
        }else{
            System.out.println("Não resevamento de hotel");
        }
    }
    
    public boolean isResevado() {
        return resevado;
    }

    public void setResevado(boolean resevado) {
        this.resevado = resevado;
    }

    public int getIdPasagem() {
        return idPasagem;
    }
    public void setIdPasagem(int idPasagem) {
        this.idPasagem = idPasagem;
    }
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public double getPrecoCarro() {
        return precoCarro;
    }
    public void setPrecoCarro(double precoCarro) {
        this.precoCarro = precoCarro;
    }
    
    
}
public class App {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Eduardo", "m", 20);
        
        System.out.println( aluno.toString() );
        aluno.pagarMensalidade();
        Bolsista bolsista = new Bolsista("Souza", "M", 25);
        System.out.println( aluno.toString() );
        bolsista.pagarMensalidade();


     
        
    }
    
}

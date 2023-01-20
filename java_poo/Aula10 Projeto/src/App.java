
public class App {
    public static void main(String[] args){
       
        Video[] v = new Video[3];
        v[0] = new Video("Aula de php");
        v[1] = new Video("Programando em Java");
        v[2] = new Video("Aula de Banco de dados");

        Aluno[] aluno = new Aluno[3];
        aluno[0] = new Aluno("Eduardo", 20, "M", "Eduardo4545");
        
        // System.out.println(aluno[0].toString());

        Visualizacao vi = new Visualizacao(aluno[0], v[0]);
        System.out.println(vi.toString());
        vi.avaliar();
        System.out.println(vi.toString());

      
        
    }
    
}

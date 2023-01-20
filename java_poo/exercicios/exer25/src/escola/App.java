package escola;
// Crie uma classe "Aluno" com atributos para nome, matrícula e notas em diferentes disciplinas. Crie métodos para calcular a média final e verifique se o aluno foi aprovado
public class App {
    public static void main(String[] args) throws Exception {
  
        Alunos aluno = new Alunos("Eduardo", "15151aa", 9.8, 7.6);
        aluno.isAprovado();

       
    }
}

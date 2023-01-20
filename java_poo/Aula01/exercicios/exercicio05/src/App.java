// Crie uma classe "Aluno" com atributos para nome, matrícula e notas. Crie um método para calcular a média das notas do aluno.

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.nome = "Eduardo";
        aluno.matricula= "ABD4574DD";
        aluno.n1 = 9.9;
        aluno.n2 = 10;
        aluno.n3= 8.8;

        aluno.mediaNotas();
    }
}

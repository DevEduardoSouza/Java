public class Aluno extends Pessoa {
    private String matricula, curso;

    

    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade); //Super smpre tem que está na primeira linha
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

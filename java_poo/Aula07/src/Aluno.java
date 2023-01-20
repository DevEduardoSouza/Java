public class Aluno extends Pessoa {
    private String matricula, curso;
    
 
    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade");
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

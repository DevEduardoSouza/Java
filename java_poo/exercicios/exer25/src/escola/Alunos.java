package escola;
public class Alunos {
    private String nome, matricula;
    private double notaMatematica, notaPortugues;
    
    public Alunos(String nome, String matricula, double notaMatematica, double notaPortugues) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaMatematica = notaMatematica;
        this.notaPortugues = notaPortugues;
    }

    public void isAprovado() {
        double media = (notaMatematica + notaPortugues ) / 2;
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    @Override
    public String toString() {
        return "Alunos [nome=" + nome + ", matricula=" + matricula + ", notaMatematica=" + notaMatematica
                + ", notaPortugues=" + notaPortugues + "]";
    }

    
}

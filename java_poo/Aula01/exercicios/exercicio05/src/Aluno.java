public class Aluno {
    String nome;
    String matricula;
    double n1, n2, n3, media;


    void mediaNotas(){
        this.media = (this.n1 + this.n2 + this.n3) / 3.0;
        System.out.printf("\nMédia de %s é %.1f", this.nome, this.media);
    }

}

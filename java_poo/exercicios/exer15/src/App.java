
public class App {
    public static void main(String[] args) throws Exception {

        Leitor[] leitor = new Leitor[2];
        Livro[] livro = new Livro[3];

        leitor[0] = new Leitor("Eduardo", "M", 21);
        leitor[1] = new Leitor("Maria", "F", 22);


        livro[0] = new Livro(leitor[0], "A lua", "José roshf", 150);
        livro[1] = new Livro(leitor[1], "Java Básico", "Marcia trindade", 350);
        livro[2] = new Livro(leitor[1], "Java Intermediário", "Marcia trindade", 450);


        livro[0].abrir();
        livro[0].folhear(100);
        livro[0].avancaPag();
        livro[0].avancaPag();
        livro[0].avancaPag();
        livro[0].voltarPag();

        livro[0].status();


        livro[1].abrir();
        livro[1].folhear(300);
        livro[1].voltarPag();
        livro[1].status();
       
    }
}

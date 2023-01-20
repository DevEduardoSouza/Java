// Herança

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Maria", "f", 25);
        Aluno p2 = new Aluno("Eduardo", "m", 20);
        Professor p3 = new Professor("João josef", "m", 55);
        Funcionario p4 = new Funcionario("Camila", "f", 20);

       


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}

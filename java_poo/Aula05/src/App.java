public class App {
    public static void main(String[] args) throws Exception {

        Lutador[] lutador = new Lutador[6];
        lutador[0] = new Lutador("José Marreta", "Brazil", 25, 1.81, 69, 5, 1, 2);
        lutador[1] = new Lutador("Vasconcelos bruto", "Colombia", 29, 1.78, 65, 10, 4, 3);
        lutador[2] = new Lutador("Petterson James", "EUA", 29, 1.85, 90.5, 8, 5, 2);
        lutador[3] = new Lutador("Kovacic", "Croatia", 26, 1.77, 85.8, 10, 1, 1);
        lutador[4] = new Lutador("Abudarhil", "Saudia Arabia", 23, 1.91, 111.8, 15, 6, 2);
        lutador[5] = new Lutador("Alisson Matador", "Brazil", 28, 1.96, 117.5, 20, 2, 2);


        Lutar lutar  = new Lutar();
        lutar.marcaLuta(lutador[0], lutador[1]);

        lutador[0].status();
        lutador[1].status();
        lutar.luta();
        lutador[0].status();
        lutador[1].status();

    }
}

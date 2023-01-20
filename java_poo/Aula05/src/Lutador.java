public class Lutador implements uiUFC{

    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victory;
    private int defeats;
    private int ties;

    // Constructor
    public Lutador(String name, String nationality, int age, double height, double weight, int victory, int defeats, int ties){
        this.setName(name);
        this.setNationality(nationality);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setVictory(victory);
        this.setDefeats(defeats);
        this.setTies(ties);
    }

    @Override
    public void aprensetar() {
        System.out.printf("Name: %s\nNationality: %s\nAge: %d\nHeight: %.2f\nWeight: %.1f\nCategory: %s\nVictories: %d\nDefeats: %d\nTies: %d\n", name, nationality, age, height, weight, category, victory, defeats, ties);
        System.out.println("-----------------------------\n");        
    }

    @Override
    public void status() {
        System.out.printf("Victories: %d\nDefeats: %d\nTies: %d\n", victory, defeats, ties);
    }

    @Override
    public void ganharLuta() {
        setVictory(getVictory() + 1);
    }

    @Override
    public void perdeLuta() {
        setDefeats(getDefeats() + 1);
    }

    @Override
    public void empatarLuta() {
        setTies(getTies() + 1);
    }

    // gettres e settres

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getNationality(){
        return nationality;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        this.weight = weight;
        setCategory();
    }
    public double getWeight(){
        return weight;
    }
    private void setCategory(){

        if(getWeight() >= 100 ){
            category = "Heavy weight";
        }else if(getWeight() >= 70){
            category = "Avarege weight";
        }else{
            category = "Lightweight";
        }
    }

    public String getCategory(){
        return category;
    }
    public void setVictory(int victory){
        this.victory = victory;
    }
    public int getVictory() {
        return victory;
    }
    public void setDefeats(int defeats){
        this.defeats = defeats;
    }
    public int getDefeats(){
        return defeats;
    }
    public void setTies(int ties){
        this.ties = ties;
    }
    public int getTies(){
        return ties;
    }
}

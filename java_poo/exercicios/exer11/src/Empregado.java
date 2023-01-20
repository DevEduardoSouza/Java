public class Empregado {
    private String nome, carga, departamento, endereco;
    private double salario;

    public Empregado(String nome, String carga, String departamento, String endereco, double salario) {
        this.setNome(nome);
        this.setCarga(carga);
        this.setDepartamento(departamento);
        this.setEndereco(endereco);
        this.setSalario(salario);
    }

    public void status(){
        System.out.println("****** Empregado ********");
        System.out.printf("\nNome: %s\nCargo: %s\nDepartamento: %s\nEndereço: %s\nSlário: %.2f\n",getNome(), getCarga(), getDepartamento(), getEndereco(), getSalario());
        System.out.println("---------------------------------");
    }

    public void todoTempoTrabalhado(int meses){

        // 36 h por semana
        int resultado;
        resultado = meses * 36 * 4;
        System.out.printf("Você já trabalho %d horas na empresa", resultado);
      
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCarga() {
        return carga;
    }
    public void setCarga(String carga) {
        this.carga = carga;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}

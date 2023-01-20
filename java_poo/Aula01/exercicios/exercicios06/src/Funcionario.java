public class Funcionario {
    String nome;
    double salario;
    int tempoNaEmpresa;

    void aumentarSalario(){
        if(this.tempoNaEmpresa >= 36){
            this.salario += (this.salario * 30) / 100;
        } else if(this.tempoNaEmpresa>=24){
            this.salario += (this.salario * 20) / 100;
        } else{
            this.salario += (this.salario * 10) / 100;
        }
    }


}

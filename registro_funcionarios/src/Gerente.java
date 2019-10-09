public class Gerente extends Funcionario {
    public Gerente(){
    }

    public double calculaBonifacacao(){
        this.bonifacao = ((this.salario * 0.30) + 1000);
        return this.bonifacao;
    }
}

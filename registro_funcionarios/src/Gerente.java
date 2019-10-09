public class Gerente extends Funcionario {
    public Gerente(){
    }
    
    @Override
    public double calculaBonifacacao(){
        this.bonifacao = ((this.salario * 0.30) + 1000);
        return this.bonifacao;
    }
}

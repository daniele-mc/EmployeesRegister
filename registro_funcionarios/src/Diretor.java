public class Diretor extends Funcionario {
    public Diretor(){
    }
    
    @Override
    public double calculaBonifacacao(){
        this.bonifacao = ((this.salario * 0.40) + 2000);
        return this.bonifacao;
    }
}

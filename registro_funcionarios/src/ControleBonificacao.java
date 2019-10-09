public class ControleBonificacao {
    public double totalBonificacoes = 0;

    public ControleBonificacao(){
    }

    public void registrarBonificacoes(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes() {
        return this.totalBonificacoes;
    }
}

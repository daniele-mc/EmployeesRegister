abstract class Funcionario {
    String nome;
    String cpf;
    double salario = 0.0;
    double bonifacao;
    String funcao;

    public Funcionario(){
    }

    public double calculaBonifacacao(){
        this.bonifacao = this.salario * 0.20;
        return this.bonifacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        calculaBonifacacao();
        return bonifacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class DAOFuncionario{

    ArrayList<Funcionario> listafunc = new ArrayList<Funcionario>();
    Scanner scanner = new Scanner(System.in);

    public DAOFuncionario() {
            }

    public void cadastrarFuncionario(Funcionario funcionario){

        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite o cpf do funcionario: ");
        funcionario.setCpf(scanner.nextLine());

        System.out.println("Digite o salario do funcionario: ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

        funcionario.calculaBonifacacao();

        listafunc.add(funcionario);
    }

    public void listarFuncionario(){
        ControleBonificacao controle = new ControleBonificacao();

        for (Funcionario x: listafunc){
            System.out.println("Nome: " + x.getNome() + " - " + x.getFuncao());
            System.out.println("CPF: " + x.getCpf());
            System.out.println("Salario: " + x.getSalario());
            System.out.println("Bonos: " + x.getBonificacao());
            controle.registrarBonificacoes(x);
        }
        System.out.println("Total das Bonificacoes: " + controle.getTotalBonificacoes());
    }
}

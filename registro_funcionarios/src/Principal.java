import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        DAOFuncionario c = new DAOFuncionario();
        int opcao = 1;
        int resposta;
        Scanner scanner = new Scanner(System.in);
        while ((opcao == 1)||(opcao == 2)){
            System.out.println("\nQual operaçao deseja realizar");
            System.out.println("Digite 1 para cadastrar funcionario");
            System.out.println("Digite 2 para listar funcionarios");

            opcao = (scanner.nextInt());

            if (opcao == 1) {

                System.out.println("Digite a função do funcionario(1-secretario/2-gerente/3-diretor): ");
                resposta = scanner.nextInt();
                switch (resposta){
                    case 1:
                        Funcionario func = new Secretaria();
                        func.setFuncao("Secretario");
                        c.cadastrarFuncionario(func);
                        break;
                    case 2:
                        func = new Gerente();
                        func.setFuncao("Gerente");
                        c.cadastrarFuncionario(func);
                        break;
                    case 3:
                        func = new Diretor();
                        func.setFuncao("Diretor");
                        c.cadastrarFuncionario(func);
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;

                }

            }
            else if (opcao == 2) {
                c.listarFuncionario();
            }
        }
    }
}

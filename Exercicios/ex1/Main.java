package Exercicios.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FuncionarioAdministrativo funcionarioAdministrativo = new FuncionarioAdministrativo();
        FuncionarioOperacional funcionarioOperacional = new FuncionarioOperacional();
        int opcoes = 0;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1-Cadastrar Funcionário");
            System.out.println("2-Listar Todos os funcionários");
            System.out.println("3-Sair");
            opcoes = scanner.nextInt();
            scanner.nextLine();
            switch (opcoes) {
                case 1:
                    System.out.println("1-Funcionário Operacional\n2- Funcionário Administrativo?");
                    int opcaoTipoFuncionario = Integer.parseInt(scanner.next());
                    System.out.println("Digite o nome do funcionário: ");
                    if(opcaoTipoFuncionario == 1){
                        funcionarioOperacional.nome = scanner.next();
                        System.out.println("Digite o cargo do funcionário: ");
                        funcionarioOperacional.cargo = scanner.next();
                        System.out.println("Digite o salário do funcionário: ");
                        funcionarioOperacional.salario = scanner.nextDouble();
                        funcionarios.add(funcionarioOperacional);
                    }else{
                        funcionarioAdministrativo.nome = scanner.next();
                        System.out.println("Digite o cargo do funcionário: ");
                        funcionarioAdministrativo.cargo = scanner.next();
                        System.out.println("Digite o salário do funcionário: ");
                        funcionarioAdministrativo.salario = scanner.nextDouble();
                        funcionarios.add(funcionarioAdministrativo);
                    }
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println(" --- FUNCIONÁRIOS CADASTRADOS --- ");
                    System.out.println("===================================");
                    for (Funcionario mostrarFuncionarios : funcionarios) {
                        mostrarFuncionarios.exibirDados();
                    }
                    break;
                case 3:
                    System.out.println("saindo...");
                    break;
            }
        }while(opcoes!=3);
    }
}
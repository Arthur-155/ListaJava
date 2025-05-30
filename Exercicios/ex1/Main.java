package Exercicios.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario() {
            @Override
            public double calcularBonificacao() {
                return 0;
            }
        };
        int opcoes = 0;
        ArrayList<String> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1-Cadastrar Funcionário");
            System.out.println("2-Listar Todos os funcionários");
            System.out.println("3-Sair");
            opcoes = scanner.nextInt();
            scanner.nextLine();
            switch (opcoes) {
                case 1:
                    System.out.println("É um 1-funcionário Operacional ou 2-Administrativo?");
                    int opcaoTipoFuncionario = Integer.parseInt(scanner.next());
                    System.out.println("Digite o nome do funcionário: ");
                    funcionario.nome = scanner.next();
                    System.out.println("Digite o cargo do funcionário: ");
                    funcionario.cargo = scanner.next();
                    System.out.println("Digite o salário do funcionário: ");
                    funcionario.salario = scanner.nextDouble();

                    funcionarios.add("Nome: " + funcionario.nome);
                    funcionarios.add("Cargo: " + funcionario.cargo);
                    funcionarios.add(String.valueOf("Salário: " + funcionario.salario));
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println(" --- FUNCIONÁRIOS CADASTRADOS --- ");
                    System.out.println("===================================");
                    for (String mostrarFuncionarios : funcionarios) {
                        System.out.println(mostrarFuncionarios);
                    }
                    break;
                case 3:
                    System.out.println("saindo...");
                    break;
            }
        }while(opcoes!=3);
    }
}
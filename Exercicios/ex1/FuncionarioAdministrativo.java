package Exercicios.ex1;

//• FuncionarioAdministrativo: recebe uma bonificação de 20% do salário.
//• FuncionarioOperacional: recebe uma bonificação de 10% do salário.
//Cada subclasse deve implementar o metodo calcularBonificacao().
//Adapte também o metodo exibirDados() para exibir a bonificação junto com os demais dados.

public class FuncionarioAdministrativo extends  Funcionario implements Treinavel{
    double bonificacao;

    @Override
    public double calcularBonificacao(double bonificacao) {
        bonificacao = salario*1.20;
        return bonificacao;
    }

    @Override
    public void exibirDados() {
        System.out.println(" --- FUNCIONÁRIO ADMINISTRATIVO --- ");
        super.exibirDados();
        System.out.println("Calculo com bonificação: " + calcularBonificacao(bonificacao));
        realizarTreinamento();
        System.out.println(" --- FIM FUNCIONÁRIO OPERACIONAL --- ");
    }

    @Override
    public void realizarTreinamento() {
        System.out.println("Treinamento do Funcionário Administrativo realizado!");
    }
}

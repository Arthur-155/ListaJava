package Exercicios.ex1;

//• FuncionarioAdministrativo: recebe uma bonificação de 20% do salário.
//• FuncionarioOperacional: recebe uma bonificação de 10% do salário.
//Cada subclasse deve implementar o metodo calcularBonificacao().
//Adapte também o metodo exibirDados() para exibir a bonificação junto com os demais dados.

public class FuncionarioAdministrativo extends  Funcionario{
    double bonificacao;

    @Override
    public double calcularBonificacao() {

        bonificacao = salario*1.20;
        return bonificacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Calculo com bonificação: " + bonificacao);
    }
}

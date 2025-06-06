package Exercicios.ex1;

//• FuncionarioOperacional: recebe uma bonificação de 10% do salário.
//Cada subclasse deve implementar o metodo calcularBonificacao().
//Adapte também o metodo exibirDados() para exibir a bonificação junto com os demais dados.

public class FuncionarioOperacional extends Funcionario implements Treinavel{
    double bonificacaoOperacional;

    @Override
    public void realizarTreinamento() {
        System.out.println("Treinamento do Funcionário Operacional realizado!");
    }

    @Override
    public double calcularBonificacao(double bonificacaoOperacional) {
        bonificacaoOperacional = salario*1.10;
        return bonificacaoOperacional;
    }

    @Override
    public void exibirDados() {
        System.out.println(" --- FUNCIONÁRIO OPERACIONAL --- ");
        super.exibirDados();
        System.out.println("Salário pós Bonificação: " + calcularBonificacao(bonificacaoOperacional));
        realizarTreinamento();
        System.out.println(" --- FIM FUNCIONÁRIO OPERACIONAL --- ");
    }
}

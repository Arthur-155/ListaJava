package Exercicios.ex1;

//O RH agora precisa diferenciar entre funcionários administrativos e operacionais, que possuem
//comportamentos distintos.
//Para isso, transforme a classe Funcionario em uma classe abstrata com:
//• O metodo abstrato calcularBonificacao(), que retorna um double.
//Crie duas subclasses:
//• FuncionarioAdministrativo: recebe uma bonificação de 20% do salário.
//• FuncionarioOperacional: recebe uma bonificação de 10% do salário.
//Cada subclasse deve implementar o metodo calcularBonificacao().
//Adapte também o metodo exibirDados() para exibir a bonificação junto com os demais dados.

public abstract class Funcionario {
    String nome;
    String cargo;
    double salario;

    public abstract double calcularBonificacao(double bonificacao);

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(){

    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("salario: " + salario);
    }
}

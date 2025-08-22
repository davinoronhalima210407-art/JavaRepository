//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();
        f1.nome = "Joao";
        f1.cargo = "Analista de dados";
        f1.salario = 3250;
        f1.exibirInformacoes();
        f1.aumentarSalario(10);

        Funcionarios f2 = new Funcionarios();
        f2.nome = "Zé";
        f2.cargo = "Desenvolvedor";
        f2.salario = 1575;
        f2.exibirInformacoes();
        f2.aumentarSalario(20);
    }
}
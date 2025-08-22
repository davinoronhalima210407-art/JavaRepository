public class Funcionarios {

    String nome;

    String cargo;

    double salario;

    void aumentarSalario(double percentual){
        salario+= salario*(percentual/100);
        System.out.println("Salário após o reajuste: "+ salario);
    }
    void exibirInformacoes(){
        System.out.println("\n /Nome: "+ nome +  "/Cargo: "+cargo+"/Salario: "+salario+ "/");
    }
}

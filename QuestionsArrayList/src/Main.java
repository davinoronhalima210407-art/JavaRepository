import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        System.out.println("Quantos funcionários deseja cadastrar? ");
        int n = input.nextInt();
        input.nextLine();
        double somador = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Funcionário "+ (i+1) + ":");
            System.out.println("Nome: ");
            String nome  = input.next();
            System.out.println("Salario: ");
            double salario = input.nextDouble();
            funcionarios.add(new Funcionarios(nome,salario));
            somador += funcionarios.get(i).getSalario();
        }
            Funcionarios maiorsalario = funcionarios.get(0);
        for(int i = 0;i<funcionarios.size();i++){
            if(funcionarios.get(i).getSalario() > maiorsalario.getSalario()){
                maiorsalario = funcionarios.get(i);
            }
        }
        System.out.println("Salário Médio: "+ somador/n);
        System.out.println("Maior salário: "+ maiorsalario.getNome());
    }
}
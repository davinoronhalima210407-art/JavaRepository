import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos integrantes: ");
        int n = scanner.nextInt();
        int somador = 0;
        Pessoas[] pessoas = new Pessoas[n];

        for(int i = 0; i<n; i++){
            scanner.nextLine();
            System.out.println("Qual o nome do integrante "+ (i+1)+ ":");
            String nome = scanner.next();
            System.out.println("Qual a idade do integrant "+ (i+1)+ ":");
            int idade = scanner.nextInt();
            somador+=idade;
            pessoas[i] = new Pessoas(nome,idade);
        }
        for(Pessoas pessoa : pessoas){
            System.out.println(pessoa);
        }
        System.out.println("Media da idade: "+ somador/n);
    }
}
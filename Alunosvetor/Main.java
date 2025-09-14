import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o numero de alunos na sala? ");
        int n = sc.nextInt();
        double notas = 0;
        Alunos[] alunos = new Alunos[n];

        for(int i = 0; i < alunos.length; i++){
            sc.nextLine();
            System.out.println("Qual o nome do aluno?");
            String nome = sc.next();
            System.out.println("Qual o nota? ");
            double nota = sc.nextDouble();
            alunos[i] = new Alunos(nome,nota);
            notas+=alunos[i].getNota();
        }
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("Media da turma: " + (notas/alunos.length));
        sc.close();
    }
}
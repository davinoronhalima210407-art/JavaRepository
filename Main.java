import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static double calcularMedia(ArrayList<Alunos> alunos){
            double soma = 0;
            for (Alunos aluno :alunos){
                soma+= aluno.nota;
            }
            return soma/ alunos.size();
        }
        public static Alunos melhoraluno(ArrayList<Alunos> alunos) {
            Alunos melhor = alunos.get(0);
            for (Alunos aluno : alunos) {
                if (aluno.nota > melhor.nota) {
                    melhor = aluno;
                }
            }
            return melhor;
        }
        public static void exibirAlunos(ArrayList<Alunos> alunos){
            for(Alunos aluno : alunos){
                System.out.println(aluno);
            }
        }

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Alunos> alunos = new ArrayList<>();

        System.out.println("Quantos alunos na sala? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n;i++){
            System.out.println("Qual o nome do aluno? ");
            String nome =  sc.nextLine();
            System.out.println("Qual a nota? ");
            int nota = sc.nextInt();
            sc.nextLine();
            alunos.add(new Alunos(nome,nota));
        }
        System.out.println("\n Lista de alunos: ");
        exibirAlunos(alunos);
        System.out.println("\n Media dos alunos: " + calcularMedia(alunos));
        System.out.println("\n Melhor aluno: "+ melhoraluno(alunos));

    }
}

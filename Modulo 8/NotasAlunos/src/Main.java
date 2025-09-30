import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Digite seu nome: ");
        student.name = sc.nextLine();

        System.out.println("Digite as notas dos 3 trimestres respectivamente: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        if(student.finalGrade() < 60){
            System.out.printf("Final grade: %f.2",student.finalGrade());
            System.out.println("Failed");
            System.out.println("Missing "+ student.missingPoints());
        }
        else {
            System.out.printf("Final grade: %.2f",student.finalGrade());
            System.out.println("Pass");
        }

    }
}
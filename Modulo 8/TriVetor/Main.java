import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o numero de triangulos? ");
        int n =  sc.nextInt();

        Triangle[] tri = new Triangle[n];

        for(int i=0;i<n;i++){
            System.out.println("Digite o lado a do triângulo "+ (i+1));
            double ladoa = sc.nextDouble();
            System.out.println("Digite o lado b do triângulo "+ (i+1));
            double ladob = sc.nextDouble();
            System.out.println("Digite o lado c do triângulo "+ (i+1));
            double ladoc = sc.nextDouble();
            tri[i] = new Triangle(ladoa,ladob,ladoc);
            tri[i].FormulaHeron(ladoa,ladob,ladoc);
        }
        for(Triangle t:tri){
            System.out.println(t);
        }

    }
}
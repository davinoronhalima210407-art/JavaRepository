import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.println("Digite a temperatura em celsius: ");
            double tempC = sc.nextDouble();
            double tempF = (9 * tempC / 5) + 32;
            System.out.printf("Equivalente a Farenheit: %.1f%n ",tempF);
            System.out.println("Deseja continuar(s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}
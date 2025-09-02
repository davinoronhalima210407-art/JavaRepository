import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ExtremamenteBasico numero = new ExtremamenteBasico();

        numero.n1 = sc.nextInt();
        numero.n2 = sc.nextInt();

        numero.soma();

        System.out.printf("X = %d%n", numero.soma);

            }
}
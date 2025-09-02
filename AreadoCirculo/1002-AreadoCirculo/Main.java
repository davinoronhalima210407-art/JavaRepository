import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circulo c1 = new Circulo(0);

        c1.setRaio(sc.nextDouble());

        c1.CalcularArea();

        c1.exibirinfo();

        Circulo c2 = new Circulo(0);

        c2.setRaio(sc.nextDouble());

        c2.CalcularArea();

        c2.exibirinfo();

        sc.close();
    }
}
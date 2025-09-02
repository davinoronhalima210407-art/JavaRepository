import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Media m1 = new Media(0.00,0.00);
        m1.setN1(input.nextDouble());
        m1.setN2(input.nextDouble());

        m1.CalcularMedia();

        m1.exibirinfo();

        input.close();
        }
    }

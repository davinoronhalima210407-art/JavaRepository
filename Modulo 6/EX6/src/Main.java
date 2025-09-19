import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double x=0,y=0,z = 0;
        for (int i = 1; i <= 5; i++) {
            x = input.nextDouble();
            y = input.nextDouble();
            z = input.nextDouble();
            double media = (x*2+y*3+z*5)/10;
            System.out.printf("%1.f", media);
        }
        input.close();
    }

}
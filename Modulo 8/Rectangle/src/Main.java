import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rectangle r1 = new Rectangle(0,0);
        System.out.println("Enter rectangle width and height: ");
        r1.height = input.nextDouble();
        r1.widght = input.nextDouble();
        System.out.printf("AREA = %.1f ", r1.Area());
        System.out.printf("PERIMETER = %.1f ", r1.Perimeter());
        System.out.printf("DIAGONAL = %.1f ", r1.Diagonal());
    }
}
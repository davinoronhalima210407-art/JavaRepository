import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int[] numeros;
        numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("-----Resultado-----");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= 0) {
                System.out.println("X [" + i + "] =  " + numeros[i]);
            }
        }
    }
}
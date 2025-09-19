import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        senha = sc.nextInt();

        while (senha != 2002){
            if (senha != 2002){
            senha = sc.nextInt();
                System.out.println("Acesso negado!");
        }
    }
        System.out.println("Acesso permitido!");
        sc.close();
}}
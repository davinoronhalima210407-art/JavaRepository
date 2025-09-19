import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int opcao = 0;

        while (opcao != 4){
            opcao = sc.nextInt();
            if(opcao == 1){
                alcool++;
            }else if(opcao == 2){
                gasolina++;
            }else if(opcao == 3){
                diesel++;
            }else if(opcao == 4){
                System.out.println("Muito obrigado!");
            }

        }System.out.println("Álcool = "+alcool);
        System.out.println("Gasolina = "+gasolina);
        System.out.println("Diesel = "+diesel);

    }
}
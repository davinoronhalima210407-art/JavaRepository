import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X,Y = 0;
        boolean nula = false;

        while(nula == false){
            X =  sc.nextInt();
            Y =  sc.nextInt();
            if(X == 0 || Y == 0){
                nula = true;
            }
            else if(X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            else if(X < 0 && Y > 0){
                System.out.println("segundo");
            }else if(X < 0 && Y < 0){
                System.out.println("terceiro");
            }else if(X > 0 && Y < 0){
                System.out.println("quarto");
            }
        }
    }
}
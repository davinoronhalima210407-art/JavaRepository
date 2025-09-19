import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X =  sc.nextInt();

        for(int i = 0; i < X; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}